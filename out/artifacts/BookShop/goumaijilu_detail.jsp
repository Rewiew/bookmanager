<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>购买记录详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  购买记录详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>商品编号：</td><td width='39%'>${PURCHASE.shangpinbianhao}</td>
     <td width='11%'>商品名称：</td><td width='39%'>${PURCHASE.shangpinmingcheng}</td></tr><tr>
     <td width='11%'>类型：</td><td width='39%'>${PURCHASE.leixing}</td>
     <td width='11%'>&nbsp;</td>
     <td width='39%'>&nbsp;</td>
     </tr><tr>
     <td width='11%'>销量：</td><td width='39%'>${PURCHASE.xiaoliang}</td>
     <td width='11%'>库存：</td><td width='39%'>${PURCHASE.kucun}</td></tr><tr>
     <td width='11%'>价格：</td><td width='39%'>${PURCHASE.jiage}</td>
     <td width='11%'>购买数量：</td><td width='39%'>${PURCHASE.goumaishuliang}</td></tr><tr>
     <td width='11%'>购买金额：</td><td width='39%'>${PURCHASE.goumaijine}</td>
     <td width='11%'>购买人：</td><td width='39%'>${PURCHASE.yonghuming}</td></tr><tr>
     <td width='11%'>备注：</td><td width='39%'>${PURCHASE.beizhu}</td>
     <td>&nbsp;</td><td>&nbsp;</td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
  </table>

  </body>
</html>

