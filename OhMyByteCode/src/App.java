import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String jvmName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.printf("jvmName: %s%n", jvmName);

        long pid = ProcessHandle.current().pid();
        System.out.printf("pid: %d%n", pid);

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numeroInserito = tastiera.nextInt();
        System.out.printf("Hai inserito il numero %d!%n", numeroInserito);
        
        tastiera.close();
    }
}
