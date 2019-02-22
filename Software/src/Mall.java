import java.util.ArrayList;

public class Mall {
    String name;
    ArrayList<Store> stores = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<Customer>();
    public Mall(){

    }
    public Mall(String name, String customer)
    {
        this.name = name;
        Customer c = new Customer(customer, 0);
        customers.add(c);
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
            stores.add(new Store(1, customers.get(0).getName()));
        }
        else if (s == "Book")
        {
            stores.add(new Store(2, customers.get(0).getName()));
        }
        else if (s == "Game")
        {
            stores.add(new Store(3, customers.get(0).getName()));
        }
    }

}
