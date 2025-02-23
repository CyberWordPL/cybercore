package me.cyberword.cybercore;

import me.cyberword.cybercore.listeners.ListenersFetcher;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CyberCore extends JavaPlugin {
    @Override
    public void onEnable() {
        for(Listener listener : ListenersFetcher.getListeners()) {
            Bukkit.getPluginManager().registerEvents(listener, this);
        }
    }

    @Override
    public void onDisable() {
    }
}