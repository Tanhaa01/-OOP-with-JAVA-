 import java.util.Scanner;
 public class ProjectThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(" Number is : " + i + " and cube of " + i + " is : " + (i * i * i));
    }
}
}