<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>VeeGo Video Browsing System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
        }
        form {
            max-width: 500px;
        }
        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }
        input[type="text"], textarea {
            width: 100%;
            padding: 8px;
            margin-top: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            margin-top: 15px;
            padding: 10px 20px;
        }
    </style>
</head>
<body>
    <h2>Upload Video</h2>
    <form action="upload" method="post">
        <label for="title">Title</label>
        <input type="text" name="title" id="title" required>

        <label for="description">Description</label>
        <textarea name="description" id="description" rows="4" cols="40" required></textarea>

        <label for="category">Category</label>
        <input type="text" name="category" id="category" required>

        <label for="file_path">File Path</label>
        <textarea name="file_path" id="file_path" rows="2" cols="40" required></textarea>

        <label for="uploaded_by">Uploaded By</label>
        <input type="text" name="uploaded_by" id="uploaded_by" required>

        <input type="submit" value="Upload Video">
    </form>
</body>
</html>
