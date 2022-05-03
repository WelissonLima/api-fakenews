package br.com.fakenews.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<UserOutputDto>> getAllUsers(){
		return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{idUser}")
	public ResponseEntity<UserOutputDto> findById(@PathVariable Long idUser){
		UserOutputDto userOutputDto = userService.findById(idUser);
		
		if(userOutputDto != null) {
			return new ResponseEntity<>(userOutputDto, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public UserOutputDto createUser(@Valid @RequestBody UserInputDto userInputDto) {
		return userService.create(userInputDto);
	}

}
