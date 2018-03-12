package br.com.iblueconsulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iblueconsulting.model.Colaborator;

public interface IColaborator extends JpaRepository<Colaborator, Integer>{

}
