package L4;

import java.util.Scanner;

import L4.Places.City;
import L4.Places.Village;

import static L4.Places.Region.*;


public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void start(){
        int choice = -1;
        do {
            System.out.println("0 - Выйти");
            System.out.println("1 - Вывести информацию обо всех местах");
            System.out.println("2 - Добавить город");
            System.out.println("3 - Добавить деревню");
            System.out.println("4 - Найти место");
            System.out.println("5 - Удалить место");

            choice = readInt(0, 5);

            switch (choice) {
                case 1:
                    print();
                    break;
                case 2:
                    System.out.println("Заполните информацию о городе:");
                    System.out.println("Название:");
                    String nameC = scanner.nextLine();
                    System.out.println("Площадь:");
                    int areaC = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Население:");
                    int populationC = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Мэр:");
                    String head = scanner.nextLine();
                    add(new City(nameC, areaC, populationC, head));
                    break;
                case 3:
                    System.out.println("Заполните информацию о деревне:");
                    System.out.println("Название:");
                    String nameV = scanner.nextLine();
                    System.out.println("Площадь:");
                    int areaV = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Население:");
                    int populationV = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Староста:");
                    String chief = scanner.nextLine();
                    add(new Village(nameV, areaV, populationV, chief));
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    delete();
                    break;
            }
        } while (choice != 0);
    }

    public static int readInt(int minValue, int maxValue) { //метод для предотвращения ошибки ввода
        int error = 0;
        int value = 0;
        do {
            error = 0;
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value < minValue || value > maxValue) {
                    System.out.println("Вводите из диапазона от " + minValue + " до " + maxValue);
                    error = 1;
                }
            } catch (NumberFormatException ex) {
                error = 1;
                System.out.println("Некорректный символ, введите число");
            }

        } while (error != 0);
        return value;
    }
}

