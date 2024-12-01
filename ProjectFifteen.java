import java.util.Scanner;

public class ProjectFifteen {
    public static void main(String[] args) {
        System.out.println("Sum of odd natural numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum += oddNumber;

            System.out.println("Sum of first " + n + " odd numbers is: " + sum);

        }
    }
}
