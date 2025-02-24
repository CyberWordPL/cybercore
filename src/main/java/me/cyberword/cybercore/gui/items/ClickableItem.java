package me.cyberword.cybercore.gui.items;

import me.cyberword.cybercore.gui.IItemSystemInventoryGui;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public abstract class ClickableItem implements IInventoryGuiItem {
    private ItemStack _item;

    public void setItem(ItemStack item) {
        _item = item;
    }

    public ItemStack getItem() {
        return _item;
    }

    @Override
    public void inventoryClickEventHandler(InventoryClickEvent event, IItemSystemInventoryGui gui) {
        event.setCancelled(true);
        onClick(event, gui);
    }

    public abstract void onClick(InventoryClickEvent event, IItemSystemInventoryGui inventoryGui);
}
