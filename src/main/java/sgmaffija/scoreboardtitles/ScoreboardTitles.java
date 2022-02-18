package sgmaffija.scoreboardtitles;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import sgmaffija.scoreboardtitles.Commands.TitleCommands;

public final class ScoreboardTitles extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommands();

        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[ScoreboardTitles] ON &r"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[ScoreboardTitles] OFF &r"));
    }

    public void registerCommands(){
        this.getCommand("settitle").setExecutor(new TitleCommands());
        this.getCommand("removetitle").setExecutor(new TitleCommands());
    }
}
