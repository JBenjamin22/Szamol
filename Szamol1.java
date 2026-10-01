import java.util.Scanner;

public class Szamol1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Agy meg egy egesz szamot: ");
        int szam = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i == szam * 10) {
                break;
            }
            if (i % szam == 0) {
                continue;
            }
            System.out.println(i);
        }
        
        scanner.close();
    }
}