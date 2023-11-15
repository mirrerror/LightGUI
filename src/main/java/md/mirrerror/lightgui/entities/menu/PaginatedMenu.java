package md.mirrerror.lightgui.entities.menu;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaginatedMenu extends Menu {
    private final List<MenuPage> pages;

    public PaginatedMenu(String title, int slots, List<MenuPage> pages) {
        super(title, slots);
        this.pages = pages;
        if(!pages.isEmpty()) displayPage(0);
    }

    public PaginatedMenu(String title, int slots) {
        super(title, slots);
        this.pages = new ArrayList<>();
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

    public void addPage(MenuPage menuPage) {
        pages.add(menuPage);
    }

    public void setPage(int pageNumber, MenuPage menuPage) {
        pages.set(pageNumber, menuPage);
    }

    public void removePage(int page) {
        pages.remove(page);
    }

    public List<MenuPage> getPages() {
        return Collections.unmodifiableList(pages);
    }
}
