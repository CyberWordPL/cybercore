package me.cyberword.cybercore.gui.items;

import me.cyberword.cybercore.gui.IItemSystemInventoryGui;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;


public interface IInventoryGuiItem {
    void setItem(ItemStack stack);
    ItemStack getItem();

    void inventoryClickEventHandler(InventoryClickEvent event, IItemSystemInventoryGui gui);
}