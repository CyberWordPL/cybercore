package me.cyberword.cybercore.gui.items;

import me.cyberword.cybercore.gui.SimpleInventoryGui;
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

    public abstract void onClick(InventoryClickEvent event, SimpleInventoryGui inventoryGui);
}
