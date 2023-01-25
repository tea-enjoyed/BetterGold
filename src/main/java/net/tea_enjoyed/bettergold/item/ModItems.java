package net.tea_enjoyed.bettergold.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tea_enjoyed.bettergold.BetterGold;

public class ModItems {
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BetterGold.MOD_ID, name), item);
    }

    public class GoldenToolMaterial implements ToolMaterial {
        public final GoldenToolMaterial INSTANCE = new GoldenToolMaterial();

        @Override
        public int getDurability() {
            return 0;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 0;
        }

        @Override
        public float getAttackDamage() {
            return 0;
        }

        @Override
        public int getMiningLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 0;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    }
    public static final Item GOLDEN_SWORD = registerItem("golden_sword", new Item(new FabricItemSettings()));
    public static final Item GOLDEN_AXE = registerItem("golden_axe", new Item(new FabricItemSettings()));
    public static void registerModItems() {
        BetterGold.LOGGER.info("Registering mod items for Better Gold...");

    }
}
