public class Item {
    String name;
    int id = 0;
    int storeid;
    int price;
    public Item(String name, int price, int storeid)
    {
       this.name = name;
       this.price = price;
       this.storeid = storeid;
       this.id++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getStoreid() {
        return storeid;
    }

}
