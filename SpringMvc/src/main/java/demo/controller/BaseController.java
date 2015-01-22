package demo.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class BaseController implements HandlerInterceptor {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());


	@Override
	public boolean preHandle( HttpServletRequest request, HttpServletResponse response, Object handler )
		throws Exception {
		System.out.println(" BaseController preHandle ... ");
		return true;
	}


	@Override
	public void postHandle( HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView ) throws Exception {
		System.out.println(" BaseController postHandle ... ");
		if ( isLegalView(modelAndView) ) {
			modelAndView.addObject("newdate", new Date());
		}
	}


	@Override
	public void afterCompletion( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex )
		throws Exception {
		System.out.println(" BaseController afterCompletion ... ");
	}


	/**
	 * 判断是否为合法的视图地址
	 * <p>
	 * 
	 * @param modelAndView
	 *            spring 视图对象
	 * @return boolean
	 */
	protected boolean isLegalView( ModelAndView modelAndView ) {
		boolean legal = false;
		if ( modelAndView != null ) {
			String viewUrl = modelAndView.getViewName();
			if ( viewUrl != null && viewUrl.contains("redirect:") ) {
				legal = false;
			} else {
				legal = true;
			}
		}
		return legal;
	}
}
