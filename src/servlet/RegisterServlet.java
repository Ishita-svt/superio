@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String pass = req.getParameter("password");

        User user = new User(name, email, pass);

        if(UserDAO.register(user)) {
            res.sendRedirect("login.jsp");
        } else {
            res.sendRedirect("register.jsp?error=1");
        }
    }
}
