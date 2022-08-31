<%-- 
    Document   : PaginaDestino
    Created on : 25/08/2022, 9:12:29 p. m.
    Author     : Marlon gonzalez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <form action="PaginaDestino.jsp" method="get">
           
                <p>Peticion: <input type="text" name="texto"> <br></p>
              <input type="submit" value="ok">
        
        
            </form>
        <%@page import="b.Logica"  %>
        <%String pregunta= (String) request.getParameter("texto");
         b.Logica m= new Logica();
         m.Robot(pregunta);
         out.print(m.Robot(pregunta));
        
        %>
        
    </body>
</html>
