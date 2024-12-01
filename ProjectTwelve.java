 import java.util.Scanner;
public class ProjectTwelve {
    public static void main(String[] args) {
        int a, b, c, d, e;
        System.out.println("Iput 5 Number");
        Scanner sc = new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();

        int sum = a + b + c + d + e;
        System.out.println("Sum: " + sum);

        double ave = sum / 5.0;
        System.out.println("Average: " + ave);
    }
}
