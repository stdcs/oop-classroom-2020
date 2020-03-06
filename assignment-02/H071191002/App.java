class App{
    public static void main(String[] args) throws Exception {
        // Instansiasi class Login
        Login login = Login.getInstance();
        login.auth("Farha", "parhan");
        login.status();
    }
}