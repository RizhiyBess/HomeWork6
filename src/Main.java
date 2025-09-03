//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int a = 1;
        for (a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        System.out.println("Задание 2");
        int b = 10;
        for (b = 10; b >= 1; b--) {
            System.out.println(b);
        }

        System.out.println("Задание 3");
        int c = 0;
        for (c = 0; c < 17; c = c + 2) {
            System.out.println(c);
        }

        System.out.println("Задание 4");
        int d = 10;
        for (d = 10; d >= -10; d--) {
            System.out.println(d);
        }

        System.out.println("Задание 5");
        int e = 1904;
        for (e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " год является високосным");
        }

        System.out.println("Задание 6");
        int f = 7;
        for (f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        System.out.println("Задание 7");
        int g = 1;
        for (f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }

        System.out.println("Задание 8 + Задание 9");
        int month = 1;
        double salary = 0;
        for (month = 1; month <= 12; month++) {
            salary = salary + salary * 0.12;
            salary = salary + 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + salary);
        }

        System.out.println("Задание 10");
        int h = 1;
        int j = 2;
        for (h = 1; h <= 10; h++) {
            j = h * 2;
            System.out.println("2*" + h + "=" + j);
        }
    }
}