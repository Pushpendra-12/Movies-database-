<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.*, movies.org.model.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Movie database</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- MATERIAL DESIGN ICONIC FONT -->
    <link rel="stylesheet" href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

    <!-- STYLE CSS -->
    <link rel="stylesheet" href="../../css/style.css">
    
  
</head>

<body>

<div class="wrapper">
    <div class="inner">
        <form:form action="/watchlist/addlistprocess" method="post" modelAttribute="list">
            <h3>Create your own movies database</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.</p>
            
            <label class="form-group">
                <form:input path="Name" type="text" class="form-control" />
                <span>Enter movie name </span>
                <span class="border"></span>
            </label>
            
            
            
            <div class="button-container">
                <button>Submit <i class="zmdi zmdi-arrow-right"></i></button>
                <a href="/watchlist/yourlist" style="text-decoration: none; "><button type="button" class="btn btn-primary">View watchlist</button></a>
            </div>
        </form:form>
    </div>
</div>

<script>
    var successMessage = "${successMessage}";
    if (successMessage) {
        alert(successMessage);
    }

    var errorMessage = "${errorMessage}";
    if (errorMessage) {
        alert(errorMessage);
    }
</script>

</body>
</html>
