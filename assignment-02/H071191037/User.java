import java.util.Map;

// password

class User
{
    private Integer id;
    private String userName;
    private String password;
    private UserDetail userDetail;

    public User(Integer id, String userName, String password)
    {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public String getPassword()
    {
        return password;       
    }

    public Integer getId()
    {
        return id;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserDetail(Map <Integer, UserDetail> userDetailMap)
    {
        userDetail = userDetailMap.get(id);
    }
}