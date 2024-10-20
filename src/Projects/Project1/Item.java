package Projects.Project1;

public abstract class Item implements Interactable {
    private String itemName;
    private int value;

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String newItemName) {
        itemName = newItemName;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int newValue) {
        value = newValue;
    }
}
