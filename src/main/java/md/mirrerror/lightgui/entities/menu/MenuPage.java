package md.mirrerror.lightgui.entities.menu;

import md.mirrerror.lightgui.entities.elements.GUIElement;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class MenuPage {
    private int slots;
    private Map<Integer, ItemStack> items;
    private Map<Integer, GUIElement> elements;

    public MenuPage(int slots, Map<Integer, ItemStack> items, Map<Integer, GUIElement> elements) {
        this.slots = slots;
        this.items = items;
        this.elements = elements;
    }

    public void setItem(int slot, ItemStack itemStack) {
        items.put(slot, itemStack);
    }

    public void setElement(int slot, GUIElement guiElement) {
        items.remove(slot);
        elements.put(slot, guiElement);
    }

    public Map<Integer, ItemStack> getItems() {
        return items;
    }

    public void setItems(Map<Integer, ItemStack> items) {
        this.items = items;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public Map<Integer, GUIElement> getElements() {
        return elements;
    }

    public void setElements(Map<Integer, GUIElement> elements) {
        this.elements = elements;
    }
}
