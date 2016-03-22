
  function Author(_firstName, _lastName) {

    var self = this;
    self.firstName = _firstName;
    self.lastName = _lastName;

    function getFirstName() {
      return self.firstName;
    }

    function getLastName() {
      return self.lastName;
    }

    return {
      getFirstName: getFirstName,
      getLastName: getLastName
    }
  }

  module.exports = Author;
