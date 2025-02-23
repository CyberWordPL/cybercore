package me.cyberword.cybercore.internal;

import me.cyberword.cybercore.CyberCore;
import me.cyberword.cybercore.internal.listeners.InternalListenersFetcher;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import java.util.List;

public class InternalLoader {
    private static boolean isLoaded = false;

    public static void initPluginOnStartup(CyberCore plugin) {
        if (isLoaded) {
           throw new IllegalStateException("Plugin is already loaded! Please DO NOT CALL InternalLoader from other plugins!");
        }

        isLoaded = true;

        loadListeners(plugin);
    }

    private static void loadListeners(CyberCore plugin) {
        List<Listener> listeners = InternalListenersFetcher.getInternalListeners();

        for (Listener listener : listeners) {
            Bukkit.getPluginManager().registerEvents(listener, plugin);
        }
    }
}
