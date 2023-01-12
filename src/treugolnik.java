import java.util.Scanner;

public class treugolnik {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b)){
            System.out.println("Треугольник сущетвует");
        }else{
            System.out.println("Треугольника не существует");
        }
    }
}
