package com.tuan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tuan.Service.NhanVienService;

@Controller
@RequestMapping("api/")
@SessionAttributes("email")
public class ApiController {
	@Autowired
	NhanVienService nhanVienService;
	
	@GetMapping("KiemTraDangNhap")
	@ResponseBody
	@Transactional
	public String KiemTraDangNhap(@RequestParam String email,@RequestParam String matkhau, ModelMap modelMap) {
		
		boolean kiemtra =  nhanVienService.KiemTraDangNhap(email,matkhau);
		if(kiemtra == true) {
			modelMap.addAttribute("kiemtradangnhap", "Ä�Äƒng nháº­p thÃ nh cÃ´ng !");
		}else {		
			modelMap.addAttribute("kiemtradangnhap", "Ä�Äƒng nháº­p tháº¥t báº¡i !");
		}
		modelMap.addAttribute("email",email);
		System.out.println("" +email);
		return ""+kiemtra;
	}
}
