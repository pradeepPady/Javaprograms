package AddressBook;

public class Person 
{
  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private String state;
  private int zip;
  private int phoneNumber;
public Person() {
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
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
