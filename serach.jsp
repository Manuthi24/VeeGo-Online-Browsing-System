<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>VeeGo | Browse by Category</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f1f1f1;
        }

        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 2rem;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            max-width: 500px;
            width: 100%;
        }

        h2 {
            text-align: center;
            margin-bottom: 1.5rem;
            color: #333;
        }

        label {
            font-weight: bold;
            margin-bottom: 0.5rem;
            display: block;
        }

        select {
            width: 100%;
            padding: 0.75rem;
            font-size: 1rem;
            border: 1px solid #ccc;
            border-radius: 8px;
            margin-bottom: 1.5rem;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #FF0000;
            color: white;
            padding: 0.75rem;
            border: none;
            border-radius: 8px;
            font-size: 1rem;
            font-weight: bold;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #cc0000;
        }
    </style>
</head>
<body>

<div class="container">
    <form action="search" method="post">
        <h2><i class="fas fa-video"></i> Search Videos by Category</h2>

        <label for="category">Select a Category</label>
        <select name="category" id="category" required>
            <option value="" disabled selected>-- Choose Category --</option>
            <option value="Education">📘 Education</option>
            <option value="Entertainment">🎬 Entertainment</option>
            <option value="News">📰 News</option>
            <option value="Technology">💻 Technology</option>
            <option value="Autos & Vehicles">🚗 Autos & Vehicles</option>
            <option value="LifeStyle">🏡 Lifestyle</option>
            <option value="Sports">🏅 Sports</option>
            <option value="Gaming">🎮 Gaming</option>
            <option value="Animals">🐾 Animals</option>
            <option value="Health & Wellness">🧘 Health & Wellness</option>
        </select>

        <input type="submit" value="Browse Videos">
    </form>
</div>

</body>
</html>
