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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Colaborator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2620860292898254967L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@CPF
	private String cpf;
	
	@Column
	private String name;
	
	@Column
	private String function;
	
	@Column
	private Boolean active;
	
	@OneToOne(mappedBy="colaborator", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Profiles profile;
	
	@OneToMany(mappedBy="colaborator", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<TimeSheet> timesheet;
	
	@OneToMany(mappedBy="colaborator", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Specialty> specialtie;
	
	@OneToMany(mappedBy="colaborator", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Certification> certification;
	
	@JsonIgnore
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="team_coWorkers",
			joinColumns= @JoinColumn(name="id_colaborator", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="id_team", referencedColumnName="id")
			)
	private List<Team> team;
	
	public Colaborator() {
		// TODO Auto-generated constructor stub
	}

	public Colaborator(Integer id, @CPF String cpf, String name, String function, Boolean active) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.name = name;
		this.function = function;
		this.active = active;
	}

	public Colaborator(Integer id, @CPF String cpf, String name, String function, Boolean active, Profiles profile,
			List<TimeSheet> timesheet, List<Specialty> specialtie, List<Certification> certification, List<Team> team) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.name = name;
		this.function = function;
		this.active = active;
		this.profile = profile;
		this.timesheet = timesheet;
		this.specialtie = specialtie;
		this.certification = certification;
		this.team = team;
	}

	@Override
	public String toString() {
		return "Colaborator [id=" + id + ", cpf=" + cpf + ", name=" + name + ", function=" + function + ", active="
				+ active + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
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

	public List<TimeSheet> getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(List<TimeSheet> timesheet) {
		this.timesheet = timesheet;
	}

	public List<Specialty> getSpecialtie() {
		return specialtie;
	}

	public void setSpecialtie(List<Specialty> specialtie) {
		this.specialtie = specialtie;
	}

	public List<Certification> getCertification() {
		return certification;
	}

	public void setCertification(List<Certification> certification) {
		this.certification = certification;
	}

	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}
	
	
	
}
