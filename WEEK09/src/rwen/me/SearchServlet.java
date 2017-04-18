package rwen.me;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String search = request.getParameter("search");
		String left = request.getParameter("left");
		String right = request.getParameter("right");
		
		if (left.equals("baidu")) {
			String leftweb = "http://www.baidu.com/s?wd=" + search;
			request.setAttribute("left",leftweb);
		}
		else {
			String leftweb = "http://www.sogou.com/web?query=" + search;
			request.setAttribute("left",leftweb );
		}
		
		if (right.equals("baidu")) {
			String rightweb = "http://www.baidu.com/s?wd=" + search;
			request.setAttribute("right",rightweb );
		}
		else {
			String rightweb = "http://www.sogou.com/web?query=" + search;
			request.setAttribute("right",rightweb );
		}
		
		request.getRequestDispatcher("Search.jsp").forward(request, response); 
		
	}

}
