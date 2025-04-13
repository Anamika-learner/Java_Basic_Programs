import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.printf("sum %d", sum);
        sc.close(); // Scanner ko close kar diya gaya
    }
}