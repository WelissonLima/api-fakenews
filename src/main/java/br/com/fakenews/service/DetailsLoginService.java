package br.com.fakenews.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.fakenews.model.entity.UserEntity;
import br.com.fakenews.repository.UserRepository;
import br.com.fakenews.security.data.DetailsLoginData;

@Component
public class DetailsLoginService  implements UserDetailsService{
	
	private final UserRepository userRepository;
	
	public DetailsLoginService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<UserEntity> optionalUser = userRepository.findByEmail(email);
		
		return new DetailsLoginData(optionalUser);
	}
}
