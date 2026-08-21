import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int number = inputNumber.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.println(number * i);
        }
    }
}
