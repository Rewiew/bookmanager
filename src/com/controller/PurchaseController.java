package com.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.entity.Purchase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.server.PurchaseServer;
import com.util.PageBean;
import com.util.db;
import java.sql.SQLException;

@Controller
public class PurchaseController {
	@Resource
	private PurchaseServer purchaseServer;
	@RequestMapping("addGoumaijilu.do")
	public String addGoumaijilu(HttpServletRequest request, Purchase PURCHASE, HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		PURCHASE.setAddtime(time.toString().substring(0, 19));
		purchaseServer.add(PURCHASE);
		String dd="update shangpinxinxi set kucun=kucun-"+ PURCHASE.getGoumaishuliang()+" where shangpinbianhao='"+ PURCHASE.getShangpinbianhao()+"'";
		db dbo = new db();
		dbo.hsgexecute(dd);
		String cc="update shangpinxinxi set xiaoliang=xiaoliang+"+ PURCHASE.getGoumaishuliang()+" where shangpinbianhao='"+ PURCHASE.getShangpinbianhao()+"'";
		dbo.hsgexecute(cc);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		//session.setAttribute("backurl", "goumaijiluList.do");
		return "redirect:postback.jsp";
		//return "redirect:goumaijiluList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateGoumaijilu.do")
	public String doUpdateGoumaijilu(int id, ModelMap map, Purchase PURCHASE){
		PURCHASE = purchaseServer.getById(id);
		map.put("PURCHASE", PURCHASE);
		return "goumaijilu_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("goumaijiluDetail.do")
	public String goumaijiluDetail(int id, ModelMap map, Purchase PURCHASE){
		PURCHASE = purchaseServer.getById(id);
		map.put("PURCHASE", PURCHASE);
		return "goumaijilu_detail";
	}
//	前台详细
	@RequestMapping("gmjlDetail.do")
	public String gmjlDetail(int id, ModelMap map, Purchase PURCHASE){
		PURCHASE = purchaseServer.getById(id);
		map.put("PURCHASE", PURCHASE);
		return "goumaijiludetail";
	}
//	
	@RequestMapping("updateGoumaijilu.do")
	public String updateGoumaijilu(int id, ModelMap map, Purchase PURCHASE, HttpServletRequest request, HttpSession session){
		purchaseServer.update(PURCHASE);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:goumaijiluList.do";
	}

//	分页查询
	@RequestMapping("goumaijiluList.do")
	public String goumaijiluList(@RequestParam(value="page",required=false)String page,
								 ModelMap map, HttpSession session, Purchase PURCHASE, String shangpinbianhao, String shangpinmingcheng, String leixing, String pinpai, String xiaoliang, String kucun, String jiage, String goumaishuliang1, String goumaishuliang2, String goumaijine, String yonghuming, String beizhu, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(shangpinbianhao==null||shangpinbianhao.equals("")){pmap.put("shangpinbianhao", null);}else{pmap.put("shangpinbianhao", shangpinbianhao);}
		if(shangpinmingcheng==null||shangpinmingcheng.equals("")){pmap.put("shangpinmingcheng", null);}else{pmap.put("shangpinmingcheng", shangpinmingcheng);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(pinpai==null||pinpai.equals("")){pmap.put("pinpai", null);}else{pmap.put("pinpai", pinpai);}
		if(xiaoliang==null||xiaoliang.equals("")){pmap.put("xiaoliang", null);}else{pmap.put("xiaoliang", xiaoliang);}
		if(kucun==null||kucun.equals("")){pmap.put("kucun", null);}else{pmap.put("kucun", kucun);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(goumaijine==null||goumaijine.equals("")){pmap.put("goumaijine", null);}else{pmap.put("goumaijine", goumaijine);}
		if(yonghuming==null||yonghuming.equals("")){pmap.put("yonghuming", null);}else{pmap.put("yonghuming", yonghuming);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		int total= purchaseServer.getCount(pmap);
		pageBean.setTotal(total);
		List<Purchase> list= purchaseServer.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "goumaijilu_list";
	}
	
	@RequestMapping("goumaijiluList2.do")
	public String goumaijiluList2(@RequestParam(value="page",required=false)String page,
								  ModelMap map, HttpSession session, Purchase PURCHASE, String shangpinbianhao, String shangpinmingcheng, String leixing, String pinpai, String xiaoliang, String kucun, String jiage, String goumaishuliang1, String goumaishuliang2, String goumaijine, String yonghuming, String beizhu, String issh, HttpServletRequest request){
		/*if(session.getAttribute("user")==null){
			return "login";
		}*/
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		pmap.put("issh","否");
		pmap.put("yonghuming", (String)request.getSession().getAttribute("username"));
		if(shangpinbianhao==null||shangpinbianhao.equals("")){pmap.put("shangpinbianhao", null);}else{pmap.put("shangpinbianhao", shangpinbianhao);}
		if(shangpinmingcheng==null||shangpinmingcheng.equals("")){pmap.put("shangpinmingcheng", null);}else{pmap.put("shangpinmingcheng", shangpinmingcheng);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(pinpai==null||pinpai.equals("")){pmap.put("pinpai", null);}else{pmap.put("pinpai", pinpai);}
		if(xiaoliang==null||xiaoliang.equals("")){pmap.put("xiaoliang", null);}else{pmap.put("xiaoliang", xiaoliang);}
		if(kucun==null||kucun.equals("")){pmap.put("kucun", null);}else{pmap.put("kucun", kucun);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(goumaijine==null||goumaijine.equals("")){pmap.put("goumaijine", null);}else{pmap.put("goumaijine", goumaijine);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		
		int total= purchaseServer.getCount(pmap);
		pageBean.setTotal(total);
		List<Purchase> list= purchaseServer.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "goumaijilu_list2";
	}
	
	
	@RequestMapping("gmjlList.do")
	public String gmjlList(@RequestParam(value="page",required=false)String page,
						   ModelMap map, HttpSession session, Purchase PURCHASE, String shangpinbianhao, String shangpinmingcheng, String leixing, String pinpai, String xiaoliang, String kucun, String jiage, String goumaishuliang1, String goumaishuliang2, String goumaijine, String yonghuming, String beizhu, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(shangpinbianhao==null||shangpinbianhao.equals("")){pmap.put("shangpinbianhao", null);}else{pmap.put("shangpinbianhao", shangpinbianhao);}
		if(shangpinmingcheng==null||shangpinmingcheng.equals("")){pmap.put("shangpinmingcheng", null);}else{pmap.put("shangpinmingcheng", shangpinmingcheng);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(pinpai==null||pinpai.equals("")){pmap.put("pinpai", null);}else{pmap.put("pinpai", pinpai);}
		if(xiaoliang==null||xiaoliang.equals("")){pmap.put("xiaoliang", null);}else{pmap.put("xiaoliang", xiaoliang);}
		if(kucun==null||kucun.equals("")){pmap.put("kucun", null);}else{pmap.put("kucun", kucun);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(goumaijine==null||goumaijine.equals("")){pmap.put("goumaijine", null);}else{pmap.put("goumaijine", goumaijine);}
		if(yonghuming==null||yonghuming.equals("")){pmap.put("yonghuming", null);}else{pmap.put("yonghuming", yonghuming);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		int total= purchaseServer.getCount(pmap);
		pageBean.setTotal(total);
		List<Purchase> list= purchaseServer.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "goumaijilulist";
	}
	
	@RequestMapping("deleteGoumaijilu.do")
	public String deleteGoumaijilu(int id,HttpServletRequest request){
		purchaseServer.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:goumaijiluList.do";
	}
	
	
}
