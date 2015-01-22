package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {

	@RequestMapping("/index")
	public String index( Model model ) {
		model.addAttribute("param", "欢迎界面!");
		return "testpage";
	}

}
