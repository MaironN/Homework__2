
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        int k = x + y;
        System.out.printf("Сумма: %d\n", k);
        int s = x * y;
        System.out.printf("Произведение: %d\n", s);;
        int j = x - y;
        System.out.printf("Разность: %d\n", j);;
        int h = x / y;
        System.out.printf("Частное: %d\n", h);;

        scanner.close();
    }


}