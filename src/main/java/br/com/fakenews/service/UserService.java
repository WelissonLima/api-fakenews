package br.com.fakenews.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fakenews.dto.input.UserInputDto;
import br.com.fakenews.dto.output.UserOutputDto;
import br.com.fakenews.model.entity.UserEntity;
import br.com.fakenews.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<UserOutputDto> getAll() {
		return userRepository.findAll().stream()
				.map(UserEntity::toUserOutputDto)
				.collect(Collectors.toList());
	}

	public UserOutputDto findById(final Long idUser) {
		Optional<UserEntity> optionalUser = userRepository.findById(idUser);
		
		return optionalUser.get().toUserOutputDto(); 
	}

	public UserOutputDto create(final UserInputDto userInputDto) {
		UserEntity userEntity = UserInputDto.toUserEntity(userInputDto);
		return userRepository.save(userEntity).toUserOutputDto();
	}

	public void delete(final Long id) {
		
	}


	public UserOutputDto update(final Long id, final UserInputDto userInputDto){
		return null;
	}
}
