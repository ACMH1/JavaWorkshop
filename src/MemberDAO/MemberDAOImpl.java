package MemberDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import Workshop1.Member;

public class MemberDAOImpl implements MemberDAO
{
	private Connection openConnection()
	{
		try
		{
			Class.forName(SQL.MySQLConstants.DRIVER_CLASS);
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null;
		try
		{
			conn = DriverManager.getConnection(SQL.MySQLConstants.URL, SQL.MySQLConstants.USER,
					SQL.MySQLConstants.PASSWORD);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public int createMember(MemberDTO m)
	{
		Connection conn = null;
		try
		{
			conn = openConnection();
			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO `club`.`member` (`MemberNumber`, `surName`, `firstName`, `secondName`) VALUES (?, ?, ?, ?);");
			ps.setInt(1, m.getMemberNumber());
			ps.setString(2, m.getSurName());
			ps.setString(3, m.getFirstName());
			ps.setString(4, m.getSecondName());
			if (ps.executeUpdate() != 1)
				throw new SQLException("Update failed");
			conn.commit();
			ps.close();
			conn.close();
			return 1;
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			try
			{
				conn.rollback();
				conn.close();
				return 0;
			} catch (SQLException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return 0;
	}

	@Override
	public int updateMember(MemberDTO m)
	{
		Connection conn = null;
		try
		{
			conn = openConnection();
			PreparedStatement ps = conn.prepareStatement(
					"UPDATE `club`.`member` SET `surName` = ?, `firstName` = ?, `secondName` = ? WHERE MemberNumber = ?");
			ps.setInt(4, m.getMemberNumber());
			ps.setString(1, m.getSurName());
			ps.setString(2, m.getFirstName());
			ps.setString(3, m.getSecondName());
			if (ps.executeUpdate() != 1)
				throw new SQLException("Update failed");
			conn.commit();
			ps.close();
			conn.close();
			return 1;
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			try
			{
				conn.rollback();
				conn.close();
				return 0;
			} catch (SQLException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return 0;
	}

	@Override
	public int removeMember(MemberDTO m)
	{
		Connection conn = null;
		try
		{
			conn = openConnection();
			PreparedStatement ps = conn.prepareStatement(
					"DELETE FROM `club`.`member` WHERE MemberNumber = ?");
			ps.setInt(1, m.getMemberNumber());
			if (ps.executeUpdate() != 1)
				throw new SQLException("Update failed");
			conn.commit();
			ps.close();
			conn.close();
			return 1;
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			try
			{
				conn.rollback();
				conn.close();
				return 0;
			} catch (SQLException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return 0;
	}

	@Override
	public MemberDTO listMember(String name)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Member> listAllMember()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
