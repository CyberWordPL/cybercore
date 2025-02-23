package me.cyberword.cybercore.internal.listeners;

import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

public class InternalListenersFetcher {
    public static List<Listener> getInternalListeners() {
        List<Listener> listeners = new ArrayList<>();

        listeners.add(new GuiListener());

        return listeners;
    }
}
