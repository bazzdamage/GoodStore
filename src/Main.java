import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String separator = "------------------------------";
        Seller seller = new Seller("Ahmed", 1000, 50);
        Consumer consumer = new Consumer("Ivan", 100, 25);

        Item water = new Item("Karachinskaya", 25, Category.Water);
        Item sausages = new Item("Sausages \"Molochniye\"", 150, Category.Food);
        Item soap = new Item("Soap \"Khozyastvennoye\"", 20, Category.Hygiene);
        Item stew = new Item("Stew \"Yoshkar-Olinskaya\"", 200, Category.Food);

        consumer.addToWishList(water, 2);
        consumer.addToWishList(sausages);
        consumer.addToWishList(soap, 5);
        seller.addToStorage(water, 5);
        seller.addToStorage(soap, 3);
        seller.addToStorage(stew);

        consumer.welcomeToStore(consumer);
        System.out.println(separator);
        seller.charismaCheck(consumer);
        System.out.println(separator);
        consumer.printWishList();
        System.out.println(separator);
        System.out.println("Total cost = " + consumer.totalCost(consumer.getWishList()) + " RUB");
        System.out.println(separator);
        consumer.areYouPoor();
        System.out.println(separator);
        seller.addToCart(consumer);
        seller.printShoppingCart(consumer);
        System.out.println(separator);
        consumer.walkInStore();
        seller.walkInStorage();
        consumer.walkInStorage();

    }
}
