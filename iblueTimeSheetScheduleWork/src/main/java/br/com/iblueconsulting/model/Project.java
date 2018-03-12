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

import org.joda.time.LocalDate;

@Entity
public class Project implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6497245684026141128L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String responsible;
	
	@Column
	private String ColaboratorManager;
	
	@Column
	private LocalDate dateStart;
	
	@Column
	private LocalDate dateEnd;
	
	@OneToOne (mappedBy="project")
	private Team team;
	
	@OneToMany(mappedBy="project", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Sprint> sprint;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(Integer id, String responsible, String colaboratorManager, LocalDate dateStart, LocalDate dateEnd) {
		super();
		this.id = id;
		this.responsible = responsible;
		ColaboratorManager = colaboratorManager;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}

	public Project(Integer id, String responsible, String colaboratorManager, LocalDate dateStart, LocalDate dateEnd,
			Team team, List<Sprint> sprint) {
		super();
		this.id = id;
		this.responsible = responsible;
		ColaboratorManager = colaboratorManager;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.team = team;
		this.sprint = sprint;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", responsible=" + responsible + ", ColaboratorManager=" + ColaboratorManager
				+ ", dateStart=" + dateStart + ", dateEnd=" + dateEnd + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public String getColaboratorManager() {
		return ColaboratorManager;
	}

	public void setColaboratorManager(String colaboratorManager) {
		ColaboratorManager = colaboratorManager;
	}

	public LocalDate getDateStart() {
		return dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}

	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Sprint> getSprint() {
		return sprint;
	}

	public void setSprint(List<Sprint> sprint) {
		this.sprint = sprint;
	}
	
	
}
