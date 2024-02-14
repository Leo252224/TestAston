import java.util.Scanner;

public class Main {
    /**
     * Задания, необходимо написать код:
     * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
     * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
     * Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
     */

    public static void main(String[] args) {
        // Задача номер 1
        System.out.println("Задача 1");
        int number = 11;
        if (number > 7) {
            System.out.println("Привет");
        } else if (number <= 7) {
            System.out.println("Результат неудался");
        }
        System.out.println("==================================\n");
        System.out.println();


        // Задача номер 2
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Такого имени нет");
        }
        System.out.println("==================================\n");


        // Задача номер 3
        System.out.println("Задача 3");
        int[] array = {1, 5, 77, 33, 42, 73};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }

}