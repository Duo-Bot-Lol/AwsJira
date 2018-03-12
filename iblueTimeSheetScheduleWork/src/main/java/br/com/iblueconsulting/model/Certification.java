package br.com.iblueconsulting.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Certification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1910330105057440847L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String year;
	
	@JsonIgnore
	@ManyToOne
	private Colaborator colaborator;
	
	public Certification() {
		// TODO Auto-generated constructor stub
	}

	public Certification(Integer id, String name, String year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public Certification(Integer id, String name, String year, Colaborator colaborator) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.colaborator = colaborator;
	}

	@Override
	public String toString() {
		return "Certification [id=" + id + ", name=" + name + ", year=" + year + "]";
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Colaborator getColaborator() {
		return colaborator;
	}

	public void setColaborator(Colaborator colaborator) {
		this.colaborator = colaborator;
	}
	
	
	
}
