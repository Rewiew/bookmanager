package com.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.server.DepositServer;
import com.util.PageBean;
import com.util.db;
import java.sql.SQLException;

@Controller
public class DepositController {
	@Resource
	private DepositServer dingdanxinxiService;


   
	@RequestMapping("addDingdanxinxi.do")
	public String addDingdanxinxi(HttpServletRequest request, com.entity.Deposit deposit, HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		deposit.setAddtime(time.toString().substring(0, 19));
			String sql="";
			sql="update goumaijilu set issh='是' where yonghuming='"+(String)request.getSession().getAttribute("username")+"'";
			db dbo = new db();
			dbo.hsgexecute(sql);
		dingdanxinxiService.add(deposit);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "dingdanxinxiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:dingdanxinxiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateDingdanxinxi.do")
	public String doUpdateDingdanxinxi(int id, ModelMap map, com.entity.Deposit deposit){
		deposit =dingdanxinxiService.getById(id);
		map.put("deposit", deposit);
		return "dingdanxinxi_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("dingdanxinxiDetail.do")
	public String dingdanxinxiDetail(int id, ModelMap map, com.entity.Deposit deposit){
		deposit =dingdanxinxiService.getById(id);
		map.put("deposit", deposit);
		return "dingdanxinxi_detail";
	}
//	前台详细
	@RequestMapping("ddxxDetail.do")
	public String ddxxDetail(int id, ModelMap map, com.entity.Deposit deposit){
		deposit =dingdanxinxiService.getById(id);
		map.put("deposit", deposit);
		return "dingdanxinxidetail";
	}
//	
	@RequestMapping("updateDingdanxinxi.do")
	public String updateDingdanxinxi(int id, ModelMap map, com.entity.Deposit deposit, HttpServletRequest request, HttpSession session){
		dingdanxinxiService.update(deposit);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:dingdanxinxiList.do";
	}

//	分页查询
	@RequestMapping("dingdanxinxiList.do")
	public String dingdanxinxiList(@RequestParam(value="page",required=false)String page,
								   ModelMap map, HttpSession session, com.entity.Deposit deposit, String dingdanhao, String dingdanjine1, String dingdanjine2, String dingdanneirong, String yonghuming, String xingming, String shouji, String dizhi, String beizhu, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(dingdanhao==null||dingdanhao.equals("")){pmap.put("dingdanhao", null);}else{pmap.put("dingdanhao", dingdanhao);}
		if(dingdanjine1==null||dingdanjine1.equals("")){pmap.put("dingdanjine1", null);}else{pmap.put("dingdanjine1", dingdanjine1);}
		if(dingdanjine2==null||dingdanjine2.equals("")){pmap.put("dingdanjine2", null);}else{pmap.put("dingdanjine2", dingdanjine2);}
		if(dingdanneirong==null||dingdanneirong.equals("")){pmap.put("dingdanneirong", null);}else{pmap.put("dingdanneirong", dingdanneirong);}
		if(yonghuming==null||yonghuming.equals("")){pmap.put("yonghuming", null);}else{pmap.put("yonghuming", yonghuming);}
		if(xingming==null||xingming.equals("")){pmap.put("xingming", null);}else{pmap.put("xingming", xingming);}
		if(shouji==null||shouji.equals("")){pmap.put("shouji", null);}else{pmap.put("shouji", shouji);}
		if(dizhi==null||dizhi.equals("")){pmap.put("dizhi", null);}else{pmap.put("dizhi", dizhi);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		int total=dingdanxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<com.entity.Deposit> list=dingdanxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "dingdanxinxi_list";
	}
	
	@RequestMapping("dingdanxinxiList2.do")
	public String dingdanxinxiList2(@RequestParam(value="page",required=false)String page,
									ModelMap map, HttpSession session, com.entity.Deposit deposit, String dingdanhao, String dingdanjine1, String dingdanjine2, String dingdanneirong, String yonghuming, String xingming, String shouji, String dizhi, String beizhu, String issh, HttpServletRequest request){
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
		
		pmap.put("yonghuming", (String)request.getSession().getAttribute("username"));
		if(dingdanhao==null||dingdanhao.equals("")){pmap.put("dingdanhao", null);}else{pmap.put("dingdanhao", dingdanhao);}
		if(dingdanjine1==null||dingdanjine1.equals("")){pmap.put("dingdanjine1", null);}else{pmap.put("dingdanjine1", dingdanjine1);}
		if(dingdanjine2==null||dingdanjine2.equals("")){pmap.put("dingdanjine2", null);}else{pmap.put("dingdanjine2", dingdanjine2);}
		if(dingdanneirong==null||dingdanneirong.equals("")){pmap.put("dingdanneirong", null);}else{pmap.put("dingdanneirong", dingdanneirong);}
		if(xingming==null||xingming.equals("")){pmap.put("xingming", null);}else{pmap.put("xingming", xingming);}
		if(shouji==null||shouji.equals("")){pmap.put("shouji", null);}else{pmap.put("shouji", shouji);}
		if(dizhi==null||dizhi.equals("")){pmap.put("dizhi", null);}else{pmap.put("dizhi", dizhi);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		
		int total=dingdanxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<com.entity.Deposit> list=dingdanxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "dingdanxinxi_list2";
	}
	
	
	@RequestMapping("ddxxList.do")
	public String ddxxList(@RequestParam(value="page",required=false)String page,
						   ModelMap map, HttpSession session, com.entity.Deposit deposit, String dingdanhao, String dingdanjine1, String dingdanjine2, String dingdanneirong, String yonghuming, String xingming, String shouji, String dizhi, String beizhu, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		if(dingdanhao==null||dingdanhao.equals("")){pmap.put("dingdanhao", null);}else{pmap.put("dingdanhao", dingdanhao);}
		if(dingdanjine1==null||dingdanjine1.equals("")){pmap.put("dingdanjine1", null);}else{pmap.put("dingdanjine1", dingdanjine1);}
		if(dingdanjine2==null||dingdanjine2.equals("")){pmap.put("dingdanjine2", null);}else{pmap.put("dingdanjine2", dingdanjine2);}
		if(dingdanneirong==null||dingdanneirong.equals("")){pmap.put("dingdanneirong", null);}else{pmap.put("dingdanneirong", dingdanneirong);}
		if(yonghuming==null||yonghuming.equals("")){pmap.put("yonghuming", null);}else{pmap.put("yonghuming", yonghuming);}
		if(xingming==null||xingming.equals("")){pmap.put("xingming", null);}else{pmap.put("xingming", xingming);}
		if(shouji==null||shouji.equals("")){pmap.put("shouji", null);}else{pmap.put("shouji", shouji);}
		if(dizhi==null||dizhi.equals("")){pmap.put("dizhi", null);}else{pmap.put("dizhi", dizhi);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		int total=dingdanxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<com.entity.Deposit> list=dingdanxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "dingdanxinxilist";
	}
	
	@RequestMapping("deleteDingdanxinxi.do")
	public String deleteDingdanxinxi(int id,HttpServletRequest request){
		dingdanxinxiService.delete(id);
		String url = request.getHeader("Referer");
		System.out.println(url);
		return "redirect:"+url;
		//return "redirect:dingdanxinxiList.do";
	}
	
	
}
