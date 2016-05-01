<%-- 
    Document   : Transfer
    Created on : Apr 30, 2016, 1:13:54 PM
    Author     : jhronek
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/header.html" %>
<c:if test="${sessionScope.user != null}">
    <p>Welcome, ${user.getFirstName()}, to your account activity page.</p>
    <div class="container">
        <form role="form">
            <label class="radio-inline"><input type="radio" name="from" value="checking">From Checking</label>
            <label class="radio-inline"><input type="radio" name="from" value="savings">From Savings</label>
        </form>
    </div>
        <label for="focusedInput">Amount:</label>
        <input class="form-control" id="transferAmount" type"number">
    <div class="container">
        <form role="form">
            <label class="radio-inline"><input type="radio" name="to" value="Checking">To Checking</label>
            <label class="radio-inline"><input type="radio" name="to" value="Savings">To Savings</label>
        </form>
    </div>
</c:if>

<c:if test="${sessionScope.user == null}">
    <p>Please login to access your account.</p>
</c:if>
<%@include file="/footer.jsp" %>