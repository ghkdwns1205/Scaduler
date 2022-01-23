package jh.scaduler.join;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinRestController {

	@PostMapping(value="/join/idCHeck" , produces = "application/json; charset=utf8")
	public String idCheck(@RequestParam String userID) {
		
		System.out.println("유저아이디==="+userID);
		return null;
	}
}
