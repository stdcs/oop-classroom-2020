import java.util.NoSuchElementException;

class Login
{
	private static Login login;
	private User user;
	private UserDetail userDetail; // tidak terpakai?
	private DataSource dataSource;

	private Login(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	public static Login getInstance() throws java.io.IOException
	{
		if (login == null)
			login = new Login(DataSource.getInstance());

		return login;
	}

	public void auth(String userName, String password) throws NoSuchElementException
	{
		User user = dataSource.getUser(userName);

		if (user == null)
			throw new NoSuchElementException("No such username \"" + userName + "\"");
		if (user.comparePassword(password) == false)
			throw new NoSuchElementException("Invalid password for \"" + userName + "\"");
		
		this.user = user;
	}

	public void status()
	{
		if (user == null)
			System.out.println("Unauthenticated.");
		else
		{
			UserDetail detail = user.getUserDetail();
			System.out.println("Name          : " + detail.getName());
			System.out.println("Email         : " + detail.getEmail());
			System.out.println("Date of Birth : " + detail.getDateOfBirth());
			System.out.println("Username      : " + user.getUserName());
		}
	}

	public void deauth()
	{
		user = null;
	}
}
