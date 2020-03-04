import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

class DataSource
{
	private static DataSource dataSource;
	private Map<String, User> userMap;
	private Map<Integer, UserDetail> userDetailMap;

	private DataSource()
	{
		userMap = new HashMap<String, User>();
		userDetailMap = new HashMap<Integer, UserDetail>();
	}

	public static DataSource getInstance() throws IOException
	{
		if (dataSource == null)
		{
			dataSource = new DataSource();
			dataSource.putUserDetail();
			dataSource.putUser();
		}

		return dataSource;
	}

	private void putUserDetail() throws IOException
	{
		FileInputStream inputStream = new FileInputStream("UserDetail.txt");
		InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line;
		while ((line = bufferedReader.readLine()) != null)
		{
			if (line.length() > 0)
			{
				String[] splitted = line.split(";", 4);
				int id = Integer.parseInt(splitted[0]);

				userDetailMap.put(id, new UserDetail(id, splitted[1], splitted[2], splitted[3]));
			}
		}

		bufferedReader.close();
	}

	private void putUser() throws IOException
	{
		FileInputStream inputStream = new FileInputStream("User.txt");
		InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line;
		while ((line = bufferedReader.readLine()) != null)
		{
			if (line.length() > 0)
			{
				String[] splitted = line.split(";", 3);
				int id = Integer.parseInt(splitted[0]);

				UserDetail userDetail = userDetailMap.get(id);
				if (userDetail == null)
				{
					bufferedReader.close();
					throw new NoSuchElementException("unknown ID " + id);
				}

				userMap.put(splitted[1], new User(id, splitted[1], splitted[2], userDetail));
			}
		}

		bufferedReader.close();
	}

	public User getUser(String key)
	{
		return userMap.get(key);
	}

	public UserDetail getUserDetail(int key)
	{
		return userDetailMap.get(key);
	}
}
