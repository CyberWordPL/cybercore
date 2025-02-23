package me.cyberword.cybercore.gui.items;

import org.bukkit.inventory.ItemStack;

public interface IInventoryGuiItem {
    void setItem(ItemStack stack);
    ItemStack getItem();
}
