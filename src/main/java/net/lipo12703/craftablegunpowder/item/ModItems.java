package net.lipo12703.craftablegunpowder.item;

import net.lipo12703.craftablegunpowder.CraftableGunPowder;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CraftableGunPowder.MODID);

    public static final DeferredItem<Item> POTASSIUM_OXIDE_POWDER = ITEMS.register("potassium_oxide_powder",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POTASSIUM_SUGAR_MIX = ITEMS.register("potassium_sugar_mix",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POTASSIUM_NITRATE = ITEMS.register("potassium_nitrate",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
