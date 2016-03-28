<%-- 
    Document   : Success
    Created on : Mar 27, 2016, 5:45:08 PM
    Author     : jhronek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
        <head>
                <meta charset="utf-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Titan Online Banking - Registration Success</title>
                <link rel="stylesheet" href="css/bootstrap.min.css">
                
        </head>

        <body>
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="index.html">Titan Online Banking</a>
                    </div>
                    <ul class="nav navbar-nav">
                        <li><a href="Login.html">Login</a></li>
                    </ul>
                </div>
            </nav>
            
            <div class="jumbotron">
                <div class="container">
                    <h1>Titan Online Banking <small>New Registration Successful!</small></h1>
                     <p>Protect your money with the strength of a Titan!</p>
                     <br/>
                     <p>Thank you for joining Titan Online Banking</p>
                </div>
            </div>
            
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-4">
                        
                    </div>
                    
                    <div class="col-sm-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">Registration Successful</div>
                            <div class="panel-body">
                                Your account has been created with below information.
                                Please check your email for username.
                                <ul class="list-group">
                                    <li class="list-group-item">First Name:&nbsp;${user.firstName}</li>
                                    <li class="list-group-item">Last Name:&nbsp;${user.lastName}</li>
                                    <li class="list-group-item">Phone:&nbsp;${user.phone}</li>
                                    <li class="list-group-item">Address:&nbsp;${user.address}</li>
                                    <li class="list-group-item">City:&nbsp;${user.city}</li>
                                    <li class="list-group-item">State:&nbsp;${user.state}</li>
                                    <li class="list-group-item">Zipcode:&nbsp;${user.zipcode}</li>
                                    <li class="list-group-item">Email:&nbsp;${user.email}</li>
                                </ul>
                            </div>
                    </div>
                    <div class="col-sm-4">
                        
                    </div>
                </div>
            </div>
            
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>    
        </body>
    </html>
