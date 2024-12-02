 import java.util.Scanner;
 public class ProjectSixteen {
     public static void main(String[] args) {
         System.out.println("Enter the number of rows");
         Scanner sc = new Scanner(System.in);
         int i, j, k;
         k = sc.nextInt();

         for (i = 1; i <= k; i++) {
             for (j = 1; j <= i; j++)
                 System.out.print(j);
             System.out.println("");
         }
     }
 }


