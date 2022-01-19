package jh.scaduler.join;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class JoinController {

	@Autowired(required = false)
	private JoinService joinService;
	
	@GetMapping(value="/join")
	public String join() {
		
		return "join/join";
	}
	
	@RequestMapping(value="/join/member")
	public String joinMember(@RequestParam Map<String, Object> param, Model model) {
		
		System.out.println("id==="+param.get("userID"));
		System.out.println("pass==="+param.get("userPass"));
		System.out.println("phone==="+param.get("userPhone"));
		System.out.println("email==="+param.get("userEmail"));
		
		int a = joinService.setJoinMember(param);
		System.out.println("a==="+a);
		
		if(a == 1)
			return "login/login";
		else
			return "main";
	}
	
	
}
