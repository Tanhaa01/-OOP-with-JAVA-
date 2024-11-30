 import java.util.Scanner;
public class ProjectThree {
    public static void main(String[] args) {
        int n1, n2, n3;
        int largest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        n1 = sc.nextInt();
        System.out.println("Enter the Number 2");
        n2 = sc.nextInt();
        System.out.println("Enter the Number 3");
        n3 = sc.nextInt();
        sc.close();
        if (n1 > n2 && n2 > n3) {
            largest = n1;
        } else if (n2 > n1 && n2 > n3) {
            largest = n2;
        } else {
            largest = n3;
            System.out.printf("Largest among %d, %d, and %d is %d\n", n1, n2, n3, largest);
        }
    }
}