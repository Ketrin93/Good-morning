public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1)
            System.out.println(" Установите версию приложения для Android по ссылке");

        System.out.println("Задание 2");
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите  облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015) {
            System.out.println(" Устнановите облегченную версию приложения для Android  по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        }
        System.out.println(" Задача  3");

        int year = 2024;
        if (year < 1584) {
            System.out.println(" Год должен быть больше 1584");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным ");
        }
        System.out.println(" Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
            System.out.println(" Потребуется дней " + deliveryDays);

        } else if (deliveryDistance > 60) {
            deliveryDays++;
            System.out.println(" Потребуется дней " + deliveryDays);
        } else if (deliveryDistance > 100) {
            System.out.println(" Потребуется дней " + deliveryDays);

            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("  Принадлежит к сезону зима ");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(" Принадлежит к сезону весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(" Принадлежит к сезону лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(" Принадлежит к сезону осень");
                    break;
                default:
                    System.out.println(" Неверный номер месяца ");
            }
        }
    }

}






















