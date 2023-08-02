import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to get multiplication table:");
        int n, i;
        n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.format("%d * %d = %d\n", n, i, n * i);
        }

    }

}
