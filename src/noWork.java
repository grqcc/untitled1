import java.util.Scanner;

public class noWork {
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        int age = x.nextInt();
        boolean a = age >= 20;
        boolean b = age <= 60;

         if (!a || !b){
             System.out.println("Не нужно работать");
         }
    }
}
