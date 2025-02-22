package me.cyberword.cybercore.gui;

import net.kyori.adventure.text.Component;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

// Basic Class that implements Inventory Logic
public abstract class InventoryGui implements InventoryHolder {

    private final InventoryType _type;
    private final Component _title;
    private final Inventory _inventory;

    public InventoryGui(JavaPlugin plugin, InventoryType type, Component title) {
        _type = type;
        _title = title;
        _inventory = plugin.getServer().createInventory(this, _type, _title);
    }

    @Override
    public @NotNull Inventory getInventory() {
        return _inventory;
    }

    public abstract void itemClickedEvent(InventoryClickEvent event);
}
