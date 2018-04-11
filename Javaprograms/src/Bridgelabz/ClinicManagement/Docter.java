package Bridgelabz.ClinicManagement;

public class Docter {
	private String name;
	private int id;
	private String avalability;
	private String spcilization;
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
	@Override
	public String toString() {
		return "Docter [name=" + name + ", id=" + id + ", avalability=" + avalability + "]";
	}
	
}
