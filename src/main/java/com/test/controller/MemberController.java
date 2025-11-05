package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dto.MemberDTO;

import jakarta.validation.Valid;




@RequestMapping("/members")
@Controller
public class MemberController {

	
	//회원 가입 페이지
		@GetMapping("/signup")
		public String joinForm(MemberDTO memberDTO) {
			return "member/signup";
		}
		
		//회원 가입 처리
		@PostMapping("/signup")
		public String join(@Valid MemberDTO memberDTO,
				BindingResult bindingResult) {
			if(bindingResult.hasErrors()) { 
				//에러가 있으면 상품 등록 폼 이동
				return "member/signup";
			}
			return "redirect:/";
		}
}







