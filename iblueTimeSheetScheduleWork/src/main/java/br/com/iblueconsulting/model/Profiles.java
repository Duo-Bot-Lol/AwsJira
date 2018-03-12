package br.com.iblueconsulting.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Profiles implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8720737334026075098L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String login;
	
	@Column
	private String password;
	
	@Column
	private String profile;
	
	@JsonIgnore
	@OneToOne
	private Colaborator colaborator;
	
	@OneToMany(mappedBy="profile", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Page> pages;

	public Profiles() {
		// TODO Auto-generated constructor stub
	}

	public Profiles(Integer id, String login, String password, String profile) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.profile = profile;
	}

	public Profiles(Integer id, String login, String password, String profile, Colaborator colaborator,
			List<Page> pages) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.profile = profile;
		this.colaborator = colaborator;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Profiles [id=" + id + ", login=" + login + ", password=" + password + ", profile=" + profile + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Colaborator getColaborator() {
		return colaborator;
	}

	public void setColaborator(Colaborator colaborator) {
		this.colaborator = colaborator;
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
	

	
}
