import java.util.Scanner;

public class ExseptionTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные ");
        String name = sc.nextLine();
        if (name == null || name.isEmpty() || name.trim().isEmpty()) throw new RuntimeException("Пустые строки вводить нельзя");
            System.out.println("Вы ввели: " + name);
    }
}

