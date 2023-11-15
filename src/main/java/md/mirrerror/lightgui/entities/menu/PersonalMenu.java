package md.mirrerror.lightgui.entities.menu;

import org.bukkit.entity.Player;

public class PersonalMenu extends Menu {

    private final Player player;

    public PersonalMenu(Player player, String title, int slots) {
        super(title, slots);
        this.player = player;
    }

    public void open() {
        player.openInventory(getInventory());
    }

    public void close() {
        player.closeInventory();
    }

    public Player getPlayer() {
        return player;
    }
}
