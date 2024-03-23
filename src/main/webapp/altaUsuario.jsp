
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Alta Usuarios</h1>
<p>Esto es para dar de alta usuarios del sistema</p>

<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">       
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUsuario"
                   placeholder="Nombre de Usuario" name="nombreUsuario">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contrasenia"
                   placeholder="Contraseña" name="contrasenia">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol"
                   placeholder="Rol" name="rol">
        </div>
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Crear Usuario
    </button>
    <hr>
</form>

<%@include file="components/bodyfinal.jsp" %>
