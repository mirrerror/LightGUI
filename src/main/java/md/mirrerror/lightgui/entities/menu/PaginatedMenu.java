package md.mirrerror.lightgui.entities.menu;

import org.bukkit.entity.Player;

import java.util.List;

public class PaginatedMenu extends Menu {
    private List<MenuPage> pages;

    public PaginatedMenu(String title, int slots, List<MenuPage> pages) {
        super(title, slots);
        this.pages = pages;
        if(!pages.isEmpty()) displayPage(0);
    }

    public void openFor(Player player, int page) {
        displayPage(page);
        openFor(player);
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
