package dev.orbit.essentials.commands;

import dev.orbit.essentials.commandf.Command;
import dev.orbit.essentials.commandf.CommandArgs;
import dev.orbit.essentials.config.ConfigFile;
import dev.orbit.essentials.utils.CC;
import org.bukkit.plugin.Plugin;

public class HealCommand {
    @Command(name = "Heal", description = "Fill the user live")
    public void HealCommand(CommandArgs args) {
        args.getSender().sendMessage(CC.translate(ConfigFile.getConfig().getString("MESSAGES.HEAL-MESSAGE").replace(ConfigFile.getConfig().getString("PREFIX"), "%prefix%").replace(args.getPlayer().getName(), "%player%")));
        if(!args.getPlayer().hasPermission("essentials.cmd.heal")){
            args.getPlayer().sendMessage(CC.translate(ConfigFile.getConfig().getString("MESSAGES.NO-PERM")));
        }else {
            args.getPlayer().setHealth(20.0);

        }
    }
}
