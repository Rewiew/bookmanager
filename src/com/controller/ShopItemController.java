package com.controller;

import java.io.IOException;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.shopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.server.shopItemServer;
import com.util.PageBean;
import net.sf.json.JSONObject;

import java.sql.SQLException;

@Controller
public class ShopItemController {
	@Resource
	private shopItemServer shangpinxinxiService;
	@RequestMapping("addShangpinxinxi.do")
	public String addShangpinxinxi(HttpServletRequest request, shopItem shopItem, HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		shopItem.setAddtime(time.toString().substring(0, 19));
		shangpinxinxiService.add(shopItem);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "shangpinxinxiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:shangpinxinxiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateShangpinxinxi.do")
	public String doUpdateShangpinxinxi(int id, ModelMap map, shopItem shopItem){
		shopItem =shangpinxinxiService.getById(id);
		map.put("shopItem", shopItem);
		return "shangpinxinxi_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("shangpinxinxiDetail.do")
	public String shangpinxinxiDetail(int id, ModelMap map, shopItem shopItem){
		shopItem =shangpinxinxiService.getById(id);
		map.put("shopItem", shopItem);
		return "shangpinxinxi_detail";
	}
//	前台详细
	@RequestMapping("spxxDetail.do")
	public String spxxDetail(int id, ModelMap map, shopItem shopItem){
		shopItem =shangpinxinxiService.getById(id);
		map.put("shopItem", shopItem);
		return "shangpinxinxidetail";
	}
//	
	@RequestMapping("updateShangpinxinxi.do")
	public String updateShangpinxinxi(int id, ModelMap map, shopItem shopItem, HttpServletRequest request, HttpSession session){
		shangpinxinxiService.update(shopItem);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:shangpinxinxiList.do";
	}

//	分页查询
	@RequestMapping("shangpinxinxiList.do")
	public String shangpinxinxiList(@RequestParam(value="page",required=false)String page,
									ModelMap map, HttpSession session, shopItem shopItem, String shangpinbianhao, String shangpinmingcheng, String leixing, String pinpai, String xiaoliang1, String xiaoliang2, String kucun1, String kucun2, String jiage1, String jiage2, String tupian, String shangpinjianjie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(shangpinbianhao==null||shangpinbianhao.equals("")){pmap.put("shangpinbianhao", null);}else{pmap.put("shangpinbianhao", shangpinbianhao);}
		if(shangpinmingcheng==null||shangpinmingcheng.equals("")){pmap.put("shangpinmingcheng", null);}else{pmap.put("shangpinmingcheng", shangpinmingcheng);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(pinpai==null||pinpai.equals("")){pmap.put("pinpai", null);}else{pmap.put("pinpai", pinpai);}
		if(xiaoliang1==null||xiaoliang1.equals("")){pmap.put("xiaoliang1", null);}else{pmap.put("xiaoliang1", xiaoliang1);}
		if(xiaoliang2==null||xiaoliang2.equals("")){pmap.put("xiaoliang2", null);}else{pmap.put("xiaoliang2", xiaoliang2);}
		if(kucun1==null||kucun1.equals("")){pmap.put("kucun1", null);}else{pmap.put("kucun1", kucun1);}
		if(kucun2==null||kucun2.equals("")){pmap.put("kucun2", null);}else{pmap.put("kucun2", kucun2);}
		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}
		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}
		if(tupian==null||tupian.equals("")){pmap.put("tupian", null);}else{pmap.put("tupian", tupian);}
		if(shangpinjianjie==null||shangpinjianjie.equals("")){pmap.put("shangpinjianjie", null);}else{pmap.put("shangpinjianjie", shangpinjianjie);}
		
		int total=shangpinxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<shopItem> list=shangpinxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shangpinxinxi_list";
	}
	
	
	
