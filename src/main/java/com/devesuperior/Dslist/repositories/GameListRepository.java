package com.devesuperior.Dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.Dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
