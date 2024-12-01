import java.util.Scanner;
public class ProjectSeven {
    public static void main(String[] args) {
        System.out.println("Enter Month Number");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n==1) {
            System.out.println("January = 31 Days");
        }else if(n==2) {
            System.out.println("February = 29 Days");
        }else if (n==3) {
            System.out.println("March = 30 Days");
        }else if(n==4) {
            System.out.println("April = 30 Days");
        }else if(n==5) {
            System.out.println("May = 31 Days");
        }else if(n==6) {
            System.out.println("June = 30 Days");
        }else if(n==7) {
            System.out.println("July = 31 Days");
        } else if(n==8) {
            System.out.println("August = 31 Days");
        }else if(n==9) {
            System.out.println("September = 30 Days");
        }else if(n==10) {
            System.out.println("October = 31 Days");
        }else if(n==11) {
            System.out.println("November = 30 Days");
        } else if(n==12){
            System.out.println("December = 31 Days");
        }else if(n==13){
            System.out.println("Invalid Month Number");
        }

    }
}
