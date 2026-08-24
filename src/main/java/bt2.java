import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Nhap so nguyen A nho hon so nguyen duong B!!!!");
        System.out.println("Nhap so nguyen duong A: ");
        int numberA = inputNumber.nextInt();
        System.out.println("Nhap so nguyen duong B: ");
        int numberB = inputNumber.nextInt();

        if (numberA >= numberB) {
            System.out.println("Vui long nhap so A < so B !!!");
            return;
        }

        int count = 0;
        for (int i = numberA; i <= numberB; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println("Co tong cong " + count + " so nguyen to");
    }
}
