 import java.util.Scanner;
public class ProjectFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        double n = sc.nextDouble();
        if (n > 1000000) {
            System.out.println("Positive large");
        } else if (n > 0) {
            System.out.println("Positive small");
        } else if (n == 0) {
            System.out.println("Zero");
        } else {
            if (Math.abs(n) < 1) {
                System.out.println("Negative small");
            } else if (Math.abs(n) > 1000000) {

                System.out.println("Negative large");
            } else {
                System.out.println("Negative");
            }
        }
    }
}






