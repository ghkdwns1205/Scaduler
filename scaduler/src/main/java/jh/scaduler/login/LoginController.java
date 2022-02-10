package jh.scaduler.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public String login() {
		
		System.out.println("여기는 로그인 페이지로가는곳");
		
		return "member/login";
	}
}
