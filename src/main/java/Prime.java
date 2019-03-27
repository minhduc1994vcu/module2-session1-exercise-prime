import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number which you want to check: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.printf("%d is not a prime", number);
        } else {
            int i = 2;
            boolean isprime = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isprime = false;
                }
                i++;
            }
            if (isprime) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }


        }
    }

}
