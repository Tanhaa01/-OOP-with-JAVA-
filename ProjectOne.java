 import java.util.Scanner;
public class ProjectOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input any Number");

        if (n >= 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is Negative");

        } else {
            System.out.println("Number is Zero");

        }
    }
}





