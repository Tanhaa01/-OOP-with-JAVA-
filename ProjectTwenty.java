import java.util.Scanner;

public class ProjectTwenty {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int number = 1;

        for (int k = 1; k <= i; k++) {
            for (int n = 1; n <= k; n++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
