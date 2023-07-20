import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 > 0) || year % 400 == 0;
    }

    public static void setDevice(int systemType, int year) {
        int iOs = 0;
        int android = 1;
        int currentYear = LocalDate.now().getYear();
        if (systemType == iOs && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (systemType == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year < currentYear && systemType == android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (systemType == android){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не поддерживает данную версию");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        if (isLeapYear(year)) {
            System.out.printf("%d год является високосным%n", year);
        } else {
            System.out.printf("%d год не является високосным%n", year);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        setDevice(1, 2020);
    }

    public static int getDays(int dist) {
        int interval = 40;
        int firstDist = 20;
        int maxDist = 100;
        int countDay = 2 + (dist - firstDist) / interval - firstDist / (dist + 1);
        return countDay;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int dist = 95;
        System.out.println("Потребуется дней: " + getDays(dist));
    }
}