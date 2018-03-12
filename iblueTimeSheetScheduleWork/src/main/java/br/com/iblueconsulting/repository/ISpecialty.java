package br.com.iblueconsulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iblueconsulting.model.Specialty;

public interface ISpecialty extends JpaRepository<Specialty, Integer>{

}
