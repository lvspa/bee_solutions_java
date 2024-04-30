import java.util.Scanner;

public class Bee2543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int n = scanner.nextInt();
                int i = scanner.nextInt();
                int cont = 0;

                for (int k = 0; k < n; k++) {
                    int id = scanner.nextInt();
                    int gp = scanner.nextInt();

                    if (id == i && gp == 0) {
                        cont++;
                    }
                }

                System.out.println(cont);
            } catch (Exception e) {
                break;
            }
        }

        scanner.close();
    }
}
