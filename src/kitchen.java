import java.util.Scanner;

public class kitchen {
    public static void main(String[] args){
        String yes = "Мясо готово";
        String not = "Мясо не готово";
        String yoo = "Мясо пережарено";

        Scanner x = new Scanner(System.in);
        int hour = x.nextInt();
        int min = x.nextInt();

        if (hour == 0 && min == 30){
            System.out.println(yes);
        }else if(hour == 0 && min < 30){
            System.out.println(not);
        }else {
            System.out.println(yoo);
        }

    }
}
