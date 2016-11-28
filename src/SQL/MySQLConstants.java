package SQL;

public class MySQLConstants
{
	public static final String URL = "jdbc:mysql://localhost/test";
	public static final String USER = "root";
	public static final String PASSWORD = "password";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	public static final String MEMBER_TABLE_NAME = "club.member";
	public static final String[] MEMBER_TABLE_COLS =
	{ "MemberNumber", "surName", "firstName", "secondName" };

	public static final String FACILITY_TABLE_NAME = "club.facility";
	public static final String[] FACILITY_TABLE_COLS =
	{ "name", "description" };
}
