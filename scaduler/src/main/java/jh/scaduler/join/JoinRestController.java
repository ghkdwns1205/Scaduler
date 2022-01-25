package jh.scaduler.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinRestController {

	@Autowired(required = false)
	private JoinService joinService;
	
	@RequestMapping(value="/join/idCheck" , produces = "application/json; charset=utf8")
	public String idCheck(@RequestParam("userID") String userID) {
		
		String result = "";
		System.out.println("유저아이디==="+userID);
		String userIdCheck = joinService.getUserIdCheck(userID);
		
		if(userIdCheck.equals("") || userIdCheck == "NULL") {
			result = "\"result\":\"ok\", \"msg\":\"사용가능한 아이디 입니다.\""; 
		}else {
			result = "\"result\":\"error\", \"msg\":\"이미 사용중인 아이디 입니다.\""; 
		}
		
		return result;
	}
}
