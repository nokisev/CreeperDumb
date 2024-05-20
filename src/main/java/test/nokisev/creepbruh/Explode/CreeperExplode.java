package test.nokisev.creepbruh.Explode;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CreeperExplode implements Listener {

    @EventHandler
    public void onBlowUp(EntityTargetEvent event) {
        System.out.println(event.getReason());
        if (!(event.getEntity() instanceof Creeper)) return;
        Creeper creeper = (Creeper) event.getEntity();
        creeper.setNoDamageTicks(20);
        System.out.println(String.valueOf(creeper));
        creeper.setExplosionRadius(0);
        creeper.damage(0);
        if (!creeper.isPowered()) return;
    }
}
