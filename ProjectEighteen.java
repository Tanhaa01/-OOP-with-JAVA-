 import java.util.Scanner;
public class ProjectEighteen {
    public static void main(String[] args) {
        int i, j, k, n = 1;
        System.out.println("Input number of rows : ");

        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();

        for (i = 1; i <= k; i++) {
            for (j = 1; j <= i; j++)
                System.out.println(n++);
            System.out.println("");


        }
    }
}

