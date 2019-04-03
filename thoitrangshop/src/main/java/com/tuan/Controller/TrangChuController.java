package com.tuan.Controller;


import javax.servlet.http.HttpSession;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/")
@SessionAttributes("email")
public class TrangChuController {
	@Autowired
	SessionFactory sessionFactory;
	
	@GetMapping
	
	@Transactional
	// gọi transacstion để thay cho tên định danh từ bean IoC
	 
	//@SessionAttribute("email") String email,ModelMap modelMap,HttpSession httpSession
	public String Default(@SessionAttribute("email") String email,ModelMap modelMap,HttpSession httpSession) {
		if(httpSession.getAttribute("email") != null) {
			String ten = (String) httpSession.getAttribute("email");
			String FirstChar = ten.toString();
			modelMap.addAttribute("FirstChar",FirstChar);
		}
		return "TrangChu"; 
	}
 
}
		


