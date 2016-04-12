<%-- 
    Document   : password_reset
    Created on : Apr 10, 2016, 9:56:48 PM
    Author     : jhronek
--%>

<%@include file="/header.html" %>

            <form action="PasswordResetServlet" method="post">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-sm-4">
                            
                        </div>

                        <div class="col-sm-4">
                            <div>
                                <p>Please enter a new password.</p>
                            </div>

                            <div class="form-inline">
                                <label for="password">Password:</label>
                                <input type="password" class="form-control" value="" id="password" name="password">
                            </div>

                            <br/>
                            <button type="submit" name="submit">Reset Password</button>
                        </div>
                        
                        <div class="col-sm-4">

                        </div>
                    </div>
                </div>
            </form>
<%@include file="/footer.jsp" %>