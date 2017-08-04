package com.basak.tracker.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@NotEmpty(message="User Name is required")
	@Size(min=2, max=30, message="Length of User Name should be between 2 to 30")
	private String username;
	
	@NotEmpty(message="email is required")
	@Email
	private String email;
	
	@NotEmpty(message="First Name is required")
	@Size(min=2, max=30, message="Length of First Name should be between 2 to 30")
	private String firstName;
	
	@NotEmpty(message="Last Name is required")
	@Size(min=2, max=30)
	private String lastName;
	
	@NotEmpty(message="Password is required")
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})",
			 message="{user.password.policy}")
	private String password;
	
	@NotEmpty(message="Confirm Password is required")
	@Transient
	private String confirmPassword;

	public User() {

	}

	public User(String username, String email, String firstName, String lastName, String password, String confirmPassword) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.confirmPassword = confirmPassword;
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
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
