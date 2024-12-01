 import java.util.Scanner;
public class ProjectFourteen {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number for multiplication: ");
        Scanner sc = new Scanner(System.in);
         number = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(number+ " * " +i+ " = " +(number));
        }

    }
}
