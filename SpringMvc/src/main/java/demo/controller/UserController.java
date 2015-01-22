package demo.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.entity.User;
import demo.service.UserService;
import demo.spring.SpringContextHolder;
import demo.spring.resolver.LoginInfo;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@Resource(name = "userServiceImpl")
	private UserService userService;

	@Autowired
	private LoginInfo injectLoginInfo;


	/**
	 * 注解注入方式
	 * 调用 UserService
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test( Model model ) {
		logger.info(" user/test .. ");
		User user = userService.getUserById(1L);
		if ( user != null ) {
			model.addAttribute("param", user.getName());
		}
		return "testpage";
	}


	/**
	 * getBean 注入方式
	 * 调用 UserService
	 */
	@RequestMapping(value = "/bean", method = RequestMethod.GET)
	public String bean( Model model ) {
		logger.info(" user/bean .. ");
		User user = SpringContextHolder.getBean(UserService.class).getUserById(1L);
		if ( user != null ) {
			model.addAttribute("param", user.getName());
		}
		return "testpage";
	}


	/**
	 * 自定义参数转换器测试
	 * 允许 get post 方法
	 */
	@RequestMapping("/resolver")
	public String resolver( Model model, LoginInfo loginIfo ) {
		logger.info(" user/resolver .. ");
		model.addAttribute("param", loginIfo.getUserName());
		return "testpage";
	}


	/**
	 * spring注入 new LoginInfo
	 * 允许 get post 方法
	 */
	@RequestMapping("/inject")
	public String inject( Model model ) {
		logger.info(" user/resolver .. ");
		model.addAttribute("param", injectLoginInfo.getUserName());
		return "testpage";
	}
}
