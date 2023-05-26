import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        String enterName = name.trim().toLowerCase();
        if (enterName.equals("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else if (enterName.length() == 0) {
            System.out.println("Вы ничего не ввели");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}