package com.basak.tracker.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basak.tracker.domain.User;
import com.basak.tracker.service.UserService;
import com.basak.tracker.validator.UserValidator;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	@RequestMapping(value = "/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "users/register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid User user, BindingResult bindingResult, Model model) {
		userValidator.validate(user, bindingResult);
		
		if (bindingResult.hasErrors()) {
			return "users/register";
		} else {
			userService.save(user);
			return "redirect:/";
		}
	}
	
}
