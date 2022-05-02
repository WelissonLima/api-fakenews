package br.com.fakenews.dto.input;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.fakenews.model.entity.UserEntity;
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
public class UserInputDto {

	@NotBlank
	private String email;

	@NotBlank
	private String password;
	
	@NotBlank
	private String fullname;
	
	@NotNull
	private Date birthdate;
	
	public static UserEntity toUserEntity(final UserInputDto userInputDto) {
		return UserEntity.builder()
				.fullname(userInputDto.fullname)
				.email(userInputDto.email)
				.password(userInputDto.password)
				.birthdate(userInputDto.birthdate)
				.build();
	}
}
