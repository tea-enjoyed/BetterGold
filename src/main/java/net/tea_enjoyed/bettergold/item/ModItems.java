package net.tea_enjoyed.bettergold.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.tea_enjoyed.bettergold.BetterGold;

import java.rmi.registry.Registry;

public class ModItems {
    private static Item registerItem(String name, Item item){
        return Registry.register(net.minecraft.util.registry.Registry.ITEM, new Identifier(BetterGold.MOD_ID, name), item);
    }
    public static final Item GOLDEN_SWORD = registerItem("golden_sword", new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item GOLDEN_AXE = registerItem("golden_axe", new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static void registerModItems() {
        BetterGold.LOGGER.info("Registering mod items for Better Gold...");

    }
}
