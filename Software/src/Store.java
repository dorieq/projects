import java.util.List;

class Store {
    String name;
    List<Item> items = null;
    List<Customer> customers = null;
    int storeid;
    public Store(int storeid){
        if (storeid == 1)
        {
            name = "ShoeStore";
            items.add(new Item("Levi's",200, storeid));
        }
        else if (storeid == 2)
        {
            name = "BookStore";
            items.add(new Item("Onegin", 200, storeid));
        }
        else{
            name = "GameStore";
            items.add(new Item("Halo", 200, storeid));
        }
        this.storeid = storeid;
    }
    void enter(Customer C)
    {
        customers.add(C);
    }
    void exit(Customer c){
        customers.remove(c);
    }

    public List<Item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    void print_customers()
    {
        for(int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getName());
        }
    }
    void print_items()
    {
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
        }
    }

}
