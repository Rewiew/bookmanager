package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.server.UserServer;

@Controller
public class hsgloginController {
	@Resource
	private UserServer allusersService;


	@RequestMapping("hsglogin.do")
	public String checkAllusersLogin(User user, HttpSession session) {
		Map<String,Object> u=new HashMap<String,Object>();
		System.out.println("name===" + user.getUsername());
		u.put("username", user.getUsername());
		//u.put("utype", "用户");
		//Md5.MD5HexEncode(user.getPassword())
		u.put("pwd", user.getPwd());
		user = allusersService.allusersLogin(u);
		if (user != null) {
			session.setAttribute("username", user);
			System.out.println("username=" + user);
			session.removeAttribute("suc");
			return "redirect:index.do";
		} else {
			System.out.println("usernafwfwwme=");
			session.setAttribute("suc", "登录失败！用户名或密码错误！");
			return "login";
		}

	}
}
