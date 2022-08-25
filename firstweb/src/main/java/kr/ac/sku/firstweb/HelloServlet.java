package kr.ac.sku.firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(
{ "/hi", "/hello" })
public class HelloServlet extends HttpServlet
{
	public HelloServlet()
	{
		System.out.println("Hello Servlet 생성");
	}

	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init() 호출");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy()
	{
		System.out.println("destroy() 호출");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		System.out.println("service() 호출");
		System.out.println("Hello Servlet!");
		response.setContentType("text/html; charset=UTF-8");
		int count = Integer.parseInt(request.getParameter("count"));
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>first servlet</title>");
		out.print("<body>");
		for (int i = 0; i < count; i++)
		{
			out.print("hello servlet<br>");
		}
		out.print("</body></html>");

	}

}
