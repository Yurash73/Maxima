public class Task3 {
    public static void main(String[] args) {
     TaskA();
     TaskB();
     TaskC();

    }

     static void TaskA () {
        int priceA = 200;
        int discountA = 15;
        int priceB = 30;
        int totalPrice = 10 * (priceA - priceA * discountA / 100) + 2 * priceB;
        System.out.println("Цена 10 шт. Товара А и 2 шт. товара Б : " + totalPrice + " руб.");
    }

    static void TaskB () {
        int priceA = 500;
        int discountA = 50;
        int priceB = 30;
        int totalPrice = 7 * (priceA - priceA * discountA / 100) + 1 * priceB;
        System.out.println("Цена 7 шт. Товара А и 1 шт. товара Б : " + totalPrice + " руб.");
    }

    static void TaskC ()
    {
        int priceA = 300;
        int discountA = 10;
        int priceB = 20;
        int totalPrice = 2 * (priceA - priceA * discountA / 100) + 3 * priceB;
        System.out.println("Цена 2 шт. Товара А и 3 шт. товара Б : " + totalPrice + " руб.");

    }
}