	@RequestMapping("spxxList.do")
	public String spxxList(@RequestParam(value="page",required=false)String page,
						   ModelMap map, HttpSession session, shopItem shopItem, String shangpinbianhao, String shangpinmingcheng, String leixing, String pinpai, String xiaoliang1, String xiaoliang2, String kucun1, String kucun2, String jiage1, String jiage2, String tupian, String shangpinjianjie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(shangpinbianhao==null||shangpinbianhao.equals("")){pmap.put("shangpinbianhao", null);}else{pmap.put("shangpinbianhao", shangpinbianhao);}
		if(shangpinmingcheng==null||shangpinmingcheng.equals("")){pmap.put("shangpinmingcheng", null);}else{pmap.put("shangpinmingcheng", shangpinmingcheng);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(pinpai==null||pinpai.equals("")){pmap.put("pinpai", null);}else{pmap.put("pinpai", pinpai);}
		if(xiaoliang1==null||xiaoliang1.equals("")){pmap.put("xiaoliang1", null);}else{pmap.put("xiaoliang1", xiaoliang1);}
		if(xiaoliang2==null||xiaoliang2.equals("")){pmap.put("xiaoliang2", null);}else{pmap.put("xiaoliang2", xiaoliang2);}
		if(kucun1==null||kucun1.equals("")){pmap.put("kucun1", null);}else{pmap.put("kucun1", kucun1);}
		if(kucun2==null||kucun2.equals("")){pmap.put("kucun2", null);}else{pmap.put("kucun2", kucun2);}
		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}
		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}
		if(tupian==null||tupian.equals("")){pmap.put("tupian", null);}else{pmap.put("tupian", tupian);}
		if(shangpinjianjie==null||shangpinjianjie.equals("")){pmap.put("shangpinjianjie", null);}else{pmap.put("shangpinjianjie", shangpinjianjie);}
		
		int total=shangpinxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<shopItem> list=shangpinxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shangpinxinxilist";
	}
	@RequestMapping("spxxListtp.do")
	public String spxxListtp(@RequestParam(value="page",required=false)String page,
							 ModelMap map, HttpSession session, shopItem shopItem, String shangpinbianhao, String shangpinmingcheng, String leixing, String pinpai, String xiaoliang1, String xiaoliang2, String kucun1, String kucun2, String jiage1, String jiage2, String tupian, String shangpinjianjie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(shangpinbianhao==null||shangpinbianhao.equals("")){pmap.put("shangpinbianhao", null);}else{pmap.put("shangpinbianhao", shangpinbianhao);}
		if(shangpinmingcheng==null||shangpinmingcheng.equals("")){pmap.put("shangpinmingcheng", null);}else{pmap.put("shangpinmingcheng", shangpinmingcheng);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(pinpai==null||pinpai.equals("")){pmap.put("pinpai", null);}else{pmap.put("pinpai", pinpai);}
		if(xiaoliang1==null||xiaoliang1.equals("")){pmap.put("xiaoliang1", null);}else{pmap.put("xiaoliang1", xiaoliang1);}
		if(xiaoliang2==null||xiaoliang2.equals("")){pmap.put("xiaoliang2", null);}else{pmap.put("xiaoliang2", xiaoliang2);}
		if(kucun1==null||kucun1.equals("")){pmap.put("kucun1", null);}else{pmap.put("kucun1", kucun1);}
		if(kucun2==null||kucun2.equals("")){pmap.put("kucun2", null);}else{pmap.put("kucun2", kucun2);}
		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}
		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}
		if(tupian==null||tupian.equals("")){pmap.put("tupian", null);}else{pmap.put("tupian", tupian);}
		if(shangpinjianjie==null||shangpinjianjie.equals("")){pmap.put("shangpinjianjie", null);}else{pmap.put("shangpinjianjie", shangpinjianjie);}
		
		int total=shangpinxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<shopItem> list=shangpinxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shangpinxinxilisttp";
	}
	@RequestMapping("deleteShangpinxinxi.do")
	public String deleteShangpinxinxi(int id,HttpServletRequest request){
		shangpinxinxiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:shangpinxinxiList.do";
	}
	
	@RequestMapping("quchongShangpinxinxi.do")
	public void quchongShangpinxinxi(shopItem shopItem, HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("shangpinmingcheng", shopItem.getShangpinmingcheng());
		   System.out.println("shangpinmingcheng==="+ shopItem.getShangpinmingcheng());
		   System.out.println("shangpinmingcheng222==="+shangpinxinxiService.quchongShangpinxinxi(map));
		   JSONObject obj=new JSONObject();
		   if(shangpinxinxiService.quchongShangpinxinxi(map)!=null){
				 obj.put("info", "ng");
			   }else{
				   obj.put("info", "商品名称可以用！");
				  
			   }
		   response.setContentType("text/html;charset=utf-8");
		   PrintWriter out=null;
		   try {
			out=response.getWriter();
			out.print(obj);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
}
