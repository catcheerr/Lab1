import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        //Считывание натурального числа x из консоли
        out.print("Введите натуральный делитель x: ");
        int x = in.nextInt();
        //Считывание четырех целых чисел из консоли
        out.print("Введите четыре целых делимых:\n");
        out.print("a = ");
        int a = in.nextInt();
        out.print("b = ");
        int b = in.nextInt();
        out.print("c = ");
        int c = in.nextInt();
        out.print("d = ");
        int d = in.nextInt();
        //Вводим переменные, которые будут содержать остатки от деления
        int a_ost = 0;
        int b_ost = 0;
        int c_ost = 0;
        int d_ost = 0;
        //Определяем остаток от деления числа a на число x
        if (a >= 0){
            //Если число a = 0, то просто находим остаток от деления
            a_ost = a % x;
        }
        else {
            //Если число a < 0 и не делится нацело на число x, то:
            //1)находим модуль неполного частного от деления числа a на x
            //2)увеличиваем это число на 1
            //3)умножаем полученное число на натуральный делитель x
            //4)прибавляем к полученному числу отрицательное целое делимое a
            if (a % x != 0)
                a_ost = (-(a / x) + 1) * x + a;
        }
        //Аналогично для чисел b, c, d
        if (b >= 0){
            b_ost = b % x;
        }
        else {
            if (b % x != 0)
                b_ost = - (b / x - 1) * x + b;
        }
        if (c >= 0){
            c_ost = c % x;
        }
        else {
            if (c % x != 0)
                c_ost = - (c / x - 1) * x + c;
        }
        if (d >= 0){
            d_ost = d % x;
        }
        else {
            if (d % x != 0)
                d_ost = - (d / x - 1) * x + d;
        }
        //Находим минимальный из всех остатков
        //с помощью функции Math.min
        int min_ost = 0;
        min_ost = Math.min(a_ost, b_ost);
        min_ost = Math.min(min_ost, c_ost);
        min_ost = Math.min(min_ost, d_ost);
        out.printf("Остаток от деления а на х: %d\n", a_ost);
        out.printf("Остаток от деления b на х: %d\n", b_ost);
        out.printf("Остаток от деления c на х: %d\n", c_ost);
        out.printf("Остаток от деления d на х: %d\n", d_ost);
        out.printf("Наименьший остаток: %d\n", min_ost);
        out.print("Числа, имеющие наименьший остаток от деления на x:");
        //Определяем числа, имеющие наименьший остаток от деления на x:
        //если минимальный остаток совпадает с остатком,
        //полученным от деления одного из чисел a, b, c, d на x, то
        //выводим число, которое было поделено на x
        if (min_ost == a_ost)
            out.printf(" %d", a);
        if (min_ost == b_ost)
            out.printf(" %d", b);
        if (min_ost == c_ost)
            out.printf(" %d", c);
        if (min_ost == d_ost)
            out.printf(" %d", d);
    }
}