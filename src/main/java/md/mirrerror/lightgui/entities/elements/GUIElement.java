package md.mirrerror.lightgui.entities.elements;

import org.bukkit.inventory.ItemStack;

public class GUIElement {

    private ItemStack itemStack;

    public GUIElement(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }
}
