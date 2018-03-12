package br.com.iblueconsulting.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TimeSheet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7893655721533140901L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private LocalDate day;

	@Column
	private LocalTime timeStart;

	@Column
	private LocalTime timeEnd;
	
	@JsonIgnore
	@ManyToOne
	private Colaborator colaborator;
	
	public TimeSheet() {
		// TODO Auto-generated constructor stub
	}

	public TimeSheet(Integer id, LocalDate day, LocalTime timeStart, LocalTime timeEnd) {
		super();
		this.id = id;
		this.day = day;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}

	public TimeSheet(Integer id, LocalDate day, LocalTime timeStart, LocalTime timeEnd, Colaborator colaborator) {
		super();
		this.id = id;
		this.day = day;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.colaborator = colaborator;
	}

	@Override
	public String toString() {
		return "TimeSheet [id=" + id + ", day=" + day + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	public LocalTime getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(LocalTime timeStart) {
		this.timeStart = timeStart;
	}

	public LocalTime getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(LocalTime timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Colaborator getColaborator() {
		return colaborator;
	}

	public void setColaborator(Colaborator colaborator) {
		this.colaborator = colaborator;
	}
	
	

}
