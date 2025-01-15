public class PasswordProtectedFile {
    String password;

    public PasswordProtectedFile(int password_length) {
        PasswordGenerator pg = new PasswordGenerator();
        this.password = pg.generate(password_length);
    }

    public boolean open(String user_password) {
        if(password.equals(user_password)){
            return true;
        }
        return false;
    }
}
