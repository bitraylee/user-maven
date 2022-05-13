
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.UserDAOImpl;
import com.user.model.User;

/**
 * Servlet implementation class DisplayUserServlet
 */
public class DisplayUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAOImpl dao = new UserDAOImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		User user = dao.read(id);

		PrintWriter out = response.getWriter();

		if (user== null) {
			out.println("No data present");

		} else {
			out.println("ID" + user.getId());
			out.println("Name" + user.getName());
			out.println("Email" + user.getEmail());
		}

	}

}
