package com.test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MemberDTO {

	private String email;//이메일
	private String passwd;//비밀번호
	private String name;//이름
}
