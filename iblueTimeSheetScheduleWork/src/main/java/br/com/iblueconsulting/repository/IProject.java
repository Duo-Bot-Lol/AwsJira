package br.com.iblueconsulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iblueconsulting.model.Project;

public interface IProject extends JpaRepository<Project, Integer>{

}
