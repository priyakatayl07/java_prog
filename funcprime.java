import java.util.*;

public class funcprime {
    static void isPrime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();

        if (a <= 1) {
            System.out.println("a is not prime");
        } else {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(a); i++) { 
                if (a % i == 0) {
                    System.out.println("a is not prime");
                    count++;
                    break; 
                }
            }
            if (count == 0) {
                System.out.println("a is prime");
            }
        }
    }

    public static void main(String[] args) {
        isPrime();
    }
}
