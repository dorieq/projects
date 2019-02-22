public class Customer {
    ShoppingCart lvl;
    String name;
    Store store;
    public Customer(String name, int storeid)
    {
        this.name = name;
        this.store = new Store(storeid, name);
        this.lvl = new ShoppingCart(store.getItems());
    }

    public ShoppingCart getLvl() {
        return lvl;
    }

    public String getName() {
        return name;
    }
}
