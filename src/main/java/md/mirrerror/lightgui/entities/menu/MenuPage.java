package md.mirrerror.lightgui.entities.menu;

import com.google.common.collect.ImmutableMap;
import md.mirrerror.lightgui.entities.elements.GUIElement;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class MenuPage {
    private int slots;
    private final Map<Integer, ItemStack> items;
    private final Map<Integer, GUIElement> elements;

    public MenuPage(int slots, Map<Integer, ItemStack> items, Map<Integer, GUIElement> elements) {
        this.slots = slots;
        this.items = items;
        this.elements = elements;
    }

    public void setItem(int slot, ItemStack itemStack) {
        elements.remove(slot);
        items.put(slot, itemStack);
    }

    public void setElement(int slot, GUIElement guiElement) {
        items.remove(slot);
        elements.put(slot, guiElement);
    }

    public Map<Integer, ItemStack> getItems() {
        return ImmutableMap.copyOf(items);
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public Map<Integer, GUIElement> getElements() {
        return ImmutableMap.copyOf(elements);
    }
}
