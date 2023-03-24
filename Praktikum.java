import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {


            double rateUSD = 78.5;
            double rateEUR = 88.7;
            double rateJPY = 0.75;
            System.out.println("Введите сумму в рублях");
            Scanner scan = new Scanner(System.in);
            double rubles = scan.nextDouble();
            System.out.println("Введите код валюты:");
            int currency = scan.nextInt();
            convert(rubles,currency, rateUSD,rateEUR,rateJPY);
        }


        public static void convert ( double rubles, int currency, double rateUSD, double rateEUR, double rateJPY){// Тело метода
            if (currency == 1) {
                System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
            } else if (currency == 2) {
                System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
            } else if (currency == 3) {
                System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
            } else {
                System.out.println("Неизвестная валюта");
            }
        }
    }


