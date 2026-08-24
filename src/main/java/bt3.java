import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so nguyen n: ");
        int number = input.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0; i <= number; i++) {
            if (a>number){
                break;
            }
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
