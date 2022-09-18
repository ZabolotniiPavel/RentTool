<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <title>Post offer Page</title>
 </head>
 <body>
     <h1>Post offer</h1>
     <a href="http://localhost:8080/postOffer?lang=ro">Romana</a>
     <a href="http://localhost:8080/postOffer?lang=ru">Русский</a>
     <form:form modelAttribute="offer">
        <table>
            <tr>
                <td>
                    <spring:message code="name"/>
                </td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                   <input type="submit" value='<spring:message code="publish"/>'>
                </td>
            </tr>
        </table>
     </form:form>
 </body>
 </html>