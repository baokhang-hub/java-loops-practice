import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so nguyen n: ");
        int n = input.nextInt();

        int soLonNhat = 0;
        int soNhoNhat = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap so nguyen thu " + i + ": ");
            int number = input.nextInt();

            if (i == 1) {
                soLonNhat = number;
                soNhoNhat = number;
            } else {
                if (number > soLonNhat) {
                    soLonNhat = number;
                }

                if (number < soNhoNhat) {
                    soNhoNhat = number;
                }
            }
        }
        System.out.println("So lon nhat la: " + soLonNhat + ", so nho nhat la: " + soNhoNhat);
    }
}
