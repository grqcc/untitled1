import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        if (a == b){
            if (a == c){
                System.out.print(a + " " + b + " " + c);
            }else{
                System.out.print(a + " " + b);
            }
        }else if (a == c){
            System.out.print(a + " " + c);
        }else if (b == c){
            System.out.print(b + " " + c);
        }

    }
}
