<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<html>
<head>
    <title>Result</title>
</head>
<body>
<div class="alert alert-info text-center">
    <strong>ax^2 + bx + c = 0</strong>
</div>
<form class="form-group" action="/" style="text-align: center" method=post>
    <div class="col-xl">
        <p class="text-center">Enter values A B C</p>
        <hr>
        <div style="display: flex; justify-content: center">
            <div class="form-group">
                <input type="number" placeholder="Enter A" name="A" id="A" style="margin-right: 30px" required>
            </div>
            <div class="form-group">
                <input type="number" placeholder="Enter B" name="B" id="B" style="margin-right: 30px" required>
            </div>
            <div class="form-group">
                <input type="number" placeholder="Enter C" name="C" id="C" required>
            </div>
        </div>
        <hr>
        <button type="submit" class="btn btn-group-sm btn-primary">Show result</button>
        <hr>
    </div>
</form>
</body>
</html>

