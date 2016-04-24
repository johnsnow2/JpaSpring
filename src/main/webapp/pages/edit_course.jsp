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

           <c:url var="addUrl" value="/admin/edit_course"/>

            <c:set var="beanEdit" value="${coursesListEdit}"/>

          <form id="course-form" method="post" action="${addUrl}">
            <p>course_name</p>
            <input type="text" name="courseName"  value="${beanEdit.courseName}"/>
            <p>duration</p>
            <input type="text" name="duration" value="${beanEdit.duration}"/>
            <p>subject</p>
            <input type="text" name="subject" value="${beanEdit.subject}"/>
            <p>start</p>
            <input type="text" name="start" value="${beanEdit.start}"/>
            <p>end</p>
            <input type="text" name="end" value="${beanEdit.end}"/>
            <p>id_professor</p>
            <select name="idUser">
              <c:forEach var="beanProf" items="${professorsList}">
                <option value="${beanProf.idUser}">${beanProf.name}</option>
              </c:forEach>
            </select>
            <input type="submit" />
          </form>


        </div>
        <div class="col-md-6">
          <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/springmvc angular.jpg" alt="">
        </div>
      </div>
      <!-- /.row -->

    </div>

  </jsp:body>

</page:template>
