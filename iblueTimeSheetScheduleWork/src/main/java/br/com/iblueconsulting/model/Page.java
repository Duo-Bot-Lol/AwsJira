package br.com.iblueconsulting.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Page implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 328448814082890715L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String urlName;
	
	@Column
	private Boolean active;
	
	@JsonIgnore
	@ManyToOne
	private Profiles profile;
	
	public Page() {
		// TODO Auto-generated constructor stub
	}

	public Page(Integer id, String urlName, Boolean active) {
		super();
		this.id = id;
		this.urlName = urlName;
		this.active = active;
	}

	public Page(Integer id, String urlName, Boolean active, Profiles profile) {
		super();
		this.id = id;
		this.urlName = urlName;
		this.active = active;
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Page [id=" + id + ", urlName=" + urlName + ", active=" + active + ", profile=" + profile + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Profiles getProfile() {
		return profile;
	}

	public void setProfile(Profiles profile) {
		this.profile = profile;
	}
	
	
	
}
