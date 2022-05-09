package br.com.fakenews.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fakenews.dto.NewsInputDto;
import br.com.fakenews.exception.NewsNotFoundException;
import br.com.fakenews.exception.UserNotFoundException;
import br.com.fakenews.model.entity.NewsEntity;
import br.com.fakenews.repository.NewsRepository;

@Service
public class NewsService {

	private final NewsRepository newsRepository;	
	
	public NewsService(NewsRepository newsRepository) {
		this.newsRepository = newsRepository;
	}
	
	public List<NewsEntity> findAllNews() {
		return  newsRepository.findAll();
	}

	public NewsEntity findNewsById(final Long idNews) {
		Optional<NewsEntity> optionalNews = newsRepository.findById(idNews);
		
		if(optionalNews.isEmpty()) {
			throw new NewsNotFoundException("Notícia [" + idNews + "] não encontrada."); 
		}
		
		return optionalNews.get();
	}

	public NewsEntity saveNews(final NewsInputDto newsInputDto) {	
//		return newsRepository.saveAll(newsInputDto);
		return null;
	}

	public void deleteNews(final Long idNews) {
		Optional<NewsEntity> optionalNews = newsRepository.findById(idNews);
		
		if(optionalNews.isEmpty()) {
			throw new NewsNotFoundException("Notícia [" + idNews + "] não encontrado."); 
		}
		
		newsRepository.deleteById(idNews);
	}


	public NewsEntity updateNews(final Long idNews, final NewsInputDto newsInputDto){
		Optional<NewsEntity> optionalNews = newsRepository.findById(idNews);
		
		if(optionalNews.isEmpty()) {
			throw new UserNotFoundException("Notícia [" + idNews + "] não encontrado."); 
		}
		
		NewsEntity newsEntity = optionalNews.get();
		newsEntity.setAuthor(newsInputDto.getAuthor());
		newsEntity.setBody(newsInputDto.getBody());
		newsEntity.setCategory(newsInputDto.getCategory());
		newsEntity.setPublicationDate(newsInputDto.getPublicationDate());
		
		return newsRepository.save(newsEntity);
	}
}
