package sgmaffija.scoreboardtitles.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * =====================================================================
 * Class TitleCommands inside sgmaffija.scoreboardtitles.Commands
 * Created by Jakub Ćwik on 17.02.2022
 * For ScoreboardTitles
 * =====================================================================
 */

public class TitleCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player)sender;
            if(command.getName().equalsIgnoreCase("settitle")){
                switch (args.length){
                    case 0:
                        player.sendMessage(ChatColor.RED + "Nie podano argumentu");
                        break;
                    case 1:
                        player.setPlayerListName("[" + ChatColor.translateAlternateColorCodes('&', args[0]) + ChatColor.RESET + "] " + player.getDisplayName());
                        break;
                    case 2:
                        Bukkit.getPlayer(args[0]).setPlayerListName("[" + ChatColor.translateAlternateColorCodes('&', args[1]) + ChatColor.RESET + "] " + player.getDisplayName());
                        break;
                }
            }
            if(command.getName().equalsIgnoreCase("removetitle")){
                switch (args.length){
                    case 0:
                        player.setPlayerListName(player.getDisplayName());
                        break;
                    case 1:
                        Bukkit.getPlayer(args[0]).setPlayerListName(player.getDisplayName());
                        break;
                }
            }
            /*
                    /settitle <title>
                    /settitle <playername> <title>
                    /removetitle
                    /removetitle <playername>
            */
        }
        return false;
    }
}

/*
 * +-------------------------------+
 * | §0    black                   |
 * | §1    dark_blue               |
 * | §2    dark_green              |
 * | §3    dark_aqua               |
 * | §4    dark_red                |
 * | §5    dark_purple             |
 * | §6    gold                    |
 * | §7    gray                    |
 * | §8    dark_gray               |
 * | §9    blue                    |
 * | §a    green                   |
 * | §b    aqua                    |
 * | §c    red                     |
 * | §d    light_purple            |
 * | §e    yellow                  |
 * | §f    white                   |
 * |                               |
 * | §k    Obfuscated (MAGIC)      |
 * | §l    Bold                    |
 * | §m    Strikethrough           |
 * | §n    Underline               |
 * | §o    Italic                  |
 * | §r    Reset                   |
 * +-------------------------------+
 */