public class bt6 {
    public static void main(String[] args) {
        int[] scores = {8, 7, 9, 6, 10};

        double sum = 0;
        for (int i : scores) {
            sum += i;
        }

        double average = (double) sum / scores.length;

        System.out.println("tong la: " + sum + ", trung binh cong la: " + average);
    }
}
