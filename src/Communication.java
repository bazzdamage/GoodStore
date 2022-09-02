import java.util.Map;

public interface Communication {

    default double costOfItem(Item item) {
        return item.getCost();
    }

    default void isItemsAvailable(Item item, int qt, Map<Item, Integer> list) {
        if (!list.containsKey(item)) {
            System.out.println("We don't have " + item);
        } else if (qt > list.get(item)) {
            int temp = qt - list.get(item);
            System.out.println("Don't have enough of " + item.getNameOfItem() +
                    " in our store, decrease quantity on " + temp + " pcs");
        } else {
            int temp = qt - list.get(item);
            System.out.println("We have enough of " + item.getNameOfItem()
                    + ". You can get " + temp + " pcs more.");
        }
    }

    default double totalCost(Map<Item, Integer> list) {
        double summ = 0;
        for (Map.Entry<Item, Integer> entry : list.entrySet()) {
            summ += entry.getKey().getCost() * entry.getValue();
        }
        return summ;
    }

    default void walkInStorage() {
    }

    default void welcomeToStore(Consumer consumer) {
        System.out.println(consumer.getName() + " stood a little at the entrance, then bravely went inside.");
    }
}
