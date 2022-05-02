package br.com.fakenews.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fakenews.model.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
