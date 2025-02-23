package me.cyberword.cybercore.gui.internal;

import me.cyberword.cybercore.CyberCore;
import me.cyberword.cybercore.gui.internal.listeners.InternalListenersFetcher;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import java.util.List;

public class InternalLoader {
    public static void initPluginOnStartup(CyberCore plugin) {
        loadListeners(plugin);
    }

    private static void loadListeners(CyberCore plugin) {
        List<Listener> listeners = InternalListenersFetcher.getInternalListeners();

        for (Listener listener : listeners) {
            Bukkit.getPluginManager().registerEvents(listener, plugin);
        }
    }
}
