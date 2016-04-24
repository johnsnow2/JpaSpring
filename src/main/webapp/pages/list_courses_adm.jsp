<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tags/page.jspf" %>
<%@ include file="/WEB-INF/tags/taglib.jspf" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>

  <jsp:attribute name="title">Home</jsp:attribute>

  <jsp:body>


    <!-- Page Content -->
    <div class="container">

      <div class="row">
        <div class="col-lg-12">
          <h2 class="page-header">Список курсов</h2>
        </div>
        <div class="col-md-6">
          <c:choose>
            <c:when test="${fn:length(coursesList) == 0}">No such courses</c:when>

            <c:otherwise>
              <table id="list_courses_table">
                <thead>
                <tr>
                  <td>№</td>
                  <td>course_name</td>
                  <td>duration</td>
                  <td>subject</td>
                  <td>start</td>
                  <td>end</td>
                </tr>
                </thead>


                <c:forEach var="bean" items="${coursesList}">

                  <tr>
                    <td>${bean.idCourses}</td>
                   <td>${bean.courseName}</td>
                    <td>${bean.duration}</td>
                    <td>${bean.subject}</td>
                    <td>${bean.start}</td>
                    <td>${bean.end}</td>
                    <td><a href="/admin/delete/idcourse/${bean.idCourses}">delete</a></td>
                    <td><a href="/admin/edit_course/${bean.idCourses}">edit</a></td>
                  </tr>

                </c:forEach>
              </table>
            </c:otherwise>
          </c:choose>
        </div>
        <div class="col-md-6">
          <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/springmvc angular.jpg" alt="">
        </div>
      </div>
      <!-- /.row -->

    </div>

  </jsp:body>

</page:template>
