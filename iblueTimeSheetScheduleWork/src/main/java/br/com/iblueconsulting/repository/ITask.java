package br.com.iblueconsulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iblueconsulting.model.Task;

public interface ITask extends JpaRepository<Task, Integer>{

}
