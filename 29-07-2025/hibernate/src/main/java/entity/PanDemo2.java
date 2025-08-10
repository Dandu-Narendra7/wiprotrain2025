package entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pancard")

public class PanDemo2 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="Holder_Name")
	String holderName;
	
	@Column(name="Fathers_Name")
	String fathersName;
	
	
	public PanDemo2(int id, String holderName, String fathersName) {
		super();
		this.id=id;
		this.holderName = holderName;
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
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	@Override
	public String toString() {
		return "Pandemo2 [id=" + id + ", holderName=" + holderName + ", fathersName=" + fathersName
				+ "]";
	}
	
	

}

}
