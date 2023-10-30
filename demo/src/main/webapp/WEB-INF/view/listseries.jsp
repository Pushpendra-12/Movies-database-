<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.*, movies.org.model.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Watched Series</title>
    <link rel="stylesheet" href="../../css/listseries.css">
</head>
<body>
    <table>
        <thead>
            <h2>Watched Series</h2>
            <tr>
                <th>Name</th>
                <th>Seasons</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<WatchedSeries> list = (List<WatchedSeries>) request.getAttribute("series");

                for(WatchedSeries series : list) {
                    out.println("<tr>");    
                    out.println("<td>" + series.getName() + "</td>");
                    out.println("<td>" + series.getSeasons() + "</td>");
                    out.println("</tr>");
                }
            %>     
        </tbody>
    </table>
</body>
</html>
