package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/HomeServlet", "/*" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
//		response.getWriter().append("I am the Home servlet");
		Mathematics m=new Mathematics();
//		response.getWriter().print(request.getPathInfo());
		PrintWriter out = response.getWriter();
		String url=request.getPathInfo();
		switch(url)
		{
		case "/add":
			out.print(m.add());
			break;
		case "/subtract":
			out.print(m.subtract());
			break;
		case "/multiply":
			out.print(m.multiply());
			break;
			default:
				out.println("Invaliid url");
				}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
