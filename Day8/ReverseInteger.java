package Day8;

public class ReverseInteger {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int digit = x % 10;
            if ((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE / 10)) {
                return 0;
            }
            ans = ans * 10 + digit;
            x = x / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        ReverseInteger sol = new ReverseInteger();

        int num1 = 123;
        int num2 = -123;

        System.out.println("Reverse of " + num1 + " = " + sol.reverse(num1));
        System.out.println("Reverse of " + num2 + " = " + sol.reverse(num2));
    }
}
