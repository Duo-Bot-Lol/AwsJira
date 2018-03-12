package br.com.iblueconsulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iblueconsulting.model.TimeSheet;

public interface ITimeSheet extends JpaRepository<TimeSheet, Integer>{

}
