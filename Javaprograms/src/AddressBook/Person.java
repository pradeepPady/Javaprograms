package AddressBook;

public class Person 
{
  String firstName;
  String lastName;
  String address;
  String city;
  String state;
  int zip;
  int phoneNumber;
   
public Person(String firstName, String lastName, String address, String state, String city, int zip,
		int phoneNumber) {
	  this.firstName=firstName;
	  this.lastName = lastName;
	  this.address = address;
	  this.city = city;
	  this.state = state;
	  this.zip = zip;
	  this.phoneNumber = phoneNumber;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
			+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
}
}
