import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dziesiętną: ");
        int liczba = scanner.nextInt();
        String binarna = dziesietnaNaBinarna(liczba);
        System.out.println("Liczba binarna: " + binarna);
    }

    public static String dziesietnaNaBinarna(int liczba) {
        if (liczba == 0) {
            return "0";
        }
        StringBuilder binarna = new StringBuilder();
        while (liczba > 0) {
            int reszta = liczba % 2;
            binarna.insert(0, reszta);
            liczba /= 2;
        }
        return binarna.toString();
    }
}
