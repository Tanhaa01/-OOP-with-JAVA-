import java.util.Scanner;

public class ProjectSix {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
        System.out.println("Input floating point a number");
        double a = sc.nextDouble();
        System.out.println("Input floating point another number");
        double b = sc.nextDouble();
        if(Math.abs(a-b)<0.001){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}