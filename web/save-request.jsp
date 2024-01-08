<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<style>

    form {
        background-color: #9cfe8b;
    }

    p {
        background-color: #e6060c;
        color: white;
        width: 200px;
    }
</style>
<head>
    <title>Save Request</title>
</head>
<body>
<form action="save-request" method="post">
    <table>
        <tbody>
        <tr>
            <td>Name:</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td>
                <input type="text" name="email">
            </td>
        </tr>
        <tr>
            <td>City:</td>
            <td>
                <input type="text" name="city">
            </td>
        </tr>
        <tr>
            <td>Number:</td>
            <td>
                <input type="text" name="number">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
        </tbody>
    </table>



</form>
<% String error = request.getParameter("error");
    if (error != null && !error.isEmpty()){
%>
<p><%=error%></p>
<%

    }
%>
</body>
</html>