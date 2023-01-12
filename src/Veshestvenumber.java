import java.util.Scanner;

public class Veshestvenumber {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        double a = x.nextDouble();
        double b = x.nextDouble();

        if (Math.abs(a - b) < 0.000001){
            System.out.println("Числа равны");
        }else
            System.out.println("Числа не равны");
    }
}
