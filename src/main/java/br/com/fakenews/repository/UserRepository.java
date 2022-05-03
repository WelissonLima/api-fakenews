package br.com.fakenews.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fakenews.model.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long>{

	Optional<UserEntity> findByEmail(String email);
}
