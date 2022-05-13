import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.UserDAOImpl;
import com.user.model.User;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDAOImpl dao = new UserDAOImpl();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int id = Integer.parseInt(request.getParameter("id"));
		User user = new User(id, name, email);

		dao.create(user);

	}

}
