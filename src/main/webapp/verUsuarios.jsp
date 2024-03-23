<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<!-- Begin Page Content -->
<!-- Page Heading -->
<h2 class="h4 mb-0 text-gray-800">Ver Usuarios</h2>
<p class="mb-4">Aquí puede visualizar la lista completa de usuarios</p>
<!-- DataTales Example -->
<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
    </div>
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Rol</th>
                        <th style="width: 85px">Acciones</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Rol</th>
                        <th style="width: 85px">Acciones</th>
                    </tr>
                </tfoot>
                <% List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios"); %>
                <tbody>
                    <% for(Usuario usuario : listaUsuarios) { %>
                    <tr>
                        <td><%=usuario.getId() %></td>
                        <td><%=usuario.getNombreUsuario()%></td>
                        <td><%=usuario.getRol()%></td>
                        <td style="display: flex; width:230px;">
                            <form name="editar" action="SvEditUsuarios" method="GET">
                                <input type="hidden" name="idUsuario" value="<%=usuario.getId()  %>">
                                <button type="submit" class="btn btn-primary" style="margin-right: 5px;" >
                                <i class="fas fa-pen"></i> Editar
                                </button>
                            </form>
                            <form name="eliminar" action="SvElimUsuarios" method="POST">
                                <input type="hidden" name="idUsuario" value="<%=usuario.getId()  %>">
                                <button type="submit" class="btn btn-danger" style="margin-left: 5px;">
                                <i class="fas fa-trash"></i> Eliminar
                                </button>                                
                            </form>
                        </td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </div>
    </div>
</div>

<%@include file="components/bodyfinal.jsp" %>   
