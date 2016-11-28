package MemberDAO;

import java.io.Serializable;

public class MemberDTO implements Serializable
{
	private int memberNumber;
	private String surName;
	private String firstName;
	private String secondName;

	public int getMemberNumber()
	{
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber)
	{
		this.memberNumber = memberNumber;
	}

	public String getSurName()
	{
		return surName;
	}

	public void setSurName(String surName)
	{
		this.surName = surName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getSecondName()
	{
		return secondName;
	}

	public void setSecondName(String secondName)
	{
		this.secondName = secondName;
	}

}
