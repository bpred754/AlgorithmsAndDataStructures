
  function Author(_firstName, _lastName) {

    var self = this;
    self.firstName = _firstName;
    self.lastName = _lastName;

    function compareTo(_author) {
      return self.lastName.localeCompare(_author.getLastName());
    }

    function getFirstName() {
      return self.firstName;
    }

    function getLastName() {
      return self.lastName;
    }

    return {
      compareTo: compareTo,
      getFirstName: getFirstName,
      getLastName: getLastName
    }
  }

  module.exports = Author;
