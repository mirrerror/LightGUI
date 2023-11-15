package md.mirrerror.lightgui.events;

import md.mirrerror.lightgui.entities.elements.Clickable;
import md.mirrerror.lightgui.entities.elements.GUIElement;
import md.mirrerror.lightgui.entities.menu.Menu;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.*;
import org.bukkit.inventory.Inventory;

public class MenuListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Inventory inventory = event.getInventory();

        if(isMenu(inventory)) {
            event.setCancelled(true);

            Menu menu = (Menu) inventory.getHolder();
            GUIElement element = menu.getElementAt(event.getRawSlot());

            if(element == null) return;

            if(element instanceof Clickable) {
                Clickable clickable = (Clickable) element;
                if(!clickable.isLocked()) clickable.onClick();
            }
        }
    }

    @EventHandler
    public void onInventoryCreative(InventoryCreativeEvent event) {
        handleMenu(event.getInventory(), event);
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        handleMenu(event.getInventory(), event);
    }

    @EventHandler
    public void onInventoryInteract(InventoryInteractEvent event) {
        handleMenu(event.getInventory(), event);
    }

    private boolean isMenu(Inventory inventory) {
        return inventory.getHolder() instanceof Menu;
    }

    private void handleMenu(Inventory inventory, Cancellable event) {
        if(isMenu(inventory)) event.setCancelled(true);
    }

}
