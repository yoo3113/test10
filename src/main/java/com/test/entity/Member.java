package com.springboot.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import com.springboot.dto.MemberDTO;
import com.springboot.entity.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Table
@Data
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;//번호
	
	@Column(unique = true) //중복 방지
	private String email;//이메일
	
	@Column(nullable = false) //필수 입력
	private String passwd;//비밀번호
	
	@Column(length=30, nullable=false)
	private String name;//이름
	
	@CreationTimestamp //자동 생성
	private Timestamp joinDate;
	
	//dto를 entity로 변환하는 메서드 정의
		public static Member toSaveEntity(MemberDTO dto) {
			Member member = new Member();
			member.setEmail(dto.getEmail());
			member.setPasswd(dto.getPasswd());
			member.setName(dto.getName());
			
			return member;
}
