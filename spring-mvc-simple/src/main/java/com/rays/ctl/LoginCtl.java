package com.rays.ctl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rays.dto.UserDTO;
import com.rays.form.LoginForm;
import com.rays.service.UserServiceInt;

@Controller
@RequestMapping(value = "Login")
public class LoginCtl {

	@Autowired
	public UserServiceInt service;

	@GetMapping
	public String display(@ModelAttribute("form") LoginForm form, @RequestParam(required = false) String operation,
			HttpSession session, Model model) {

		if (operation != null && operation.equals("logout")) {
			session.invalidate();
			model.addAttribute("msg", "User Logout Successfully..");
		}
		return "Login";
	}

	@PostMapping
	public String submit(@ModelAttribute("form") LoginForm form, Model model, HttpSession session) {

		UserDTO dto = new UserDTO();
		dto.setLogin(form.getLogin());
		dto.setPassword(form.getPassword());

		dto = service.authenticate(dto.getLogin(), dto.getPassword());

		if (dto != null) {
			System.out.println(dto.getFirstName());
			session.setAttribute("user", dto);
			return "redirect:Welcome";
		} else {
			model.addAttribute("emsg", "Invalid Login or Password..");
			return "Login";
		}
//		String login = form.getLogin();
//		String password = form.getPassword();
//		
//		service.authenticate(login, password);
//		model.addAttribute("msg", "User Login Successfully..");
//		return "Login";

//		UserDTO dto = new UserDTO();
//		dto.setLogin(form.getLogin());	
//		dto.setPassword(form.getPassword());
//		
//		String login = dto.getLogin();
//		String password = dto.getPassword();
//		
//		service.authenticate(login, password);
//		model.addAttribute("msg", "User Login Successfully..");
//		return "Login";
	}

}
