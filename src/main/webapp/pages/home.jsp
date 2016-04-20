<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>

    <jsp:attribute name="title">Home</jsp:attribute>

    <jsp:body>


        <!-- Page Content -->
        <div class="container">

            <!-- Marketing Icons Section -->

            <!-- /.row -->


            <c:url value="/email.html" var="email"/>

            <!-- Portfolio Section -->

            <!-- /.row -->

            <!-- Features Section -->
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="page-header">Welcome!</h2>
                </div>
                <div class="col-md-6">
                    <h3>Hello World!</h3> <h4>Hi ${roleid}, ${message}</h4>
                </div>
                <div class="col-md-6">
                    <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/springmvc angular.jpg" alt="">
                </div>
            </div>
            <!-- /.row -->

        </div>

    </jsp:body>

</page:template>
