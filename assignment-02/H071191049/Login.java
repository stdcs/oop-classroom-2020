import java.util.NoSuchElementException;

//akan di akses di main method
public class Login {
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource = DataSource.getInstance();
    private boolean dataValid = false;
    // single pattern constructor login
    private static Login loginInstance;

    private Login() {
    }
    public static Login getInstance() {
        if (loginInstance == null) {
            loginInstance = new Login();
        }
        return loginInstance;
    }

    // method pertama yang menerima data user dan password yang di loginkan
    public void auth(String userName, String password) throws NoSuchElementException{
        //akan dilempar ke class dataSource untuk memeriksa username yang dimasukkan
        //seteleh pelemparan dilakukan maka sekarang nilai user berubah menjadi data dari username yg dimasukkan
        user = dataSource.getUser(userName);
        //selanjutnya alur program beralih ke kelas user
        try {
            dataValid = user.pemeriksaPassword(password);
            //kita juga bisa menggunakan dataValid = dataSource.getUser(userName).getPassword().equals(password);
            if(dataValid){
            //jika dataValid true maka userDetail diberi nilai dari Datasource
                userDetail = user.getUserDetail();
            }
        } catch (Exception e) {
            //jika data tidak valid maka akan diberikan input sesuai yang diminta pada soal
            throw new NoSuchElementException("No such Username : " + userName);
        }
        
    }

    public void status(){
        //status akan mencetak jika datanya valid
        if(dataValid == true){
            System.out.printf("Name            : %s \n",userDetail.getName());
            System.out.printf("Email           : %s \n",userDetail.getEmail());
            System.out.printf("Date of Birth   : %s \n",userDetail.getDateOfBirth());
            System.out.printf("User Name       : %s \n",user.getUserName());
            System.out.printf("Password        : %s \n",user.getPassword());
        }else{
            System.out.println("Login Gagal");
        }  
    }
}