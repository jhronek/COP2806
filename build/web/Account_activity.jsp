<%-- 
    Document   : Account_activity
    Created on : Apr 10, 2016, 7:14:16 PM
    Author     : jhronek
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/header.html" %>
<c:if test="${sessionScope.user != null}">
    <p>Welcome, ${user.getFirstName()}, to your account activity page.</p>
    <p>Your Checking Balance = ${checkingAccount.balance}</p>
    <p>Your Savings Balance = ${savingsAccount.balance}</p>
    <p>Recent Checking Transactions = ${checkingAccount.transactions}</p>
    <p>Recent Savings Transactions = ${savingsAccount.transactions}</p>
</c:if>

<c:if test="${sessionScope.user == null}">
    <p>Please login to access your account.</p>
</c:if>
<%@include file="/footer.jsp" %>