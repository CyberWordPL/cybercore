package me.cyberword.cybercore.gui.items;

import me.cyberword.cybercore.gui.IItemSystemInventoryGui;
import org.bukkit.event.inventory.InventoryClickEvent;
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

    @Override
    public void inventoryClickEventHandler(InventoryClickEvent event, IItemSystemInventoryGui gui) {
        event.setCancelled(true);
    }
}
