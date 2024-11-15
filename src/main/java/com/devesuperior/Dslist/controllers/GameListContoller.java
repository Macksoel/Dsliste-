package com.devesuperior.Dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devesuperior.Dslist.dto.GameListDTO;
import com.devesuperior.Dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListContoller {

	
	
	@Autowired
	private GameListService gameListService;

	
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	

}
