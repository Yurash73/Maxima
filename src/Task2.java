public class Task2 {
    public static void main(String[] args) {

        int priceA = 1000;
        int priceB = 500;
        int discountPercent = 10;

        int priceAPLusB = (priceA + priceB) - (priceA + priceB) * discountPercent / 100;
        System.out.println("Cумма покупки со скидкой: " + priceAPLusB);
        System.out.println("Сумма скидки: " + (priceA + priceB) / discountPercent);
    }
}
