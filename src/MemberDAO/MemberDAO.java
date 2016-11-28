package MemberDAO;

import java.util.ArrayList;

import Workshop1.Member;

public interface MemberDAO
{
	int createMember(MemberDTO m);
	int updateMember(MemberDTO m);
	int removeMember(MemberDTO m);
	MemberDTO listMember(String name);
	ArrayList<Member> listAllMember();
}
