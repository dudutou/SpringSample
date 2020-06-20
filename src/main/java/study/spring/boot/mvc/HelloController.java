package study.spring.boot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String getHello() {
		return "hello";
	}
	
	@PostMapping("hello")
	public String postRequest(Model model, @RequestParam("text1") String str) {
		model.addAttribute("sample", str);
		
		return "helloResponse";
	}
}
