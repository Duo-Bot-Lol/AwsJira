package br.com.iblueconsulting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iblueconsulting.model.Team;

public interface ITeam extends JpaRepository<Team, Integer>{

}
