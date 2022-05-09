package br.com.fakenews.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewsInputDto {

	@NotBlank
	private String title;
	
	@NotBlank
	private String body;

	@NotBlank
	private Boolean veracity;
	
	private String author;
	
	private String URL;
	
	private String category;
	
	private Date publicationDate;
}
