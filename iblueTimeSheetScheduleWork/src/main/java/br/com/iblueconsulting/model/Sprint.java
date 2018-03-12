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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Sprint implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6234558568175599959L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private LocalDate dateStart;
	
	@Column
	private LocalDate dateEnd;
	
	@Column
	private Boolean finished;
	
	@Column
	private Integer nExceededDays;
	
	@JsonIgnore
	@ManyToOne
	private Project project;
	
	@OneToMany(mappedBy="sprint", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Task> task;
	
	public Sprint() {
		// TODO Auto-generated constructor stub
	}

	public Sprint(Integer id, LocalDate dateStart, LocalDate dateEnd, Boolean finished, Integer nExceededDays) {
		super();
		this.id = id;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.finished = finished;
		this.nExceededDays = nExceededDays;
	}

	public Sprint(Integer id, LocalDate dateStart, LocalDate dateEnd, Boolean finished, Integer nExceededDays,
			Project project, List<Task> task) {
		super();
		this.id = id;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.finished = finished;
		this.nExceededDays = nExceededDays;
		this.project = project;
		this.task = task;
	}

	@Override
	public String toString() {
		return "Sprint [id=" + id + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd + ", finished=" + finished
				+ ", nExceededDays=" + nExceededDays + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Boolean getFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public Integer getnExceededDays() {
		return nExceededDays;
	}

	public void setnExceededDays(Integer nExceededDays) {
		this.nExceededDays = nExceededDays;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}
	
	
}
