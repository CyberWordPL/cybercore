package me.cyberword.cybercore.gui;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

// Basic Class that implements Inventory Logic
public abstract class InventoryGui implements InventoryHolder {

    protected final InventoryType _type;
    protected final Component _title;
    protected final Inventory _inventory;

    public InventoryGui(InventoryType type, Component title) {
        _type = type;
        _title = title;
        _inventory = Bukkit.createInventory(this, _type, _title);
    }

    @Override
    public @NotNull Inventory getInventory() {
        return _inventory;
    }

    public abstract void itemClickedEvent(InventoryClickEvent event);
}
