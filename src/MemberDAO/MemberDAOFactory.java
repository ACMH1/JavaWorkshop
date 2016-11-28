package MemberDAO;

public class MemberDAOFactory
{
	public static MemberDAO getMemberDAOInstance()
	{
		return new MemberDAOImpl();
	}
}
