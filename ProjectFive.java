 import java.sql.SQLOutput;
 import java.util.Scanner;
public class ProjectFive {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter code for day");
        Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       switch (n)
       {
           case 1:
               System.out.println("Saturday");
             break;
           case 2:
               System.out.println("Sunday");
             break;
           case 3:
               System.out.println("Monday");
             break;
           case 4:
               System.out.println("Tuesday");
              break;
           case 5:
               System.out.println("Wednesday");
             break;
           case 6:
               System.out.println("Thrusday");
             break;
           case 7:
               System.out.println("Friday");
            break;
           default:
               System.out.println("Invalid code");
               break;
       }


    }

}
