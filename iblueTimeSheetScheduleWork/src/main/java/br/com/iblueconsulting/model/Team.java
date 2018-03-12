package br.com.iblueconsulting.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Team implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 894169103733826143L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany(mappedBy="team")
	private List<Colaborator> colaborator;
	
	@JsonIgnore
	@ManyToOne
	private Project project;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(Integer id, List<Colaborator> colaborator) {
		super();
		this.id = id;
		this.colaborator = colaborator;
	}

	public Team(Integer id, List<Colaborator> colaborator, Project project) {
		super();
		this.id = id;
		this.colaborator = colaborator;
		this.project = project;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", colaborator=" + colaborator + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Colaborator> getColaborator() {
		return colaborator;
	}

	public void setColaborator(List<Colaborator> colaborator) {
		this.colaborator = colaborator;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
