package com.test.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MemberDTO {

	@NotEmpty(message = "올바른 형식의 이메일 주소여야 합니다.")
	private String email;
	
	@NotEmpty(message = "비밀번호는 필수 항목입니다.")
	private String password;
	
	@NotEmpty(message = "이름은 필수 항목입니다.")
	private String name;
}
