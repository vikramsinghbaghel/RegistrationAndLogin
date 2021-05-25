package com.nagarro.signupsignindetails.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user", uniqueConstraints = @UniqueConstraint(columnNames= "email"))
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String email;
	
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="users_roles",
				joinColumns=@JoinColumn(
						name="user_id", referencedColumnName = "id"),
				inverseJoinColumns=@JoinColumn(
						name ="role_id", referencedColumnName = "id")
						)
	private Collection<Role> roles;
	
	public User(Long id, String fristName, String lastName, String email, String password, Collection<Role> roles) {
		super();
		this.id = id;
		this.firstName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public User(String firstName, String lastName, String email, String password, Collection<Role> roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFristName() {
		return firstName;
	}
	public void setFristName(String fristName) {
		this.firstName = fristName;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fristName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", roles=" + roles + "]";
	}
	
	

}
