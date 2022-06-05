package odaia3.odaia3;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class OdaiA3 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getLogger().info(getName() + " enabled.");

        // event register
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getLogger().info(getName() + " disabled.");
    }
}
