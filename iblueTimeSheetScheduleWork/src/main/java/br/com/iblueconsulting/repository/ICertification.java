package br.com.iblueconsulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iblueconsulting.model.Certification;

public interface ICertification extends JpaRepository<Certification, Integer>{

}
