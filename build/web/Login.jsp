<%-- 
    Document   : Login
    Created on : Apr 10, 2016, 7:12:25 PM
    Author     : jhronek
--%>


<%@include file="/header.html" %>

            <form action="LoginServlet" method="post">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-sm-4">
                            <p>If you do not already have an account, please visit our 
                                New Customers page to sign up. &nbsp;
                                <a class="btn btn-sm btn-primary" href="New_customer.jsp" role="button">New Customers</a>
                            </p>
                        </div>

                        <div class="col-sm-4">
                            <div class="form-inline">

                                    <label for="username">Username:</label>
                                    <input type="text" class="form-control" placeholder="Username" id="username" name="username">
                            </div>

                            <div class="form-inline">
                                    <label for="password">Password:</label>
                                    <input type="password" class="form-control" placeholder="Password" id="password" name="password">
                            </div>

                            <br/>
                            <button type="submit" class="btn btn-primary" name="submit">Login</button>
                            <a class="btn btn-primary" href="password_reset.jsp">Reset Password</a>
                        </div>
                        <div class="col-sm-4">

                        </div>
                    </div>
                </div>
            </form>

<%@include file="/footer.jsp" %>