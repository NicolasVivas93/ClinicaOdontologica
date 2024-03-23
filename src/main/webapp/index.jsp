<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<h4>Bienvenido, <%=request.getSession().getAttribute("usuario") %></h4>

<%@include file="components/bodyfinal.jsp" %>                

</html>