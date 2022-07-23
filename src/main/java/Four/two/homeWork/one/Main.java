package Four.two.homeWork.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choose = 1;


        List<String> tasks = new ArrayList<>();

        while (choose != 0) {
            System.out.println("""
                    Выберите действие:
                    1. Добавить задачу
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход
                    """);
            System.out.print("Введите: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    scanner = new Scanner(System.in);
                    System.out.println("Введите задачу для планирования:");
                    String taskName = scanner.nextLine();
                    tasks.add(taskName);
                }
                case 2 -> {
                    if (tasks.size() > 0) {
                        System.out.println("Список задач:");
                        for (String task : tasks) {
                            int i = 1;
                            System.out.println(i + ". " + task);
                            i += 1;
                        }
                    } else {
                        System.out.println("У вас пока нет задач!");
                    }
                }
                case 3 -> {
                    if (tasks.size() > 0) {
                        System.out.println("Выберите задачу для удаления");
                        int taskNum = scanner.nextInt();
                        try {
                            tasks.remove(taskNum - 1);
                            System.out.println("Done successfully!");
                        } catch (Exception e) {
                            System.out.println("There is no such kind of task!");
                        }
                    } else {
                        System.out.println("У вас пока нет задач!");
                    }
                }
                case 0 -> System.out.println("Досвидания!");
                default -> System.out.println("This is a wrong number!!!");
            }
        }
    }
}
