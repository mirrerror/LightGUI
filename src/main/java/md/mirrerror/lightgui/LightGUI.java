package md.mirrerror.lightgui;

import md.mirrerror.lightgui.events.MenuListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LightGUI extends JavaPlugin {
    private MenuRegistry menuRegistry;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new MenuListener(), this);
        menuRegistry = new MenuRegistry();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public MenuRegistry getMenuRegistry() {
        return menuRegistry;
    }
}
