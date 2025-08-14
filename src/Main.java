import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Тестирование задачи 1

        System.out.println("Задача №1");

        checkLeapYear(2020);
        checkLeapYear(2021);

        // Тестирование задачи 2

        System.out.println("Задача №2");

        suggestAppVersion(0, 2014); // iOS, старый телефон
        suggestAppVersion(1, 2016); // Android, новый телефон
        suggestAppVersion(0, 2023); // iOS, текущий год

        // Тестирование задачи 3
        System.out.println("Задача №3");
        calculateAndPrintDeliveryDays(95);
        calculateAndPrintDeliveryDays(15);
        calculateAndPrintDeliveryDays(65);
        calculateAndPrintDeliveryDays(150);
    }

    // Задача 1: Проверка високосного года
    public static void checkLeapYear(int year) {
        boolean isLeap = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        if (isLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2: Рекомендация версии приложения
    public static void suggestAppVersion(int osType, int clientDeviceYear) {

        String osName = (osType == 0) ? "iOS" : "Android";
        String versionType = (clientDeviceYear < 2015) ? "облегченную" : "обычную";

        System.out.println("Установите " + versionType + " версию приложения для " + osName + " по ссылке");
    }

    // Задача 3: Расчет дней доставки (исправленная версия)
    public static void calculateAndPrintDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1; // Минимальное количество дней

        if (deliveryDistance > 100) {
            System.out.println("Доставки на расстояние " + deliveryDistance + " км нет");
            return;
        }

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }

        System.out.println("Потребуется дней: " + deliveryDays);
    }
}



