import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Тестирование задачи 1
        {
            System.out.println("Задача №1");
        }
        checkLeapYear(2020);
        checkLeapYear(2021);

        // Тестирование задачи 2
        {
            System.out.println("Задача №2");}
        suggestAppVersion(0, 2014); // iOS, старый телефон
        suggestAppVersion(1, 2016); // Android, новый телефон
        suggestAppVersion(0, 2023); // iOS, текущий год

        // Тестирование задачи 3
        {
            System.out.println("Задача №3");}
        System.out.println("Потребуется дней: " + calculateDeliveryDays(95));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(15));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(65));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(150));
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
        int currentYear = LocalDate.now().getYear();
        String osName = (osType == 0) ? "iOS" : "Android";
        String versionType = (clientDeviceYear < currentYear) ? "облегченную" : "обычную";

        System.out.println("Установите " + versionType + " версию приложения для " + osName + " по ссылке");
    }

    // Задача 3: Расчет дней доставки
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1; // или можно выбросить исключение, если доставка невозможна
        }
    }
}