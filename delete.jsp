<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Video - VeeGo Video Browsing System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 30px;
            background-color: #f9f9f9;
        }

        h2 {
            color: #c00;
        }

        form {
            max-width: 600px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 10px;
        }

        label {
            display: block;
            margin-top: 15px;
            font-weight: bold;
        }

        input[type="text"],
        textarea {
            width: 100%;
            padding: 8px;
            border: 1px solid #aaa;
            border-radius: 5px;
            background-color: #f1f1f1;
        }

        input[type="submit"] {
            margin-top: 20px;
            background-color: #d9534f;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #c9302c;
        }
    </style>
</head>
<body>

<%
    String id = request.getParameter("id");
    String title = request.getParameter("title");
    String description = request.getParameter("description");
    String category = request.getParameter("category");
    String file_path = request.getParameter("file_path");
    String uploaded_by = request.getParameter("uploaded_by");
%>

<h2>Confirm Video Deletion</h2>

<form action="delete" method="post"> 
    <label for="id">Video ID</label>
    <input type="text" name="id" id="id" value="<%=id%>" readonly>

    <label for="title">Title</label>
    <input type="text" name="title" id="title" value="<%=title%>" readonly>

    <label for="description">Description</label>
    <textarea name="description" id="description" rows="3" readonly><%=description%></textarea>

    <label for="category">Category</label>
    <input type="text" name="category" id="category" value="<%=category%>" readonly>

    <label for="file_path">File Path</label>
    <textarea name="file_path" id="file_path" rows="2" readonly><%=file_path%></textarea>

    <label for="uploaded_by">Uploaded By</label>
    <input type="text" name="uploaded_by" id="uploaded_by" value="<%=uploaded_by%>" readonly>

    <input type="submit" value="Confirm Delete">
</form>

</body>
</html>
