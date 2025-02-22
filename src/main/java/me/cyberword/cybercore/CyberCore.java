package me.cyberword.cybercore;

import me.cyberword.cybercore.listener.GuiListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CyberCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new GuiListener(), this);
    }

    @Override
    public void onDisable() {
    }
}