import java.util.Random;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {

        int a = 0;
        for (int i = 2; i < 20 ; i++) {
            if (i % 2 == 0) {
                a ++;
            }
        }

        int[] Mas = new int [a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
            }
        }
    }

    public static void task2 () {
        System.out.println();

        int a = 0;
        for (int i = 0; i < 99; i++) {
            if (i % 2 != 0) {
                a ++;
            }
        }
        int[] Mas = new int[a];
        for (int i = 1, b = 0; i < 99; i ++) {
            if (i % 2 != 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }
        System.out.println(" ");

        for (int i = Mas.length - 1; i >= 0 ; i--) {
            System.out.print(Mas[i] + " ");
        }
    }

    public static void task3 () {
        System.out.println();

        int b = 0;
        int[] Mas = new int[15];
        for (int i = 0; i < Mas.length; i++) {
            Random rnd = new Random();
            Mas[i] = rnd.nextInt(10);
            System.out.print(Mas[i] + " ");
            if (Mas[i] > 0 && Mas[i] % 2 == 0) {
                b ++;
            }
        }
        System.out.println();
        System.out.println("Всего в массиве " + b + " четных");
    }

    public static void task4 () {
        System.out.println();

        int[] Mas = new int[8];
        for (int i = 0; i < Mas.length; i ++) {
            Random rnd = new Random();
            Mas[i] = rnd.nextInt(11);
            System.out.print(Mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Mas.length; i ++) {
            if (Mas[i] % 2 != 0) {
                Mas[i] = 0;
                System.out.print(Mas[i] + " ");
            }
        }
    }

    public static void task5 () {

        int[] Mas = new int[5];
        int[] Mas1 = new int[5];





    }
}