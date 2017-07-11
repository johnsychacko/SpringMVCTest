package com.js.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.js.dto.Login;
import com.js.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String openLoginForm(){
		return "commonlogin";
	}
	
	@RequestMapping(value="/loginverify",method=RequestMethod.POST)
	public ModelAndView loginVerify(Login login){
		System.out.println("Controller : "+login);
		ModelAndView modelAndView = new ModelAndView("commonlogin");
		try{
			String res = loginService.loginVerify(login);
			if(res.equals("admin")){
				modelAndView = new ModelAndView("admin/home");
			}else if(res.equals("user")){
				modelAndView = new ModelAndView("user/home");
			}else{
				modelAndView.addObject("LOGIN_MSG","Invalid username or password.");
			}
		}catch(Exception e){
			e.printStackTrace();
			modelAndView.addObject("LOGIN_MSG",e.getMessage());
		}
		return modelAndView;
	}
	
}
