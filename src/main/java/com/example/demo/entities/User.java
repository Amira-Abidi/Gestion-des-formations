package com.example.demo.entities;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.boot.convert.DataSizeUnit;

import lombok.Data;
@Entity
@Data
@Table(name = "users")
 public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="code")
	private Long id;
	private String login;
	private String password;
	private int idRole;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
               
            
    private Set<Role> roles = new HashSet<>();
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public User(String login, String password, int idRole,Set<Role> roles) {
		super();
		this.login = login;
		this.password = password;
		this.idRole = idRole;
		this.roles = roles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
