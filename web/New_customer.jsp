<%-- 
    Document   : New_customer
    Created on : Mar 27, 2016, 3:38:22 PM
    Author     : jhronek
--%>

<%@include file="/header.html" %>
            
            <div class="container-fluid">
                <div class="row">

                    <div class="col-sm-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">Please enter your information to sign up for Titan Online Banking services.</div>
                            <div class="panel-body">After you submit your information a representative will get in contact with you
                            to complete your registration.
                            <br/>
                            <br/>
                            ${alertMessage}
                            </div>
                        </div>
                    </div>

                    <form action="NewCustomerServlet" method="post">
                        <div class="col-sm-6">
                            <div class="form-group-sm">
                                <label for="firstName">First Name:</label>
                                <input type="text" class="form-control" value="${user.firstName}" id="firstName" name="firstName">
                            </div>

                            <div class="form-group-sm">
                                    <label for="lastName">Last Name:</label>
                                    <input type="text" class="form-control" value="${user.lastName}" id="lastName" name="lastName">
                            </div>

                            <div class="form-group-sm">
                                <label for="phone">Phone Number:</label>
                                <input type="tel" class="form-control" value="${user.phone}" id="phone" name="phone">
                            </div>

                            <div class="form-group-sm">
                                <label for="address">Address:</label>
                                <input type="text" class="form-control" value="${user.address}" id="address" name="address">
                            </div>

                            <div class="form-group-sm">
                                <label for="city">City:</label>
                                <input type="text" class="form-control" value="${user.city}" id="city" name="city">
                            </div>

                            <div class="form-group-sm">
                                <label for="state">State:</label>
                                <input type="text" class="form-control" value="${user.state}" id="state" name="state">
                            </div>

                            <div class="form-group-sm">
                                <label for="zipcode">Zip Code:</label>
                                <input type="text" class="form-control" value="${user.zipcode}" id="zipcode" name="zipcode">
                            </div>

                            <div class="form-group-sm">
                                <label for="email">Email:</label>
                                <input type="email" class="form-control" value="${user.email}" id="email" name="email">
                            </div>
                            
                            <br/>
                            <button type="submit" class="btn btn-primary" name="submit">Submit</button>

                        </div>
                    </form>
                </div>
            </div>
            
 <%@include file="/footer.jsp" %>