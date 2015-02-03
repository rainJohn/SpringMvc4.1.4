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


	/**
	 * 发送邮件
	 */
	@RequestMapping("/mail")
	public String mail( Model model ) {
		String receiver = "243194995@qq.com";// write here receiver id
		boolean send = mail.sendMail(receiver, "hi spring", "this is a test mail!");
		model.addAttribute("param", send ? "邮件发送成功." : "邮件发送失败.");
		return "testpage";
	}


	/**
	 * 异常 404 提示页
	 */
	@RequestMapping("/404")
	public String error_404() {
		return "error/404";
	}

}
