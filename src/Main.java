public class Main {
    public static void main(String[] args) {
        System.out.println(" Task 1");
        int clientOs = 0;
        if (clientOs == 0)
            System.out.println(" Установите версию приложения для iOS по ссылке");
        else {
            System.out.println(" Установите версию приложения для Android по ссылке");
        }

        System.out.println(" Task 2");
        int clientDeviceYear = 2015;
        int android = 1;
        int iOs = 0;
        if (iOs == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите облегченную версию  приложения для iOS по ссылке");
        } else if (android == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите  облегченную версию приложения для Android по сссылке");

            System.out.println(" Task 3");

            int year = 2021;
            if (year > 1584) {
                System.out.println(" Год должен быть больше 1584");
            } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("year + год является високосным.");
            } else {
                System.out.println(" year + год не является високосным");
            }
            System.out.println(" Task 4");

        }
        int deliveryDistance = 95;
        int mindelivery = 1;
        if (deliveryDistance > 100) {
            System.out.println("Нет доставки");
            return;
        } else if (deliveryDistance > 20 && deliveryDistance > 60) {
            mindelivery++;
        }
        System.out.println("Доставка займет " + mindelivery + "суток");


        int monthNumber = 15;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Принадлежит к сезону зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит  к сезону весна ");
                break;
            case 6:
            case 7:
                case8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}
