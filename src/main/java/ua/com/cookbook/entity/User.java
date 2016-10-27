package ua.com.cookbook.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String username;
	private String email;
	private String phone;
	private String password;


	//@ManyToMany(fetch=FetchType.LAZY)

	@JoinTable(name="user_dish", joinColumns=JoinColumn(name ="id_user"), inverseJoinColumns=@JoinColumn(name="id_dish"))
	private List<Ingredient> ingredients;
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String email, String phone, String password) {
		super();
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return String.valueOf(id);
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", phone=" + phone + ", password="
				+ password + "]";
	}


}
