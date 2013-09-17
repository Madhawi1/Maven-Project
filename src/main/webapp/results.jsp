<%-- 
    Document   : results
    Created on : Sep 12, 2013, 10:40:17 AM
    Author     : Madhawi
    Index      : 110099T
--%>
<%@page import="com.mycompany.mavenprojectnic.NIC_Calc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NIC Interpretor Results</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Results of NIC Interpretation</h1>
         <%
          try{   
          String nmbr=  request.getParameter("IDnumber");
          NIC_Calc Calculator= new NIC_Calc(nmbr);
          Calculator.findBirthday();
          Calculator.getGender();
          Calculator.findIsVoter();
          
          out.println("Birthday :"+Calculator.getBirthday());
          %>
          <br>
          <%
          out.println("Gender :"+Calculator.getGender());
          %>
          <br>
          <% out.println(Calculator.getIsVoter());
          }catch(Exception ex){
                    out.println("Enter NIC number correctly");
                }
          
         %>   
    </body>
</html>
