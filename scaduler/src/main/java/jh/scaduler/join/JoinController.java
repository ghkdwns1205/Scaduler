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
		
		return "member/join";
	}
	
	
}
