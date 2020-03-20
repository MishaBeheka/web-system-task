<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="resp" scope="request" type="web.system.task.dto.SolutionModelResponseDto"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<html>
<head>
    <title>Index</title>
</head>
<body>
<div class="container text-center">
    <table class="table table-bordered text-center">
        <thead class="thead-dark text-center">
        <tr>
            <th>A</th>
            <th>B</th>
            <th>C</th>
            <th>Discriminant</th>
            <th>X1</th>
            <th>X2</th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td>
                   ${resp.a}
                </td>
                <td>
                    ${resp.b}
                </td>
                <td>
                    ${resp.c}
                </td>
                <td>
                    ${resp.d}
                </td>
                <td>
                    ${resp.x1}
                </td>
                <td>
                    ${resp.x2}
                </td>
            </tr>
        </tbody>
    </table>
    <a type="submit" class="btn-group-sm btn-primary text-center" href="/">Back to calculate</a>
</div>
</body>
</html>
