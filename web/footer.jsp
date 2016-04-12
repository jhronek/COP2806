            
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
        <%
            GregorianCalendar currentDate = new GregorianCalendar();
            int currentYear = currentDate.get(Calendar.YEAR);
        %>
        
        <footer class="footer navbar-fixed-bottom">
            <div class="container">
                <p class="text-muted text-center">
                    <span class="glyphicon glyphicon-copyright-mark"></span> Copyright <%= currentYear %> John Hronek                  
                </p>
            </div>
        </footer>
    </body>
</html>