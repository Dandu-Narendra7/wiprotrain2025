package com.wipro.User.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "please provide your username")
	@Size(min = 3, max = 50)
	@Column
	private String firstName;
	
	@NotBlank(message = "please provide your username")
	@Size(min = 3, max = 50)
	@Column
	private String lastName;

	@NotBlank(message = "please provide your email")
	@Email(message = "Email should be valid")
	@Column
	private String email;

	@NotBlank(message = "Please enter your password")
	@Size(min = 6, message = "Password must be at least 6 characters")
	@Column
	private String passWord;

	@Size(max = 100, message = "Name cannot exceed 100 characters")
	@Column
	private String name;

	
	@Column
	private String address;
	 
	
	@Column
	String salt;
	
	

	@Enumerated(EnumType.STRING)
	@Column
	private Role role = Role.USER;

	public User() {
	}

	public User(String firstName,String lastName, String email, String passWord, String name, Role role) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.email = email;
		this.passWord = passWord;
		this.name = name;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassword(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	public enum Role {
		ADMIN,
		USER

	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + passWord + ", name=" + name + ", address=" + address + ", salt=" + salt + "]";
	}





	

}