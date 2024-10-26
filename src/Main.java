//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }



        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }



        int year = 2008;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else if ((year >= 1584 && year % 400 != 0) || (year % 4 != 0 && year % 100 == 0)){
            System.out.println(year + " год не является високосным");
        } else if (year < 1584){
            System.out.println("Год не может быть меньше 1584");
        }



        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        }



        int monthNomber = 12;
        switch (monthNomber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


    }
}