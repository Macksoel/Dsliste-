package com.devesuperior.Dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devesuperior.Dslist.dto.GameMinDTO;
import com.devesuperior.Dslist.entities.Game;
import com.devesuperior.Dslist.repositories.GameRepository;

@Service
public class GameService {
	

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
