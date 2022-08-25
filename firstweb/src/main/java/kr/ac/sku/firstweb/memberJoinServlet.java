package kr.ac.sku.firstweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sku.dto.MemberDTO;
import kr.ac.sku.service.MemberService;

/**
 * Servlet implementation class memberJoinServlet
 */
@WebServlet("/memberJoin")
public class memberJoinServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		
		MemberDTO member = new MemberDTO();
		
		member.setName(request.getParameter("name"));
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		member.setEmail(request.getParameter("email"));
		
		MemberService service = new MemberService();
		service.joinMember(member);
	}

}
