package me.cyberword.cybercore;

import me.cyberword.cybercore.gui.internal.InternalLoader;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CyberCore extends JavaPlugin {
    @Override
    public void onEnable() {
        InternalLoader.initPluginOnStartup(this);
    }

    @Override
    public void onDisable() {
    }
}