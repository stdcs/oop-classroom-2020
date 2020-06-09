package Project.SimpleLogin;

public class UserDetail {
    private Integer id;
    private String name;
    private String dateOfBirth;
    private String email;

    UserDetail(int id, String name, String dateOfBirth, String email) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

}
