import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        final int soBiMat = 9;
        Scanner input = new Scanner(System.in);

        int count = 0;

        do {
            System.out.println("Nhap so cua ban: ");
            int number = input.nextInt();
            count++;

            if (number == soBiMat) {
                break;
            } else {
                System.out.println("Sai roi, thu lai!");
            }

        } while (true);

        System.out.println("Chinh xac! Ban da doan dung sau " + count + " lan");
    }
}