<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <html lang="en">
 <link href="/css/style.css" rel="stylesheet" type="text/css">
 <head>
     <meta charset="UTF-8">
     <title>Post offer Page</title>
 </head>
 <body>
     <h1>Post offer</h1>
     <a href="http://localhost:8080/postOffer?lang=ro">Romana</a>
     <a href="http://localhost:8080/postOffer?lang=ru">Русский</a>
     <form:form modelAttribute="offer">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <table>
            <tr>
                <td>
                    <spring:message code="name"/>
                </td>
                <td>
                    <form:input path="name" />
                </td>
                <td>
                    <form:errors path="name" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td colspan="3">
                   <input type="submit" value='<spring:message code="publish"/>'>
                </td>
            </tr>
        </table>
     </form:form>
 </body>
 </html>