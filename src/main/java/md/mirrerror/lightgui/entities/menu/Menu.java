package md.mirrerror.lightgui.entities.menu;

import md.mirrerror.lightgui.entities.elements.GUIElement;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Menu implements InventoryHolder {

    private String title;
    private Inventory inventory;
    private Map<Integer, GUIElement> elements;

    public Menu(String title, int slots) {
        this.title = title;
        this.inventory = Bukkit.createInventory(this, slots);
        this.elements = new HashMap<>();
    }

    public void setElement(int slot, GUIElement guiElement) {
        inventory.setItem(slot, guiElement.getItemStack());
        elements.put(slot, guiElement);
    }

    public void removeElement(int slot) {
        inventory.setItem(slot, new ItemStack(Material.AIR));
        elements.remove(slot);
    }

    public void openFor(Player player) {
        player.openInventory(this.inventory);
    }

    public void closeFor(Player player) {
        player.closeInventory();
    }

    public void setItem(int slot, ItemStack itemStack) {
        this.inventory.setItem(slot, itemStack);
    }

    public void addItem(ItemStack itemStack) {
        this.inventory.addItem(itemStack);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Map<Integer, GUIElement> getElements() {
        return elements;
    }

    public void setElements(Map<Integer, GUIElement> elements) {
        this.elements = elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(title, menu.title) && Objects.equals(inventory, menu.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, inventory);
    }
}
