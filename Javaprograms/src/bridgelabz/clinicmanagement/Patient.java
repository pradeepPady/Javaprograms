package bridgelabz.clinicmanagement;

public class Patient {
private String name;
private int id;

private int mobileNumber;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Patient [name=" + name + ", id=" + id + ", mobileNumber=" + mobileNumber + ", age=" + age + "]";
}
}
