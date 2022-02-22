package jh.scaduler.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jh.scaduler.join.MemberVO;
import jh.scaduler.util.ControllerSupport;
import jh.scaduler.util.Util;
  
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
		HttpSession session = request.getSession();
		MemberVO vo = loginService.getUserChk(loginDto);
		
		System.out.println("vo.getuserID==="+ Util.NVL(vo.getUserID()));
		System.out.println("vo.getuserPass==="+Util.NVL(vo.getUserPass()));
		System.out.println("vo.getuserPhone==="+Util.NVL(vo.getUserPhone()));
		System.out.println("vo.getuserEmail==="+Util.NVL(vo.getUserEmail()));
		
		//로그인 성공 세션저장
		if(Util.NVL(loginDto.getSessionUserID()).equals(Util.NVL(vo.getUserID())) && Util.NVL(loginDto.getSessionUserPass()).equals(Util.NVL(vo.getUserPass())) ){
			session.setAttribute("userID", Util.NVL(vo.getUserID()));
			return ControllerSupport.msgRedirect(model, "로그인 성공!", "/");
		}
		
		return ControllerSupport.msgRedirect(model, "로그인 실패!", "/loginSession");
	}
	
	
	@RequestMapping(value="/loginSecurity")
	public String securityLogin() {
		
		System.out.println("여기는 시큐리티 로그인 페이지로가는곳");
		
		return "member/loginSecurity";
	}
}
