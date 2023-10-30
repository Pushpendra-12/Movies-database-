<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.*, movies.org.model.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Watchlist</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../../css/listseries.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background: url("../images/bg-registration-form-7.jpg") no-repeat;
            background-size: cover;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #eee;
            color: #333;
            font-size: 14px;
        }

        th {
            background-color: #f8f8f8;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Watchlist</h2>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<WatchList> list = (List<WatchList>) request.getAttribute("list");

                    for(WatchList watch : list) {
                %>     
                <tr>    
                    <td><%= watch.getName() %></td>
                    <td>
                        <form action="/watchlist/deletelist" method="GET">
                            <input type="hidden" name="id" value="<%= watch.getId() %>">
                            <input type="submit" value="Delete" class='btn btn-danger'>
                        </form>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
