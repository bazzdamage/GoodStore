import java.util.HashMap;
import java.util.Map;

public class Consumer extends Human {
    private final Map<Item, Integer> wishList = new HashMap<>();


    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public void addToWishList(Item item, int qt) {
        wishList.putIfAbsent(item, 0);
        wishList.put(item, wishList.get(item) + qt);
    }
    public void addToWishList(Item item) {
        wishList.putIfAbsent(item, 0);
        wishList.put(item, wishList.get(item) + 1);
    }

    public Map<Item, Integer> getWishList() {
        return wishList;
    }
    public void printWishList() {
        int count = 1;
        System.out.println("--== " + this.getName() + "'s Wishlist ==--");
        for (Map.Entry<Item, Integer> entry : wishList.entrySet()) {
            System.out.println(count++ + ". " + entry.getKey().getNameOfItem() + " --> " + entry.getValue() + " pcs.");
        }
    }
    void areYouPoor() {
        double cost = totalCost(wishList);
        if (cost > this.getMoney()) {
            System.out.println("You're " + (cost - this.getMoney()) + " RUB short");
            System.out.println("You are poor like a homeless dog");
        } else {
            this.walkInStore();
        }
    }

    public void walkInStorage() {
        System.out.println(this.getName() + ": I throw seller over the shoulder and going in...");
    }

    public void walkInStore() {
        System.out.println(this.getName() + ": Show me this sweet stuff..and this...and this, in addition." +
                " Please don't look at me like that, i have the money!");
    }
}
