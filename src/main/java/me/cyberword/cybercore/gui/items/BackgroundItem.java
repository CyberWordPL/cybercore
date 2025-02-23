package me.cyberword.cybercore.gui.items;

import org.bukkit.inventory.ItemStack;

public class BackgroundItem implements IInventoryGuiItem {
    private ItemStack _item;

    public BackgroundItem(ItemStack item) {
        _item = item;
    }

    public void setItem(ItemStack item) {
        _item = item;
    }

    public ItemStack getItem() {
        return _item;
    }
}
