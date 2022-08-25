package kr.ac.sku.service;

import java.util.List;

import kr.ac.sku.dao.MemberDAO;
import kr.ac.sku.dto.MemberDTO;

public class MemberService
{
	MemberDAO dao = new MemberDAO();
	//회원가입
	public void joinMember(MemberDTO member)
	{
		boolean resultFlag = dao.addMember(member);
		if(resultFlag)
			System.out.println("DB에 저장성공");
		else
			System.out.println("DB에 저장하다가 문제 발생");
	}
	
	//회원목록
	public List<MemberDTO> getMemberList()
	{
		return dao.getMembers();
	}
}