import java.util.Scanner;

public class ternarnNumber {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        //String result = a < 5 ? "Число меньше 5" : a > 5 ? "Число больше 5": "Число равно 5"; переделать в if else
        int a = x.nextInt();
        if (a < 5){
            System.out.println("Число меньше 5");
        }else if (a > 5){
            System.out.println("Число больше 5");
        }else
            System.out.println("Число равно 5");
    }
}
