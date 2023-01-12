import java.util.Scanner;

public class Solution {

    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int num1 = z.nextInt();
        int num2 = z.nextInt();
        int num3 = z.nextInt();
        if (num1 < num2 + num3 && num2 < num1 + num3 && num3 < num1 + num2) {
            System.out.print(TRIANGLE_EXISTS);
        } else {
            System.out.print(TRIANGLE_NOT_EXISTS);
        }
    }
}