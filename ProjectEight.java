import java.util.Scanner;

public class ProjectEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char r = sc.next().charAt(0);
        if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u' ||
                r == 'A' || r == 'E' || r == 'I' || r == 'O' || r == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        String input = sc.next();
        if (input.length() > 1 && (Character.isLetter(r)) ) {
                System.out.println("First character is a letter");
            } else {
                System.out.println("First character is not a letter");
            }
        }
    }

