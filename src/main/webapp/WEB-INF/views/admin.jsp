<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Page</title>
</head>
<body>
    <h1>Admin Management</h1>

    <!-- Contoh form untuk menambah admin -->
    <form action="${pageContext.request.contextPath}/admin" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name">
        <br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email">
        <br>
        <button type="submit">Submit</button>
    </form>

    <!-- Contoh tampilan daftar admin -->
    <h2>List of Admins</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop untuk menampilkan admin -->
            <c:forEach var="admin" items="${admins}">
                <tr>
                    <td>${admin.id}</td>
                    <td>${admin.name}</td>
                    <td>${admin.email}</td>
                    <td>
                        <!-- Link untuk edit dan delete -->
                        <a href="${pageContext.request.contextPath}/admin/edit/${admin.id}">Edit</a>
                        <a href="${pageContext.request.contextPath}/admin/delete/${admin.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
