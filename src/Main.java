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



        int ClientOS = 1;
        int clientDeviceYear = 2015;
        if (ClientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (ClientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (ClientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (ClientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }



        int year = 2008;
        if (year >= 1584){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1584");
        }



        int deliveriDistance = 95;
        if (deliveriDistance <= 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveriDistance > 20 && deliveriDistance <= 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveriDistance > 60 && deliveriDistance <= 100){
            System.out.println("Потребуется дней: 3");
        } else if (deliveriDistance > 100){
            System.out.println("Доставки нет");
        }



        int montgNomber = 12;
        switch (montgNomber){
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