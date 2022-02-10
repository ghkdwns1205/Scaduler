package jh.scaduler.join;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jh.scaduler.util.Util;

@RestController
public class JoinRestController {
 
	@Autowired(required = false)
	private JoinService joinService;
	
	@RequestMapping(value="/join/idCheck" , produces = "application/json; charset=utf8")
	public String idCheck(@RequestParam("userID") String userID) {
		
		String result = "";
		System.out.println("유저아이디==="+userID);
		String userIdCheck = joinService.getUserIdCheck(userID);
		System.out.println("userIdCheck==="+userIdCheck);
		System.out.println("userIdCheck11==="+Util.NVL(userIdCheck));
		
		if(Util.NVL(userIdCheck).equals("")) {
			result = "{\"result\":\"ok\", \"msg\":\"사용가능한 아이디 입니다.\"}"; 
//			result = "result=ok&msg=사용가능한 아이디 입니다"; 
		}else {
			result = "{\"result\":\"error\", \"msg\":\"이미 사용중인 아이디 입니다.\"}"; 
		}
		
		return result;
	}
	 
	@RequestMapping(value="/join/member" , produces = "application/json; charset=utf8")
	public String joinMember(JoinVO joinVO) {
		
		String msg = "";
		System.out.println("id==="+joinVO.getUserID());
		System.out.println("pass==="+joinVO.getUserPass());
		System.out.println("email==="+joinVO.getUserEmail());
		joinVO.setUserPhone(joinVO.getUserPhone1()+joinVO.getUserPhone2()+joinVO.getUserPhone3());
		System.out.println("phone==="+joinVO.getUserPhone());
		joinVO.setUserPass(Util.ShaEncode(joinVO.getUserPass()));
		
		
		int a = joinService.setJoinMember(joinVO);
		System.out.println("a==="+a);
		
		if(a == 1)
			msg = "{\"result\":\"ok\", \"msg\":\"회원가입 완료!\"}"; 
		else
			msg = "{\"result\":\"error\", \"msg\":\"회원가입중 오류가 발생하였습니다.\"}"; 
		
		return msg;
	}
	
}
