public class Main {
    public static void main(String[] args) throws Exception {
        Login login = Login.getInstance();
        // contoh login yang benar sesuai daftar nama User biodata
        login.auth("Devon", "dArK");
        login.status();
        login.logout();

        System.out.println("");

        // contoh login yang salah
        login.auth("Devon", "dark");
        login.status();
        login.logout();

        System.out.println("");

        // ada lagi contoh login salah atau kata sandi msk salah (keduanya User salah)
        login.auth("Detong", "dArKness");
        login.status();
        login.logout();
    }
}