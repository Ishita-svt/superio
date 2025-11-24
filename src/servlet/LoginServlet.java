@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        String email = req.getParameter("email");
        String pass = req.getParameter("password");

        if(UserDAO.login(email, pass)) {
            res.sendRedirect("addjob.jsp");
        } else {
            res.sendRedirect("login.jsp?error=1");
        }
    }
}
