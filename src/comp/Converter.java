package comp;

import java.util.Scanner;

public class Converter {

    double rateToday;
    String valuta;
    Scanner scanner = new Scanner(System.in);
// ПОМНИ: double число пишется через запятую!
    void convert(double rubles) {
            System.out.println("Напишите в какой вид валюты хотите конвертировать?");
            valuta = scanner.nextLine();
            System.out.println("Какой у нее сегодня курс?");
            rateToday = scanner.nextDouble();
            System.out.println("Ваши сбережения в валюте "+valuta+ " составляют: " + rubles / rateToday);
    }
}

