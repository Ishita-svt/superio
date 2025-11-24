package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JobDAO;
import model.Job;

@WebServlet("/AddJobServlet")
public class AddJobServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String title = req.getParameter("title");
        String company = req.getParameter("company");
        String location = req.getParameter("location");
        String description = req.getParameter("description");

        Job job = new Job(title, company, location, description);

        JobDAO.addJob(job);

        res.sendRedirect("viewjobs.jsp");
    }
}
