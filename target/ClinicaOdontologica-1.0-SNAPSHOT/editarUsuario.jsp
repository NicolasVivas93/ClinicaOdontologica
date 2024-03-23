<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Editar Usuario</h1>
<p>Esto es para editar usuarios del sistema</p>

<% Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioEdit");%>

<form class="user" action="SvEditUsuarios" method="POST">
    <div class="form-group col">       
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUsuario"
                   placeholder="Nombre de Usuario" name="nombreUsuario" value="<%= usuario.getNombreUsuario()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contrasenia"
                   placeholder="Contraseña" name="contrasenia" value="<%= usuario.getContrasenia()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol"
                   placeholder="Rol" name="rol" value="<%= usuario.getRol()%>">
        </div>
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Editar Usuario
    </button>
    <hr>
</form>

<%@include file="components/bodyfinal.jsp" %>
