package net.dkxly.fabridash_resurrected.items;

import net.dkxly.fabridash_resurrected.FabridashResurrectedMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class FabridashResurrectedItems {
    public static final Item FABRIDASH_RESURRECTED_LOGO = registerItem(
            "fabridash_resurrected_logo",
            new Item(new FabricItemSettings()));

    public static final Item CALIBRATED_NETHERITE_PLATED_OBSIDIAN_DASHER = registerItem(
            "calibrated_netherite_plated_obsidian_dasher",
            new CalibratedNetheritePlatedObsidianDasher(new FabricItemSettings()
                    .group(FabridashResurrectedItemGroups.FABRIDASH_RESURRECTED)
                    .rarity(Rarity.EPIC)
                    .maxCount(1)
                    .fireproof()));

    public static final Item CALIBRATED_OBSIDIAN_DASHER = registerItem(
            "calibrated_obsidian_dasher",
            new CalibratedObsidianDasher(new FabricItemSettings()
                    .group(FabridashResurrectedItemGroups.FABRIDASH_RESURRECTED)
                    .rarity(Rarity.EPIC)
                    .maxCount(1)));

    public static final Item IRON_DASHER = registerItem(
            "iron_dasher",
            new IronDasher(new FabricItemSettings()
                    .group(FabridashResurrectedItemGroups.FABRIDASH_RESURRECTED)
                    .rarity(Rarity.UNCOMMON)
                    .maxCount(1)));

    public static final Item DIAMOND_DASHER = registerItem(
            "diamond_dasher",
            new DiamondDasher(new FabricItemSettings()
                    .group(FabridashResurrectedItemGroups.FABRIDASH_RESURRECTED)
                    .rarity(Rarity.RARE)
                    .maxCount(1)));

    public static final Item OBSIDIAN_DASHER = registerItem(
            "obsidian_dasher",
            new ObsidianDasher(new FabricItemSettings()
                    .group(FabridashResurrectedItemGroups.FABRIDASH_RESURRECTED)
                    .rarity(Rarity.RARE)
                    .maxCount(1)));

    public static final Item DASH_GLOBE = registerItem(
            "dash_globe",
            new DashGlobe(new FabricItemSettings()
                    .group(FabridashResurrectedItemGroups.FABRIDASH_RESURRECTED)
                    .rarity(Rarity.UNCOMMON)
                    .maxCount(16)));

    private static Item registerItem(String name, Item item){
        Item registryEntry = Registry.register(Registry.ITEM, new Identifier(FabridashResurrectedMod.MOD_ID, name), item);
        return registryEntry;
    }

    public static void registerItems(){
        FabridashResurrectedMod.LOGGER.info("Registering items...");
    }
}
