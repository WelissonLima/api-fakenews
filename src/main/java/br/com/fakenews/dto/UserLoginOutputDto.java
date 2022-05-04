package br.com.fakenews.dto;

import javax.validation.constraints.Email;
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
public class UserLoginOutputDto {

	@Email
	@NotBlank
	private String email;
	
	private String password;
	
	@NotBlank
	private String token;
}
