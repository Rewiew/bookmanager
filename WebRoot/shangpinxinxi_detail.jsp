﻿<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>商品信息详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  商品信息详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%' height=44>商品编号：</td><td width='39%'>${shopItem.shangpinbianhao}</td>
<td  rowspan=6 align=center><a href=${shopItem.tupian} target=_blank><img src=${shopItem.tupian} width=228 height=215 border=0></a></td></tr><tr>
<td width='11%' height=44>商品名称：</td><td width='39%'>${shopItem.shangpinmingcheng}</td>
</tr><tr>
<td width='11%' height=44>类型：</td><td width='39%'>${shopItem.leixing}</td>
</tr><tr>
<td width='11%' height=44>销量：</td><td width='39%'>${shopItem.xiaoliang}</td>
</tr><tr>
<td width='11%' height=44>库存：</td><td width='39%'>${shopItem.kucun}</td>
</tr><tr>
<td width='11%' height=44>价格：</td><td width='39%'>${shopItem.jiage}</td>
</tr><tr>


<td width='11%' height=100  >商品简介：</td><td width='39%' colspan=2 height=100 >${shopItem.shangpinjianjie}</td></tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
  </table>

  </body>
</html>

