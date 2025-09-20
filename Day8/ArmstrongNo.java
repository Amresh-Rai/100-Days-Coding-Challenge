package Day8;

import java.util.Scanner;

public class ArmstrongNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();    // input number

        int originalNum = num;     // store original number
        int sum = 0;               // to store sum of cubes of digits

        while (num > 0) {
            int digit = num % 10;           // extract last digit
            sum = sum + (digit * digit * digit); // cube and add
            num = num / 10;                 // remove last digit
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
