package me.cyberword.cybercore.gui.items;

import org.bukkit.inventory.ItemStack;

public class BasicItem implements IInventoryGuiItem {
    private ItemStack _item;

    public BasicItem(ItemStack item) {
        _item = item;
    }

    public void setItem(ItemStack item) {
        _item = item;
    }
    public ItemStack getItem() {
        return _item;
    }
}
