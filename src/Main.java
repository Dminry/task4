import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sales = new ArrayList<>();
        while (true) {
            System.out.println("Выберите операцию : \n 1.Добавить . \n 2.Показать . \n 3.Удалить . ");
            String operation = scanner.next();

            switch (operation) {
                case "1": {
                    System.out.println(" Добавьте продукт");
                    sales.add(scanner.next());
                    break;
                }
                case "2": {
                    showOrder(sales);
                    break;
                }
                case "3": {
                    showOrder(sales);
                    System.out.println("Какую покупку хотите удалить ? Введите номер или название.");
                    String nameOrIndex = scanner.next();
                    try {
                        int index = Integer.parseInt(nameOrIndex) - 1;
                        sales.remove(index);
                    } catch (Exception e) {
                        sales.remove(nameOrIndex);
                    }
                    break;
                }
                default: {
                    System.out.println("Неизвестная команда");
                }
            }
        }
    }

    private static void showOrder(List<String> sales) {
        System.out.println("Список покупок:");
        for (int i = 0; i < sales.size(); i++) {
            int count = i + 1;
            System.out.println(count + " " + sales.get(i));
        }
    }
}