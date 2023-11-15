package md.mirrerror.lightgui;

import md.mirrerror.lightgui.entities.menu.Menu;

import java.util.HashSet;
import java.util.Set;

public class MenuRegistry {

    private Set<Menu> menus;

    public MenuRegistry() {
        menus = new HashSet<>();
    }

    public void registerNewMenu(Menu menu) {
        menus.add(menu);
    }

    public void unregisterMenu(Menu menu) {
        menus.remove(menu);
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }
}
