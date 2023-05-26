import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int lengthArr = scanner.nextInt();
        List<Integer> Array = new ArrayList<>();
        System.out.print("Введите элементы массива через пробел: ");
        for (int i = 0; i < lengthArr; i++) {
            Array.add(scanner.nextInt());
        }
        System.out.println("Введен массив: " + Array);
        System.out.print("Кратно 3: ");
        for (int i = 0; i < lengthArr; i++) {
            if (Array.get(i) % 3 == 0) {
                System.out.print(Array.get(i) + " ");
            }
        }
    }
}