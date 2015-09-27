package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import domain.Author;
import domain.Book;
import domain.SelectionSort;

public class Driver {

	public static void main(String[] args) {
		
		// Extract book information from text files into array of Book objects
		Book[] books100 = extractBooks("googleBooks100.txt", 100);
		Book[] books1000 = extractBooks("googleBooks1000.txt", 1000);
		Book[] books10000 = extractBooks("googleBooks10000.txt", 10000);	
			
		// Determine the duration to sort 100 books
		long startTime100 = System.nanoTime();
		SelectionSort.byTitle(books100);
		long endTime100 = System.nanoTime();
		long duration100 = (endTime100 - startTime100) / 1000000; // Convert to milliseconds
		System.out.println("Execution time: " + duration100);
		
		// Determine the duration to sort 1000 books
		long startTime1000 = System.nanoTime();
		SelectionSort.byTitle(books1000);
		long endTime1000 = System.nanoTime();
		long duration1000 = (endTime1000 - startTime1000) / 1000000; // Convert to milliseconds
		System.out.println("Execution time: " + duration1000);
		
		// Determine the duration to sort 10000 books
		long startTime10000 = System.nanoTime();
		SelectionSort.byTitle(books10000);
		long endTime10000 = System.nanoTime();
		long duration10000 = (endTime10000 - startTime10000) / 1000000; // Convert to milliseconds
		System.out.println("Execution time: " + duration10000);
	}
	
	private static Book[] extractBooks(String fileName, int size) {
		Book[] books = new Book[size];

		BufferedReader br = null;
		int count = 0;
		try {
			br = new BufferedReader(new FileReader(fileName));
			
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		       
		        String[] bookComponents = line.split("\\*");
		        String title = bookComponents[0];
		        String[] authorNames = bookComponents[1].split(" ");
		        String lastName = authorNames[authorNames.length-1];
		        String firstName = "";
		        for(int i = 0; i < authorNames.length-1; i++) {
		        	firstName += authorNames[i] + " ";
		        }
		        firstName = firstName.trim();
		        int numberPages = Integer.parseInt(bookComponents[2]);
		        books[count] = new Book(title, new Author(firstName, lastName), numberPages);
		        
			    count++;
	        	line = br.readLine();
		    }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return books;
	}
}

