package jh.scaduler.join;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jh.scaduler.util.Util;


@Controller
public class JoinController {

	@Autowired(required = false)
	private JoinService joinService;
	
	@GetMapping(value="/join")
	public String join() {
		
		return "join/join";
	}
	
	@RequestMapping(value="/join/member")
	public String joinMember(JoinVO joinVO, Model model) {
		
		System.out.println("id==="+joinVO.getUserID());
		System.out.println("pass==="+joinVO.getUserPass());
		System.out.println("phone==="+joinVO.getUserPhone());
		System.out.println("email==="+joinVO.getUserEmail());
		
		joinVO.setUserPass(Util.ShaEncode(joinVO.getUserPass()));
		
		
		int a = joinService.setJoinMember(joinVO);
		System.out.println("a==="+a);
		
		if(a == 1)
			return "login/login";
		else
			return "main";
	}
	
	
}
