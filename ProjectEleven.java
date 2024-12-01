  import java.util.Scanner;
public class ProjectEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");

        System.out.print("Enter the number of terms(n):");
                int n = sc.nextInt();
                int sum = 0;
                System.out.println("Natural numbers:");
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                    sum += i;
                }
                System.out.println("ADDITION" + sum);

            }
        }