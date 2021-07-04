package dev.orbit.essentials;

import dev.orbit.essentials.commandf.CommandFramework;
import dev.orbit.essentials.commands.HealCommand;
import dev.orbit.essentials.utils.CC;
import org.bukkit.plugin.java.JavaPlugin;

public class QEssentials extends JavaPlugin {

    CommandFramework framework;

    @Override
    public void onEnable(){
        framework = new CommandFramework(this);
        CC.log("&bqEssentials &7| &fLoading Plugin... ");
        this.loadListeners();
        framework.registerCommands(new HealCommand());

        CC.log("&bqEssentials &7| Plugin Ready. ");
    }

    public void onDisable(){
        CC.log("&bqEssentials &7| &fDisabling Plugin... ");
    }

    public static QEssentials get() {
        return getPlugin(QEssentials.class);
    }

    public void loadListeners(){
    }
}
