package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/members")
@Controller
public class MemberController {

	
	//회원 가입 페이지
		@GetMapping("/signup")
		public String joinForm() {
			return "member/signup";
		}
}
