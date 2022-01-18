package jh.scaduler.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String mainTest() {
		
		System.out.println("123123");
		return "main";
	}
}
