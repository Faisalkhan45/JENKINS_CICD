<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // Simulating the test case logic
    String expectedGreeting = "Hello, World!";
    String actualGreeting = "Hello, World!"; // This would be the output from your application

    // Checking if the actual greeting matches the expected greeting
    boolean testResult = expectedGreeting.equals(actualGreeting);
%>
<html>
<head>
    <title>Hello World Test Result</title>
</head>
<body>
    <h1>Hello World Test Result</h1>
    <p>Expected: <strong><%= expectedGreeting %></strong></p>
    <p>Actual: <strong><%= actualGreeting %></strong></p>
    
    <c:choose>
        <c:when test="${testResult}">
            <p style="color: green;">Test Passed!</p>
        </c:when>
        <c:otherwise>
            <p style="color: red;">Test Failed!</p>
        </c:otherwise>
    </c:choose>
</body>
</html>
