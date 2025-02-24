package me.cyberword.cybercore.gui;

import me.cyberword.cybercore.gui.items.BackgroundItem;
import me.cyberword.cybercore.gui.items.BasicItem;
import me.cyberword.cybercore.gui.items.ClickableItem;
import me.cyberword.cybercore.gui.items.IInventoryGuiItem;
import net.kyori.adventure.text.Component;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

/// Basic Inventory GUI
public class SimpleInventoryGui extends InventoryGui implements IItemSystemInventoryGui {
    private ItemStack _backgroundItem;
    private final List<IInventoryGuiItem> _items;

    private void updateInventorySlots() {
        for (int i = 0; i < _items.size(); i++) {
            this._inventory.setItem(i, _items.get(i).getItem());
        }
    }

    public SimpleInventoryGui(InventoryType type, Component title, ItemStack backgroundItem) {
        super(type, title);

        _items = new ArrayList<>();

        int size = type.getDefaultSize();

        _backgroundItem = backgroundItem;

        for(int i = 0; i < size; i++) {
            _items.add(new BackgroundItem(backgroundItem));
        }

        updateInventorySlots();
    }

    public void changeBackground(ItemStack itemStack) {
        this._backgroundItem = itemStack;

        for(IInventoryGuiItem item : _items) {
            if(!(item instanceof BackgroundItem)) continue;

            item.setItem(itemStack);
        }

        updateInventorySlots();
    }

    public void addNonBackgroundItem(int slot, IInventoryGuiItem item) {
        _items.set(slot, item);

        updateInventorySlots();
    }

    public void setToBackgroundItem(int slot) {
        _items.set(slot, new BackgroundItem(_backgroundItem));

        updateInventorySlots();
    }

    public void clearSlot(int slot) {
        _items.set(slot, new BasicItem(ItemStack.empty()));

        updateInventorySlots();
    }

    @Override
    public void itemClickedEvent(InventoryClickEvent event) {
        if(event.getRawSlot() < _items.size() && event.getRawSlot() >= 0) {
            IInventoryGuiItem item = _items.get(event.getSlot());

            item.inventoryClickEventHandler(event, this);

            updateInventorySlots();
        }
    }

    @Override
    public List<IInventoryGuiItem> getItems() {
        return _items;
    }
}
