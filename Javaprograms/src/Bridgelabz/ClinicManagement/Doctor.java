package Bridgelabz.ClinicManagement;

public class Doctor {
	private String name;
	private int id;
	private String avalability;
	private String spcilization;
	private int count;
	private int numberOfPatients;
	public String getSpcilization() {
		return spcilization;
	}
	public void setSpcilization(String spcilization) {
		this.spcilization = spcilization;
	}
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
	public String getAvalability() {
		return avalability;
	}
	public void setAvalability(String avalability) {
		this.avalability = avalability;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getNumberOfPatients() {
		return numberOfPatients;
	}
	public void setNumberOfPatients(int numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", avalability=" + avalability + ", spcilization=" + spcilization
				+ ", count=" + count + ", numberOfPatients=" + numberOfPatients + "]";
	}
	
}
