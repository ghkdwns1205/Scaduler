package jh.scaduler.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class LoginController {

	@Autowired(required = false)
	private LoginService loginService;
	
	@RequestMapping(value="/loginSession")
	public String login() {
		
		System.out.println("여기는 세션 로그인 페이지로가는곳");
		
		return "member/loginSession";
	}
	
	
	@RequestMapping(value="/login/session")
	public String sessionLogin(HttpServletRequest request, LoginDto loginDto, Model model) {
		
		System.out.println("여기는 세션 로그인 처리");
		System.out.println("sessionLoginID==="+loginDto.getSessionUserID());
		System.out.println("sessionLoginPass==="+loginDto.getSessionUserPass());
		
		int success = loginService.getUserChk(loginDto);
		
		
		return "/main";
	}
	
	
	@RequestMapping(value="/loginSecurity")
	public String securityLogin() {
		
		System.out.println("여기는 시큐리티 로그인 페이지로가는곳");
		
		return "member/loginSecurity";
	}
}
