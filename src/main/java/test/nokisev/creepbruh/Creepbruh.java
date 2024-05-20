package test.nokisev.creepbruh;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import test.nokisev.creepbruh.Explode.CreeperExplode;

public final class Creepbruh extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("creeper is dumb");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new CreeperExplode(), this);
        getLogger().info("    ");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("creeper is strong");
    }


}
