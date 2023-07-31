import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        System.out.println(inputNumber());
    }

        private static float inputNumber() {

            System.out.println("Введите число:");
            float Number = 0;
            boolean flag = false;
            Scanner sc = new Scanner(System.in);
            while (!flag) {

                try {
                    Number = Float.parseFloat(sc.nextLine());
                    flag = true;

                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число, повторите ввод");
                }

            }
            return Number;
        }

    }
