import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Nhap so nguyen n: ");
        int n= input.nextInt();

        int i = 1;
        long giaiThua = 1;

        while (i <= n) {
            giaiThua = giaiThua * i;
            i++;
        }
        System.out.println("Giai thua = " + giaiThua);
    }
}
