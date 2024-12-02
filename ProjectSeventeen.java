 import java.util.Scanner;
public class ProjectSeventeen {
    public static void main(String[] args) {

        System.out.println("Input number of k : ");
        Scanner sc = new Scanner(System.in);
        int i,j,k;
        k= sc.nextInt();
        for(i=1;i<=k;i++)
        {
            for(j=1;j<=i;j++)
                System.out.println(i);
            System.out.println("");
        }
    }
}
