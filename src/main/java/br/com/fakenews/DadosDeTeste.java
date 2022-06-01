package br.com.fakenews;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import br.com.fakenews.dto.NewsInputDto;
import br.com.fakenews.dto.UserInputDto;
import br.com.fakenews.service.NewsService;
import br.com.fakenews.service.UserService;

@Service
public class DadosDeTeste implements ApplicationRunner {
	
	private NewsService newsService;
	private UserService userService;
	
	public DadosDeTeste(NewsService newsService, UserService userService) {
		this.userService = userService;	
		this.newsService = newsService;	
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		UserInputDto userInputDto1 = new UserInputDto("admin@admin.com", "123", "Admin", new Date(), "", "");
		UserInputDto userInputDto2 = new UserInputDto("le@gmail.com", "123", "Leticia Alves", new Date(), "", "");
		UserInputDto userInputDto3 = new UserInputDto("lu@gmail.com", "123", "Lucas Pinto", new Date(), "", "");
		UserInputDto userInputDto4 = new UserInputDto("te@gmail.com", "123", "Tercilio Fonseca", new Date(), "", "");
		UserInputDto userInputDto5 = new UserInputDto("we@gmail.com", "123", "Welisson Lima", new Date(), "", "");
		
		NewsInputDto newsInputDto1 = new NewsInputDto("Title 1", "Title 1 Welisson Lima", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto2 = new NewsInputDto("Title 2", "Title 2 Welisson Lima", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto3 = new NewsInputDto("Title 3", "Title 3 Welisson Lima", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto4 = new NewsInputDto("Title 4", "Title 4 Welisson Lima", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto5 = new NewsInputDto("Title 5", "Title 5 Welisson Lima", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto6 = new NewsInputDto("Title 6", "Title 6 Welisson Lima", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto7 = new NewsInputDto("Title 7", "Title 7 Welisson Lima", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto8 = new NewsInputDto("Title 8", "Title 8 Welisson Lima", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto9 = new NewsInputDto("Title 9", "No Distrito Federal o roubo aumenta 90%", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto10 = new NewsInputDto("Title 10", "No Distrito Federal foi propagado um novo virus chamado FakeNews", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto11 = new NewsInputDto("Title 11", "O governador de Santa Catarina foi preso", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto12 = new NewsInputDto("Title 12", "No RECREIO Rio de Janeiro foi encontrado uma mina de ouro", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto13 = new NewsInputDto("Title 13", "No São Paulo, Welisson Lima ganha o concurso de homem mais boco", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto14 = new NewsInputDto("Title 14", "Em Roraima o roubo aumenta 90%", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto15 = new NewsInputDto("Title 15", "No Sergipe foi propagado um novo virus chamado FakeNews", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto16 = new NewsInputDto("Title 16", "O governador de Bahia foi preso", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto17 = new NewsInputDto("Title 17", "No RECREIO Rio grande do sul foi encontrado uma mina de ouro", "welisson lima", "www.google.com", "TESTE", new Date());
		NewsInputDto newsInputDto18 = new NewsInputDto("Title 18", "No Tocantins, Welisson Lima ganha o concurso de homem mais boco", "welisson lima", "www.google.com", "TESTE", new Date());


		userService.saveUser(userInputDto1);
		userService.saveUser(userInputDto2);
		userService.saveUser(userInputDto3);
		userService.saveUser(userInputDto4);
		userService.saveUser(userInputDto5);
		
		newsService.saveNews(newsInputDto1);
		newsService.saveNews(newsInputDto2);
		newsService.saveNews(newsInputDto3);
		newsService.saveNews(newsInputDto4);
		newsService.saveNews(newsInputDto5);
		newsService.saveNews(newsInputDto6);
		newsService.saveNews(newsInputDto7);
		newsService.saveNews(newsInputDto8);
		newsService.saveNews(newsInputDto9);
		newsService.saveNews(newsInputDto10);
		newsService.saveNews(newsInputDto11);
		newsService.saveNews(newsInputDto12);
		newsService.saveNews(newsInputDto13);
		newsService.saveNews(newsInputDto14);
		newsService.saveNews(newsInputDto15);
		newsService.saveNews(newsInputDto16);
		newsService.saveNews(newsInputDto17);
		newsService.saveNews(newsInputDto18);

	}
}
