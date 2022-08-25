package kr.ac.sku.firstweb;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sku.dto.MemberDTO;
import kr.ac.sku.service.MemberService;

/**
 * Servlet implementation class memberListServlet
 */
@WebServlet("/memberList")
public class memberListServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		//memberList 얻어오기
		MemberService service = new MemberService();
		List<MemberDTO> memberList = service.getMemberList();
		
		//위에서 얻어온 memberList를 이용해서 회원목록 화면을 만들어준다.
		//서블릿에서 화면을 만드는 것은 복잡하므로, 화면은 jsp가 만들도록 forwarding
		request.setAttribute("memberList", memberList);
		RequestDispatcher rd = request.getRequestDispatcher("memberList.jsp");
		
		rd.forward(request, response)
	}
	
}
