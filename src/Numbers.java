import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();

        System.out.println(a > b ? a : b );
    }
}
