import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Попробуйте ещё раз");
            }
        } else {
            System.out.println("Извините, это не число!");
        }
    }
}