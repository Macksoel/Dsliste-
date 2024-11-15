package com.devesuperior.Dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.Dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
