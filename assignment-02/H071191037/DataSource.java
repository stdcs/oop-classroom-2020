import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class DataSource
{
    private Map <String, User> userMap = new HashMap<>();
    private Map <Integer, UserDetail> userDetailMap = new HashMap<>();
    static DataSource dataSource = new DataSource();

    private DataSource() 
    {

    }

    public static DataSource getObject() 
    {
        return dataSource;
    }

    String read(String fileName) throws IOException
    {
        FileReader reader = null;
        BufferedReader read = null;
        String tempString = "";
        try 
        {
            reader = new FileReader(fileName);
            read = new BufferedReader(reader);
            
            String lineRead = "";
            while((lineRead = read.readLine()) != null)
            {
                tempString += lineRead + "\n";
            }
        }
        catch (IOException e) 
        {
            System.out.println("something went wrong with file handling");
        }
        finally
        {
            try
            {
                if(reader != null)
                {
                    reader.close();
                }
                if(read != null)
                {
                    read.close();
                }
            }
            catch(IOException io)
            {
                System.out.println("unclosed");
            }
        }

        return tempString;

    }

    private void putUserDetail() throws IOException
    {
        String dataSplit[] = read("UserDetail.txt").split("\n");

        for(int i = 0; i < dataSplit.length; i++)
        {
            String userData[] = dataSplit[i].split(";");
            Integer id = Integer.parseInt(userData[0]);
            userDetailMap.put(id, new UserDetail(id, userData[1], userData[2], userData[3]));
        }
    }

    private void putUser() throws IOException
    {
        String dataSplit[] = read("User.txt").split("\n");

        for(int i = 0; i < dataSplit.length; i++)
        {
            String userData[] = dataSplit[i].split(";");
            Integer id = Integer.parseInt(userData[0]);
            userMap.put(userData[1], new User(id, userData[1], userData[2]));
        }
    }

    public User getUser(String key) throws IOException
    {
        putUser();
        return userMap.get(key);
    }

    public UserDetail getUserDetail(Integer key) throws IOException
    {
        putUserDetail();
        return userDetailMap.get(key);
    }
}