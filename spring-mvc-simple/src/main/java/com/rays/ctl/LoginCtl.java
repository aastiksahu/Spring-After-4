package com.rays.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rays.dto.UserDTO;
import com.rays.form.LoginForm;
import com.rays.service.UserServiceInt;

@Controller
@RequestMapping(value = "Login")
public class LoginCtl {

	@Autowired
	public UserServiceInt service;
	
	@GetMapping
	public String display(@ModelAttribute("form") LoginForm form) {
		return "Login";
	}
	
	@PostMapping
	public String submit(@ModelAttribute("form") LoginForm form, Model model) {
//		
//		UserDTO dto = new UserDTO();
//		dto.setLogin(form.getLogin());
//		dto.setPassword(form.getPassword());
//		
//		service.authenticate(dto.getLogin(), dto.getPassword());
//		model.addAttribute("msg", "User Login Successfully..");
//		return "Login";
		
//		String login = form.getLogin();
//		String password = form.getPassword();
//		
//		service.authenticate(login, password);
//		model.addAttribute("msg", "User Login Successfully..");
//		return "Login";
		
		UserDTO dto = new UserDTO();
		dto.setLogin(form.getLogin());
		dto.setPassword(form.getPassword());
		
		String login = dto.getLogin();
		String password = dto.getPassword();
		
		service.authenticate(login, password);
		model.addAttribute("msg", "User Login Successfully..");
		return "Login";
	}

}
