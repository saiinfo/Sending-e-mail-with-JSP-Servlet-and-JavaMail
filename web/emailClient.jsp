<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Send an e-mail</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }
        
        h2 {
            text-align: center;
        }
        
        form {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        
        table {
            width: 100%;
        }
        
        td:first-child {
            width: 30%;
        }
        
        input[type="text"],
        textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        
        input[type="submit"] {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>

<body>
    <form action="MailDispatcherServlet" method="post">
        <h2>Send New E-mail</h2>
        <table>
            <tr>
                <td>To:</td>
                <td><input type="text" name="email" /></td>
            </tr>
            <tr>
                <td>Subject:</td>
                <td><input type="text" name="subject" /></td>
            </tr>
            <tr>
                <td>Message:</td>
                <td><textarea rows="10" cols="50" name="message"></textarea></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Send" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
