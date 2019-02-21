import java.util.List;

public class Mall {
    String name;
    List<Store> stores;
    List<Customer> customers = null;
    public Mall(String name, String customer)
    {
        this.name = name;
        customers.add(new Customer(customer, 0));
    }
    void enter(String name)
    {
        customers.add(new Customer(name, 0));
    }
    void exit()
    {
        customers.remove(customers.size() - 1);
    }
    ShoppingCart getShoppingCart()
    {
        return customers.get(customers.size() - 1).getLvl();
    }
    void printCustomers()
    {
        for(int i = 0; i < customers.size(); i++)
        {
            System.out.println(customers.get(i).getName());
        }
    }
    void printStores()
    {
        for(int i = 0; i < stores.size(); i++)
        {
            System.out.println(stores.get(i).getName());
        }
    }
    void addStore(String s)
    {
        if (s == "Shoe")
        {
            stores.add(new Store(1));
        }
        else if (s == "Book")
        {
            stores.add(new Store(2));
        }
        else if (s == "Game")
        {
            stores.add(new Store(3));
        }
    }

}
