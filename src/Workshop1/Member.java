package Workshop1;

public class Member extends Person implements Comparable<Member>
{
	private int memberNumber;

	public Member(String surName, String firstName, String secondName, int memberNumber)
	{
		super(surName, firstName, secondName);
		this.memberNumber = memberNumber;
	}

	public Member(String surName, String firstName, int memberNumber)
	{
		super(surName, firstName);
		this.memberNumber = memberNumber;
	}

	public int getMemberNumber()
	{
		return memberNumber;
	}

	public String toString()
	{
		return secondName == null ? memberNumber + ": " + surName + " " + firstName
				: memberNumber + ": " + surName + " " + firstName + " " + secondName;
	}

	@Override
	public int compareTo(Member arg0)
	{
		// TODO Auto-generated method stub
		if (memberNumber > arg0.getMemberNumber())
			return 1;
		else if (memberNumber < arg0.getMemberNumber())
			return -1;
		return 0;
	}
}