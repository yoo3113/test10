package com.test.entity;

import lombok.Data;

@Data
@Entity
public class Member {

	private Long id;
	
	private String email;
	
	private String passwd;
	
	private String name;
	
	private Timestamp joinDate;
}
