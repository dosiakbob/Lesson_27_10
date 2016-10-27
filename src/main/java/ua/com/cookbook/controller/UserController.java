package ua.com.cookbook.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.cookbook.entity.User;
import ua.com.cookbook.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userservice;
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public String registration(Model model){
		model.addAttribute("user", new User());
		return "/registration";
	}
	@RequestMapping(value="/newUser", method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user){
	userservice.save(user);
	return "redirect:/";
	}
	@RequestMapping (value="/Login", method=RequestMethod.GET)
	public String login(){
		return "loginpage";
	}
	
	@RequestMapping (value="/logout", method=RequestMethod.POST)
	public String logout(){
		return "redirect:/";
	}
	
	@RequestMapping (value="/home", method=RequestMethod.POST)
	public String home(){
		return "redirect:/";
	}
	
	@RequestMapping (value="/loginprocesing", method=RequestMethod.POST)
	public String loginprocesing(){
		return "redirect:/";
	}

	@RequestMapping (value="/getOrder", method=RequestMethod.GET)
	public String getOrder(Principal principal){
		User user = userservice.findOne(Integer.parseInt(principal.getName()));
		
		System.out.println();
		return "redirect:/";
	}
}