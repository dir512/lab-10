import java.util.Scanner;
import java.lang.Exception;
import java.util.Date;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        } finally {
            System.out.println("Выполнено после try/catch");
        }
        try {
            int а = 0;
            System.out.println(" a = " + а);
            int b = 42 / а;
            int с[] = {1};
            с[42] = 99;
        } catch (ArithmeticException е) {
            Date date = new Date();
            System.out.println(date);
            System.out.println("Дeлeниe на нуль:" + е);
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("Ошибка индексации за пределами массива : " + е);//вывод описания текстом
        }

        Date date = new Date();
        System.out.println(date);//дата и время

        System.out.println("Message:Пocлe блока операторов try/catch.");

        Scanner sc = new Scanner( System.in ); // создаём объект класса Scanner
        int i = 2;
        System.out.print( "Введите целое число: " );
        try {
            if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                System.out.println(i);
                int b=i/0;

            }
        } catch (ArithmeticException e) {
            if (i > 0 && i < 10)
                throw new ArithmeticException("int" + i);
            System.out.println("int" + e);//int
            if (i > 10 && i < 15)
                throw new ArithmeticException("float" + i);//float
            System.out.println("float" + e);
            if (i > 15 && i < 20)
                throw new ArithmeticException("MessageString" + i);//string
            System.out.println("MessageString" + e);
        }

    }
}