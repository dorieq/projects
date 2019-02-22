import java.util.ArrayList;

class Store {
    String name;
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    int storeid;
    public Store(int storeid, String s){
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
        else if (storeid == 3){
            name = "GameStore";
            items.add(new Item("Halo", 200, storeid));
        }
        else name = "Mall";
        this.customers.add(new Customer(s, storeid));
        this.storeid = storeid;
    }
    void enter(Customer C)
    {
        customers.add(C);
    }
    void exit(Customer c){
        customers.remove(c);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Item> getItems() {
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
