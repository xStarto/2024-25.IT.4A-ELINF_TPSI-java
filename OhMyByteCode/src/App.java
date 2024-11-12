import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ciao sono una slot machine FURBA!");

        long pid = ProcessHandle.current().pid();
        System.out.printf("Il mio pid e': %d%n", pid);

        int numeroSegretessimo = (int) (Math.random() * 1000) + 1;
        System.out.println("Ho estratto un numero da 1 a 1000");

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Indovina il numero inserendolo qui sotto");
        int numeroInserito = tastiera.nextInt();
        System.out.printf("Hai inserito il numero %d!%n", numeroInserito);

        if (numeroInserito == numeroSegretessimo) {
            System.out.println("INCREDIBILE come hai fatto?? Hai VINTOhhh!");
        } else {
            System.out.println("Ritenta!");
        }

        tastiera.close();
    }
}
