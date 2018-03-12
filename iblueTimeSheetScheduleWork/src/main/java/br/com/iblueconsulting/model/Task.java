package br.com.iblueconsulting.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Task implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1640835335333848557L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String title;
	
	@Column
	private LocalTime perpective;
	
	@Column
	private LocalTime realPerspective;
	
	@Column
	private String situation;
	
	@Column
	private String priority;
	
	@Column
	private String responsible;
	
	@Column
	private LocalDateTime criation;
	
	@Column
	private LocalDateTime updateTask;
	
	@JsonIgnore
	@ManyToOne
	private Sprint sprint;
	
	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Task(Integer id, String title, LocalTime perpective, LocalTime realPerspective, String situation,
			String priority, String responsible, LocalDateTime criation, LocalDateTime updateTask) {
		super();
		this.id = id;
		this.title = title;
		this.perpective = perpective;
		this.realPerspective = realPerspective;
		this.situation = situation;
		this.priority = priority;
		this.responsible = responsible;
		this.criation = criation;
		this.updateTask = updateTask;
	}

	public Task(Integer id, String title, LocalTime perpective, LocalTime realPerspective, String situation,
			String priority, String responsible, LocalDateTime criation, LocalDateTime updateTask, Sprint sprint) {
		super();
		this.id = id;
		this.title = title;
		this.perpective = perpective;
		this.realPerspective = realPerspective;
		this.situation = situation;
		this.priority = priority;
		this.responsible = responsible;
		this.criation = criation;
		this.updateTask = updateTask;
		this.sprint = sprint;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", perpective=" + perpective + ", realPerspective="
				+ realPerspective + ", situation=" + situation + ", priority=" + priority + ", responsible="
				+ responsible + ", criation=" + criation + ", updateTask=" + updateTask + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalTime getPerpective() {
		return perpective;
	}

	public void setPerpective(LocalTime perpective) {
		this.perpective = perpective;
	}

	public LocalTime getRealPerspective() {
		return realPerspective;
	}

	public void setRealPerspective(LocalTime realPerspective) {
		this.realPerspective = realPerspective;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public LocalDateTime getCriation() {
		return criation;
	}

	public void setCriation(LocalDateTime criation) {
		this.criation = criation;
	}

	public LocalDateTime getUpdateTask() {
		return updateTask;
	}

	public void setUpdateTask(LocalDateTime updateTask) {
		this.updateTask = updateTask;
	}

	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
	
	
	
}
