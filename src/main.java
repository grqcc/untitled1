
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int temperature = x.nextInt();

        if(temperature < 0){
            System.out.println("Дубак чувак");
        } else if (temperature == 5) {
            System.out.println("Ну чуть потеплее но все же холодно");
        }else if (temperature > 5){
            System.out.println("Ну тепло");
        }else {
            System.out.println("Что то пошло не так");
        }
        }
    }




