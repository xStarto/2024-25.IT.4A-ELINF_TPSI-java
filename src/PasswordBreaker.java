public class PasswordBreaker {
    final static int PASSWORD_LENGTH = 4;

    public static void main(String[] args) {
        // viene creato un file protetto da una password segreta ...
        PasswordProtectedFile file = new PasswordProtectedFile(PASSWORD_LENGTH);
        // e un cracker che deve scoprire la password del file
        PasswordCracker cracker1 = new PasswordCracker( 1, file, PASSWORD_LENGTH);
        PasswordCracker cracker2 = new PasswordCracker( 2, file, PASSWORD_LENGTH);
        PasswordCracker cracker3 = new PasswordCracker( 3, file, PASSWORD_LENGTH);


        System.out.println("Un file password protected e' stato creato. ");
        System.out.println("Stiamo cercando di violare la password... ");
        System.out.println();
    
        cracker1.start();
        cracker2.start();
        cracker3.start();
    }
}
