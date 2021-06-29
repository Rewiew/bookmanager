package com.controller;

import java.util.List;
import javax.annotation.Resource;

import com.entity.shopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.News;
import com.entity.loginUser;
//jixacxishxu1
import com.server.NewsServer;
import com.server.loginUserServer;
import com.server.shopItemServer;
//jixacxishxu2

@Controller
public class IndexController {
	@Resource
	private NewsServer xinwentongzhiService;
	@Resource
	private loginUserServer loginUserServer;
	@Resource
	private shopItemServer shopItemServer;
	//jixacxishxu3
//	首页显示内容
	@RequestMapping("index.do")
	public String showIndex(ModelMap map){

		List<News> syxinwentongzhi1=xinwentongzhiService.getsyxinwentongzhi1(null);
		List<News> syxinwentongzhi2=xinwentongzhiService.getsyxinwentongzhi2(null);
		List<News> syxinwentongzhi3=xinwentongzhiService.getsyxinwentongzhi3(null);
		List<loginUser> syyonghuzhuce1= loginUserServer.getsyyonghuzhuce1(null);
		List<shopItem> syshangpinxinxi1= shopItemServer.getsyshangpinxinxi1(null);
		List<shopItem> syshangpinxinxi2= shopItemServer.getsyshangpinxinxi2(null);
		List<shopItem> syshangpinxinxi3= shopItemServer.getsyshangpinxinxi3(null);
	    map.put("syxinwentongzhi1", syxinwentongzhi1);
	    map.put("syxinwentongzhi2", syxinwentongzhi2);
	    map.put("syxinwentongzhi3", syxinwentongzhi3);
	    map.put("syyonghuzhuce1", syyonghuzhuce1);
	    map.put("syshangpinxinxi1", syshangpinxinxi1);
	    map.put("syshangpinxinxi2", syshangpinxinxi2);
	    map.put("syshangpinxinxi3", syshangpinxinxi3);
		return "default";
	}

	

	
}
