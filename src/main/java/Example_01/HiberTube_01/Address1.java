package Example_01.HiberTube_01;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="student_address_1")
public class Address1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_id")
	private int addressId;
	@Column(length = 50, name = "Name")
	private String name;
	@Column(length = 50, name = "Street")
	private String street;
	@Column(length = 50, name = "City")
	private String city;
	@Column(length = 50, name = "IsOpen")
	private boolean isOpen;
	@Transient
	private double x;
	@Column(length = 50, name = "Added_Date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	@Lob
	private byte[] image;
	
	
	public Address1(int addressId, String name, String street, String city, boolean isOpen, double x, Date addedDate,
			byte[] image) {
		super();
		this.addressId = addressId;
		this.name = name;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}


	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public Date getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Address1 [addressId=" + addressId + ", name=" + name + ", street=" + street + ", city=" + city
				+ ", isOpen=" + isOpen + ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image)
				+ "]";
	}
	

}
