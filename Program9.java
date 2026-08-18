import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        int length = password.length();
        if (length < 8) {
            System.out.println("Password is less than 8 characters.");
        }
        else if (length >= 8 && length < 12) {
            System.out.println("Password is acceptable.");
        }
        else {
            System.out.println("Password is strong.");
        }
        sc.close();
    }
}