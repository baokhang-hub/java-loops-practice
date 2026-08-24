import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so nguyen n: ");
        int number = input.nextInt();

        int S = 0;
        for (int i = 1; i <= number; i++) {
            S += i * (i + 1);
        }
        System.out.println("Ket qua la: " + S);
    }
}
