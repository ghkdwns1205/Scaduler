package jh.scaduler.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@Autowired(required=false)
	private MainService mainService;
	
	@GetMapping("/")
	public String mainTest(Model model) {
		String testSeq = "1";
		String testId = mainService.getTestID(testSeq);
		System.out.println("testID==="+testId);
		
		model.addAttribute("testId", testId);
		return "main";
	}
}
