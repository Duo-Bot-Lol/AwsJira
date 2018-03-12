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
public class Specialty implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3930558302389599425L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String hate;
	
	@JsonIgnore
	@ManyToOne
	private Colaborator colaborator;
	
	public Specialty() {
		// TODO Auto-generated constructor stub
	}

	public Specialty(Integer id, String name, String hate) {
		super();
		this.id = id;
		this.name = name;
		this.hate = hate;
	}

	public Specialty(Integer id, String name, String hate, Colaborator colaborator) {
		super();
		this.id = id;
		this.name = name;
		this.hate = hate;
		this.colaborator = colaborator;
	}

	@Override
	public String toString() {
		return "Specialty [id=" + id + ", name=" + name + ", hate=" + hate + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHate() {
		return hate;
	}

	public void setHate(String hate) {
		this.hate = hate;
	}

	public Colaborator getColaborator() {
		return colaborator;
	}

	public void setColaborator(Colaborator colaborator) {
		this.colaborator = colaborator;
	}
	
	
}
