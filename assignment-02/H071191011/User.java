class User
{
	private int id;
	private String userName, password;
	private UserDetail userDetail;

	public User(int id, String userName, String password, UserDetail userDetail)
	{
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userDetail = userDetail;
	}

	public int getId()
	{
		return id;
	}

	public String getUserName()
	{
		return userName;
	}

	public boolean comparePassword(String pass)
	{
		return pass.equals(password);
	}

	public UserDetail getUserDetail()
	{
		return userDetail;
	}
}
