import java.util.ArrayList;

class ShoppingCart {
    private int type;
    private ArrayList<Item> items = new ArrayList<>();
    public ShoppingCart(ArrayList<Item> items)
    {
        type = 0;
        this.items = items;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public int getType() {
        return type;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public void setType(int type) {
        this.type = type;
    }
    public void addItem(Item item)
    {
        items.add(item);
    }
    public void removeItem(Item item)
    {
        items.remove(item);
    }
    public void print_item()
    {
        for(int i = 0; i < items.size(); i++)
        {
            System.out.println(items.get(i));
        }
    }

}
