import java.util.Scanner;

public class kal {
    public  static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Введите имя");
        if(x.hasNextLine()) {
            String y = x.nextLine();
            System.out.println(y);
        }else{
            System.out.println("Вы ввели не имя");
        }
    }
}
