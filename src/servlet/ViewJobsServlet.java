package servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.List;
import dao.JobDAO;
import model.Job;

public class ViewJobsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        List<Job> jobs = JobDAO.getAllJobs();
        req.setAttribute("jobList", jobs);

        RequestDispatcher rd = req.getRequestDispatcher("viewjobs.jsp");
        rd.forward(req, res);
    }
}
