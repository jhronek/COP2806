<%-- 
    Document   : transaction
    Created on : Apr 10, 2016, 7:13:51 PM
    Author     : jhronek
--%>

<%@include file="/header.html" %>
<c:if test="${sessionScope.user != null}">
    <p>Welcome, ${user.getFirstName()}, to your account activity page.</p>
    
</c:if>

<c:if test="${sessionScope.user == null}">
    <p>Please login to access your account.</p>
</c:if>
<%@include file="/footer.jsp" %>