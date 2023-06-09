package Example_01.HiberTube_01;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {
	
	@Id
	private int id;
	private String name;
	private String city;
	private Certificate certi;
	
	


	public Student1(int id, String name, String city, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}
	

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", city=" + city + ", certi=" + certi + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Certificate getCerti() {
		return certi;
	}


	public void setCerti(Certificate certi) {
		this.certi = certi;
	}


	
}
