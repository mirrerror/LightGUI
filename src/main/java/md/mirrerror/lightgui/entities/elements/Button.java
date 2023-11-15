package md.mirrerror.lightgui.entities.elements;

import org.bukkit.inventory.ItemStack;

public abstract class Button extends GUIElement implements Clickable {
    private boolean isLocked;

    public Button(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    public abstract void onClick();

    @Override
    public boolean isLocked() {
        return isLocked;
    }

    @Override
    public void setLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }
}
