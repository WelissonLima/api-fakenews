package br.com.fakenews.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fakenews.dto.input.UserInputDto;
import br.com.fakenews.dto.output.UserOutputDto;
import br.com.fakenews.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<UserOutputDto> getAllUsers(){
		return userService.getAll();
	}
	
	@GetMapping(value = "/{idUser}")
	public UserOutputDto findById(@PathVariable Long idUser){
		return userService.findById(idUser);
	}
	
	@PostMapping
	public UserOutputDto createUser(@Valid @RequestBody UserInputDto userInputDto) {
		return userService.create(userInputDto);
	}

}
