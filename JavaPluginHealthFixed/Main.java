package me.davidatnip.JavaPluginHealthFixed;


import me.davidatnip.JavaPluginHealthFixed.events.events;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new events(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Disabled");
    }



    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ("reset".equalsIgnoreCase(label)) {

            if (sender instanceof Player) {

                Player player = (Player) sender;
                player.setMaxHealth(40);
                player.setHealth(40);

                return true;

            }


        }

        return true;
    }
}


