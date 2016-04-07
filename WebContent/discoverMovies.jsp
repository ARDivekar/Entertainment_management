<%-- 
    Document   : discoverMovies
    Created on : 6 Apr, 2016, 11:28:50 PM
    Author     : Abhishek Divekar
--%>

<%@page import="EntityClasses.ListingType"%>
<%@page import="InterfaceClasses.IC_Discover"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
IC_Discover discoverObj = new IC_Discover();
discoverObj.loadDiscoverPage(request, response, ListingType.MOVIE, 0, 10);
%>
