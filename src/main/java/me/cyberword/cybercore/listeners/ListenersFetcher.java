package me.cyberword.cybercore.listeners;

import org.bukkit.event.Listener;
import org.jetbrains.annotations.ApiStatus;

import java.util.ArrayList;
import java.util.List;

@ApiStatus.Internal
public class ListenersFetcher {
    public static List<Listener> getListeners() {
        List<Listener> listeners = new ArrayList<>();

        listeners.add(new GuiListener());

        return listeners;
    }
}
