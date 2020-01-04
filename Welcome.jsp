<!DOCTYPE html>
<%@page import="java.util.Date" %>
<html>
<body>
   <h1 style="color: #AD0396;text-align:center">
   <%="Welcome to JSP" %>
   <br>
   <%= new java.util.Date()%>
   <br>
   <%=1+24*8/2 %>
   <br>
   <%= new Date()%>
   <br>
   <%
      for(int i=1;i<=3;i++)
      {
    	  out.print(i);
    %> 
    <br>
    <%
      }
    %>
   </h1>
</body>
</html>