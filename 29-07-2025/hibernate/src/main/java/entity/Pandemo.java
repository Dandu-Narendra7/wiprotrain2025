package entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pan")

public class Pandemo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="Holder_Name")
	String holderName;
	@Column(name="Date_Of_Birth")
	Date dob;
	@Column(name="Fathers_Name")
	String fathersName;
	
	
	public Pandemo(int id, String holderName, Date dob, String fathersName) {
		super();
		this.id=id;
		this.holderName = holderName;
		this.dob = dob;
		this.fathersName = fathersName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	@Override
	public String toString() {
		return "Pandemo [id=" + id + ", holderName=" + holderName + ", dob=" + dob + ", fathersName=" + fathersName
				+ "]";
	}
	
	

}
