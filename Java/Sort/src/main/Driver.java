package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import domain.Author;
import domain.Book;
import domain.Sort;

public class Driver {

	public static void main(String[] args) {
		
		Book[] books = new Book[100];
		
		// Read Text File
		BufferedReader br = null;
		int count = 0;
		try {
			br = new BufferedReader(new FileReader("googleBooks100.txt"));
			
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

				
		/*Random random = new Random();
		int[] input = new int[10];
		for(int i = 0; i < input.length; i++) {
			input[i] = random.nextInt(11);
		}
		printArray("input: ", input);
		
		int[] output = Sort.selectionSort(input);
		printArray("output: ", output);
		*/
		
		Book[] sortedBooks = Sort.selectionSortByTitle(books);
		
		
		for(int i = 0; i < sortedBooks.length; i++) {
			//Author author = sortedBooks[i].getAuthor();
			//System.out.println(author.getLastName()+ " " + author.getFirstName() + ", ");
			
			String title = sortedBooks[i].getTitle();
			System.out.println(title);
			
			//int numberPages = sortedBooks[i].getNumberPages();
			//System.out.println(numberPages);
		}
	}
	
	/*private static void printArray(String message, int[] array) {
		
		System.out.print(message);
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]);
			if(i < array.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}*/
}

