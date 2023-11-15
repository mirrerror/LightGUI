package md.mirrerror.lightgui.entities.elements;

import org.bukkit.inventory.ItemStack;

public abstract class Button extends GUIElement implements Clickable {
    public Button(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    public abstract void onClick();

    @Override
    public abstract boolean isLocked();

    @Override
    public abstract void setLocked(boolean isLocked);
}
