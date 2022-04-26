public class Main {


    public static void main(String[] args) {

        task1(2016);
        task2(1, 2014);
        task3(110);
        task5('3', '2', '1', '6', '5');
    }


    //Задание 1

    public static void task1(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    // Задание 2

    public static void task2(int client, int clientyear) {

        if (client == 0 && clientyear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (client == 0 && clientyear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке.");
        } else if (client == 1 && clientyear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (client == 1 && clientyear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке.");
        }
    }
    // Задание 3

    public static void task3(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потебуется 1 день.");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки потебуется 2 дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки потебуется 3 дня.");
        } else {
            System.out.println("Доставка не возможна.");
        }
    }

    //Задание 5

    public static void task5(int reversName, char c, char c1, char c2, char c3) {
        char[] revers = {'3', '2', '1', '6', '5'};
        {
            for (int i = revers.length - 1; i >= 0; i--) {
                System.out.print(revers[i]);
            }
        }
    }
}




