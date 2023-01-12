import java.util.Scanner;

public class voenkomat {
    public  static void main(String[] args){
        Scanner x = new Scanner(System.in);
        String y = x.nextLine();
        int a = x.nextInt();

        if(a > 18 && a < 28){
            System.out.println("Срочно явится в военкомат");
        }
    }
}

