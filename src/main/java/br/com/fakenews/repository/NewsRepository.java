package br.com.fakenews.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fakenews.model.entity.NewsEntity;


public interface NewsRepository extends JpaRepository<NewsEntity, Long>{

}
