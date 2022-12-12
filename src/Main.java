public class Main {
    //Задача 1
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i=0; i<=10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        // Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i>=0; i--) {
            System.out.println("Итерация цикла " + i);
        }

        // Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i<=17; i=i+2) {
            System.out.println("Итерация цикла " + i);
        }

        // Задача 4
        System.out.println("Задача 4");
        for (int i=10; i>=-10; i--) {
            System.out.println("Итерация цикла " + i);
        }

        // Задача 2.1
        System.out.println("Задача 2.1");
        for (int i=1904; i<=2096; i=i+4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 2.2
        System.out.println("Задача 2.2");
        for (int i=7; i<=98; i=i+7) {
            System.out.println(i);
        }

        // Задача 2.3
        System.out.println("Задача 2.3");
        for (int i=1; i<=512; i=i*2) {
            System.out.println(i);
        }

        // Задача 3.1
        System.out.println("Задача 3.1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i<=12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }

        // Задача 3.2
        System.out.println("Задача 3.2");
        for (int i = 1; i<=12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");

        }
    }
}