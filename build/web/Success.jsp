<%-- 
    Document   : Success
    Created on : Mar 27, 2016, 5:45:08 PM
    Author     : jhronek
--%>

<%@include file="/header.html" %>
            
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-4">
                        
                    </div>
                    
                    <div class="col-sm-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">Registration Successful</div>
                            <div class="panel-body">
                                Your account has been created with below information.
                                <ul class="list-group">
                                    <li class="list-group-item">First Name:&nbsp;${user.firstName}</li>
                                    <li class="list-group-item">Last Name:&nbsp;${user.lastName}</li>
                                    <li class="list-group-item">Phone:&nbsp;${user.phone}</li>
                                    <li class="list-group-item">Address:&nbsp;${user.address}</li>
                                    <li class="list-group-item">City:&nbsp;${user.city}</li>
                                    <li class="list-group-item">State:&nbsp;${user.state}</li>
                                    <li class="list-group-item">Zipcode:&nbsp;${user.zipcode}</li>
                                    <li class="list-group-item">Email:&nbsp;${user.email}</li>
                                    <li class="list-group-item">Username: &nbsp;${user.username}</li>
                                    <li class="list-group-item">Password: &nbsp;${user.password}</li>
                                </ul>
                            </div>
                    </div>
                    <div class="col-sm-4">
                        
                    </div>
                </div>
            </div>
            
<%@include file="/footer.jsp" %>