<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<body>

<h2>Welcome!</h2>

<br>
<br>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your surname: ${employee.surname}
<br>
Your department: ${employee.department}
<br>
Your auto: ${employee.auto}
<br>
Language(s)
<ul>

    <c:forEach var="lang" items="${employee.languages}">

    <li>${lang}</li>

    </c:forEach>

</ul>
<br>
Your phoneNumber: ${employee.phoneNumber}
<br>
Your email: ${employee.email}
<br>

</body>

</html>
