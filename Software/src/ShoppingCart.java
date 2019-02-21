import java.util.List;

class ShoppingCart {
    private int type;
    private List<Item> items = null;
    public ShoppingCart(List<Item> items)
    {
        type = 0;
        this.items = items;
    }
    public List<Item> getItems() {
        return items;
    }
    public int getType() {
        return type;
    }
    public void setItems(List<Item> items) {
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
