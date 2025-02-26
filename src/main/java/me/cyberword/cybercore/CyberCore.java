package me.cyberword.cybercore;

import me.cyberword.cybercore.listeners.ListenersFetcher;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CyberCore extends JavaPlugin {
    private static CyberCore instance;
    private FileConfiguration config;

    public static CyberCore getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        config = getConfig();

        for(Listener listener : ListenersFetcher.getListeners()) {
            Bukkit.getPluginManager().registerEvents(listener, this);
        }
    }

    @Override
    public void onDisable() {
        saveConfig();
    }
}