package day05;

import java.util.List;

public class MemberDAOTest
{

	public static void main(String[] args)
	{
		MemberDTO member = new MemberDTO();
		member.setId("admin");
		member.setPassword("1234");
		member.setName("관리자");
		member.setEmail("admin@admin.com");

		MemberDAO dao = new MemberDAO();
//		if(dao.addMember(member))
//			System.out.println("^^");
//		else
//			System.out.println("-_-");

		List<MemberDTO> memberList = dao.getMembers();

		System.out.println(memberList.size());

		for (MemberDTO memberDTO : memberList)
		{
			System.out.println(memberDTO);
		}
	}

}