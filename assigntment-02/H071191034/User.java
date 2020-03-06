class User{
    private Integer id;
    private String username;
    private String password;
    private UserDetail userDetail;

    User (Integer id, String username, String password, UserDetail userDetail){
        this.id = id;
        this.username = username;
        this.password = password;
        this.userDetail = userDetail;
    }

    public Integer getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public UserDetail getUserDetail(){
        return userDetail;
    }
}