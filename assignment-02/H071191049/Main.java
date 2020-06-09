public class Main{
    public static void main(String[] args) throws Exception {
        // Instansiasi class Login
        Login login = Login.getInstance();
        //memanggil object login kemudian login dengan nama, password
        login.auth("naim", "Naim");//alur program akan di lempar ke class login
        login.status();
    }
}