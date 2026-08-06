import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}

