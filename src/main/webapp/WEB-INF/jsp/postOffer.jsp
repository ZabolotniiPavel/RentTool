<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <title>Post offer Page</title>
 </head>
 <body>
     <h1>Post offer</h1>
     <form:form modelAttribute="offer">
        <table>
            <tr>
                <td>
                    Item name:
                </td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
            <tr>
                <td colspat="2">
                   <input type="submit" value="Add Offer">
                </td>
            </tr>
        </table>
     </form:form>
 </body>
 </html>