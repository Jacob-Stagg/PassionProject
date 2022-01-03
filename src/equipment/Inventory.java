package equipment;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Items> itemsStored;

    public Inventory() {
        itemsStored = new ArrayList<Items>();
    }

    public ArrayList<Items> getItemStash() {
        return itemsStored;
    }

    public void setItemStash(ArrayList<Items> itemStash) {
        this.itemsStored = itemStash;
    }
}
