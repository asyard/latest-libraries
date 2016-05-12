<%@ page import="tr.util.SpringUtil" %>
<%@ page import="tr.bean.TestBean" %><%--
  Created by IntelliJ IDEA.
  User: suleymanu
  Date: 5/9/2016
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>

<%

  TestBean bean = SpringUtil.context.getBean(TestBean.class);
  bean.setA("a");

%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  Selam   <%= bean.getA()%>
  </body>
</html>
