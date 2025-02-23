package me.cyberword.cybercore.listeners;

import me.cyberword.cybercore.gui.InventoryGui;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

class GuiListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory inventory = event.getInventory();

        if (!(inventory.getHolder(false) instanceof InventoryGui holder)) return;

        //Parse events
        holder.itemClickedEvent(event);
    }
}
