<%@ page import="dao.JobDAO, model.Job, java.util.*" %>

<h2>Available Jobs</h2>

<%
List<Job> list = JobDAO.getAllJobs();
for(Job j : list) {
%>
    <p>
    <b><%= j.getTitle() %></b><br>
    Company: <%= j.getCompany() %><br>
    Location: <%= j.getLocation() %><br>
    <%= j.getDescription() %>
    </p>
    <hr>
<% } %>
