import java.io.IOException;

class Main
{

    public static void main(String[] args) throws IOException
    {
        Login login = Login.getObject();
        
        login.auth("alba054", "hellfire12");
        login.status();
    }
}