import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vui long nhap so A lon hon so B");
        System.out.println("Nhap so nguyen duong A: ");
        int numberA = input.nextInt();
        System.out.println("Nhap so nguyen duong B: ");
        int numberB = input.nextInt();

        if (numberA >= numberB) {
            System.out.println("Vui long nhap lai so!!!");
            return;
        } else if (numberA < 0 || numberB < 0) {
            System.out.println("Vui long nhap lai so lon hon 0!!!");
            return;
        }

        int tongChan = 0;
        int tongLe = 0;
        for (int i = numberA; i <= numberB; i++) {
            if (i % 2 == 0) {
                tongChan += i;
            } else {
                tongLe += i;
            }
        }
        System.out.println("Tong so le la " + tongLe + ", tong so chan la " + tongChan);
    }
}
