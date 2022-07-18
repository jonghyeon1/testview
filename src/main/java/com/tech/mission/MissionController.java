package com.tech.mission;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MissionController {

	
	@RequestMapping("/emp/emploginform")
	public String confirmId() {

		return "emp/emploginform";
	}
	
	@RequestMapping("/emp/empinfo")
	public String loginconform(HttpServletRequest request, Model model) {
		
		String empno = request.getParameter("empno");
		String empname = request.getParameter("empname");
		String sido = request.getParameter("sido");
		String addr = request.getParameter("addr");
		String wuno = request.getParameter("wuno");
		String ponnumber = request.getParameter("ponnumber");
		String mariji = request.getParameter("mariji");
		
		model.addAttribute("empno", empno);
		model.addAttribute("empname", empname);
		model.addAttribute("sido", sido);
		model.addAttribute("addr", addr);
		model.addAttribute("wuno", wuno);
		model.addAttribute("ponnumber", ponnumber);
		model.addAttribute("mariji", mariji);
		
		
		return "emp/empinfo";
	}
	
	@RequestMapping("/custom/customlogform")
	public String customform() {

		return "custom/customlogform";
	}
	
	
	@RequestMapping("/custom/custominfo")
	public String cusinform(HttpServletRequest request, Model model) {
		
		String cusnum = request.getParameter("cusnum");
		String cusname = request.getParameter("cusname");
		String pwd = request.getParameter("pwd");
		String cusclass = request.getParameter("cusclass");
		
		
		model.addAttribute("cusnum", cusnum);
		model.addAttribute("cusname", cusname);
		model.addAttribute("pwd", pwd);
		model.addAttribute("cusclass", cusclass);
		
		
		
		return "custom/custominfo";
	}
	
}
