package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dto.MemberDTO;


@RequestMapping("/members")
@Controller
public class MemberController {

	
	//회원 가입 페이지
		@GetMapping("/signup")
		public String joinForm() {
			return "member/signup";
		}
		
		//회원 가입 처리
		@PostMapping("/signup")
		public String join(@ModelAttribute MemberDTO memberDTO) {
			
			return "redirect:/";
		}
}
