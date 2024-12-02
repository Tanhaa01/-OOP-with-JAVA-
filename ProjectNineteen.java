import java.util.Scanner;

public class ProjectNineteen {
    public static void main(String[] args) {
        int i, j, k, l;

        System.out.println("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        l = k + 4 - 1;

        for (i = 1; i <= k; i++) {
            for (int m = l; m < i; m--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            l--;
        }
    }
}


