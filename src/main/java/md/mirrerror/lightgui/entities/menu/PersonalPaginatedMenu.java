package md.mirrerror.lightgui.entities.menu;

import org.bukkit.entity.Player;

import java.util.List;

public class PersonalPaginatedMenu extends PersonalMenu {
    private List<MenuPage> pages;

    public PersonalPaginatedMenu(Player player, String title, int slots, List<MenuPage> pages) {
        super(player, title, slots);
        this.pages = pages;
        if(!pages.isEmpty()) displayPage(0);
    }

    public void open(int page) {
        displayPage(page);
        open();
    }

    public void displayPage(int page) {
        getInventory().clear();
        MenuPage menuPage = pages.get(page);
        menuPage.getItems().forEach((slot, item) -> getInventory().setItem(slot, item));
        menuPage.getElements().forEach((slot, element) -> getInventory().setItem(slot, element.getItemStack()));
    }

    public List<MenuPage> getPages() {
        return pages;
    }

    public void setPages(List<MenuPage> pages) {
        this.pages = pages;
    }
}
