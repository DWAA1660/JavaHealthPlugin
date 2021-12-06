package me.davidatnip.JavaPluginHealthFixed.events;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class events implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        double health = player.getMaxHealth();
        String healthstr = Double.toString(health);
        player.sendMessage(healthstr + " is the amount of health you have");


    }
    @EventHandler
    public static void blockbreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        double health = player.getMaxHealth();
        String healthstr = Double.toString(health);

        double after = health - 1;
        player.setMaxHealth(after);
        String afterstr = Double.toString(after);
        player.sendMessage(ChatColor.GREEN + "Your health has now been lowered to " + afterstr);



    }

}
