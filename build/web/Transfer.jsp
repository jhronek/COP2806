<%-- 
    Document   : Transfer
    Created on : Apr 30, 2016, 1:13:54 PM
    Author     : jhronek
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/header.html" %>
<c:if test="${sessionScope.user != null}">
    <p>Welcome, ${user.getFirstName()}, to your account activity page.</p>
    
</c:if>

<c:if test="${sessionScope.user == null}">
    <p>Please login to access your account.</p>
</c:if>
<%@include file="/footer.jsp" %>