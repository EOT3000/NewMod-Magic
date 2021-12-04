package fly.magic.setup;

import fly.magic.bases.Rune;
import fly.magic.impl.EnchantingRune;
import fly.magic.impl.LevelRune;
import fly.magic.impl.machines.EnchantmentRemover;
import fly.magic.impl.machines.EnchantmentRuneCombiner;
import fly.newmod.NewMod;
import fly.newmod.bases.ModItem;
import fly.newmod.setup.Setup;
import fly.newmod.utils.Pair;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import static org.bukkit.Material.*;
import static org.bukkit.enchantments.Enchantment.*;
import static org.bukkit.enchantments.Enchantment.THORNS;

public class MagicAddonSetup {
    public static void init() {

    }

    public static final ModItem BLANK_RUNE = new Rune("&0Blank Rune", "blank_rune", Color.fromRGB(0x000000), Rune.RuneType.OTHER);
    public static final ModItem BLOCK_RUNE = new ModItem(CLAY, "&7Block Rune", "block_rune", new ItemStack(STONE), BLANK_RUNE);

    public static final ModItem LEVEL_RUNE1 = new LevelRune("&cLevel One Rune", "level_rune_one", Color.fromRGB(0xFF0000), 1);
    public static final ModItem LEVEL_RUNE2 = new LevelRune("&cLevel Two Rune", "level_rune_two", Color.fromRGB(0xFF9900), 2);
    public static final ModItem LEVEL_RUNE3 = new LevelRune("&cLevel Three Rune", "level_rune_three", Color.fromRGB(0xCCFF00), 3);
    public static final ModItem LEVEL_RUNE4 = new LevelRune("&cLevel Four Rune", "level_rune_four", Color.fromRGB(0x33FF00), 4);
    public static final ModItem LEVEL_RUNE5 = new LevelRune("&cLevel Five Rune", "level_rune_five", Color.fromRGB(0x00FF66), 5);
    public static final ModItem LEVEL_RUNE6 = new LevelRune("&cLevel Six Rune", "level_rune_six", Color.fromRGB(0x00FFFF), 6);
    public static final ModItem LEVEL_RUNE7 = new LevelRune("&cLevel Seven Rune", "level_rune_seven", Color.fromRGB(0x0066FF), 7);
    public static final ModItem LEVEL_RUNE8 = new LevelRune("&cLevel Eight Rune", "level_rune_eight", Color.fromRGB(0x3300FF), 8);
    public static final ModItem LEVEL_RUNE9 = new LevelRune("&cLevel Nine Rune", "level_rune_nine", Color.fromRGB(0xCC00FF), 9);
    public static final ModItem LEVEL_RUNE10 = new LevelRune("&cLevel Ten Rune", "level_rune_ten", Color.fromRGB(0xFF0099), 10);

    public static final ModItem ENCHANTED_RUNE_UNBREAKING = new EnchantingRune("&cUnbreaking Rune", "enchanted_rune_unbreaking", Color.fromRGB(0x1C1808), DURABILITY);
    public static final ModItem ENCHANTED_RUNE_SHARPNESS = new EnchantingRune("&eSharpness Rune", "enchanted_rune_sharpness", Color.fromRGB(0xFFFF64), DAMAGE_ALL, p(ROTTEN_FLESH, DAMAGE_UNDEAD), p(SPIDER_EYE, DAMAGE_ARTHROPODS), p(ARROW, ARROW_DAMAGE));
    public static final ModItem ENCHANTED_RUNE_EFFICIENCY = new EnchantingRune("&1Efficiency Rune", "enchanted_rune_efficiency", Color.fromRGB(0x000088), DIG_SPEED);
    public static final ModItem ENCHANTED_RUNE_PROTECTION = new EnchantingRune("&cProtection Rune", "enchanted_rune_protection", Color.fromRGB(0x3C2814), PROTECTION_ENVIRONMENTAL, p(MAGMA_CREAM, PROTECTION_FIRE), p(GUNPOWDER, PROTECTION_EXPLOSIONS), p(PHANTOM_MEMBRANE, PROTECTION_FALL), p(ARROW, PROTECTION_PROJECTILE));
    public static final ModItem ENCHANTED_RUNE_THORNS = new EnchantingRune("&2Thorns Rune", "enchanted_rune_thorns", Color.fromRGB(0x008800), THORNS);

    public static final ModItem COMBINED_RUNE = new Rune("&cCombined Enchantment Rune", "combined_rune", Color.fromRGB(0xFFFFFF), Rune.RuneType.OTHER);

    public static final ModItem BASIC_WAND = new ModItem(STICK, "&cBasic Wand", "basic_wand");
    public static final ModItem WATER_WAND = new ModItem(STICK, "&bWater Wand", "water_wand");
    public static final ModItem FIRE_WAND = new ModItem(STICK, "&cFire Wand", "fire_wand");

    public static final ModItem RED_HELMET = leatherColor(new ModItem(LEATHER_HELMET, "&4Red Helmet", "red_helmet"), Color.fromRGB(255, 0, 0), true);
    public static final ModItem RED_CHESPLATE = leatherColor(new ModItem(LEATHER_CHESTPLATE, "&4Red Chesplate", "red_chestplate"), Color.fromRGB(255, 0, 0), true);
    public static final ModItem RED_LEGGINGS = leatherColor(new ModItem(LEATHER_LEGGINGS, "&4Red Leggings", "red_leggings"), Color.fromRGB(255, 0, 0), true);
    public static final ModItem RED_BOOTS = leatherColor(new ModItem(LEATHER_BOOTS, "&4Red Boots", "red_boots"), Color.fromRGB(255, 0, 0), true);

    public static final ModItem ORANGE_HELMET = leatherColor(new ModItem(LEATHER_HELMET, "&6Orange Helmet", "orange_helmet"), Color.fromRGB(255, 127, 0), true);
    public static final ModItem ORANGE_CHESPLATE = leatherColor(new ModItem(LEATHER_CHESTPLATE, "&6Orange Chesplate", "orange_chestplate"), Color.fromRGB(255, 127, 0), true);
    public static final ModItem ORANGE_LEGGINGS = leatherColor(new ModItem(LEATHER_LEGGINGS, "&6Orange Leggings", "orange_leggings"), Color.fromRGB(255, 127, 0), true);
    public static final ModItem ORANGE_BOOTS = leatherColor(new ModItem(LEATHER_BOOTS, "&6Orange Boots", "orange_boots"), Color.fromRGB(255, 127, 0), true);

    public static final ModItem YELLOW_HELMET = leatherColor(new ModItem(LEATHER_HELMET, "&6Yellow Helmet", "yellow_helmet"), Color.fromRGB(255, 255, 0), true);
    public static final ModItem YELLOW_CHESPLATE = leatherColor(new ModItem(LEATHER_CHESTPLATE, "&6Yellow Chesplate", "yellow_chestplate"), Color.fromRGB(255, 255, 0), true);
    public static final ModItem YELLOW_LEGGINGS = leatherColor(new ModItem(LEATHER_LEGGINGS, "&6Yellow Leggings", "yellow_leggings"), Color.fromRGB(255, 255, 0), true);
    public static final ModItem YELLOW_BOOTS = leatherColor(new ModItem(LEATHER_BOOTS, "&6Yellow Boots", "yellow_boots"), Color.fromRGB(255, 255, 0), true);

    public static final ModItem GREEN_HELMET = leatherColor(new ModItem(LEATHER_HELMET, "&2Green Helmet", "green_helmet"), Color.fromRGB(0, 255, 0), true);
    public static final ModItem GREEN_CHESPLATE = leatherColor(new ModItem(LEATHER_CHESTPLATE, "&2Green Chesplate", "green_chestplate"), Color.fromRGB(0, 255, 0), true);
    public static final ModItem GREEN_LEGGINGS = leatherColor(new ModItem(LEATHER_LEGGINGS, "&2Green Leggings", "green_leggings"), Color.fromRGB(0, 255, 0), true);
    public static final ModItem GREEN_BOOTS = leatherColor(new ModItem(LEATHER_BOOTS, "&2Green Boots", "green_boots"), Color.fromRGB(0, 255, 0), true);

    public static final ModItem BLUE_HELMET = leatherColor(new ModItem(LEATHER_HELMET, "&1Blue Helmet", "blue_helmet"), Color.fromRGB(0, 0, 255), true);
    public static final ModItem BLUE_CHESPLATE = leatherColor(new ModItem(LEATHER_CHESTPLATE, "&1Blue Chesplate", "blue_chestplate"), Color.fromRGB(0, 0, 255), true);
    public static final ModItem BLUE_LEGGINGS = leatherColor(new ModItem(LEATHER_LEGGINGS, "&1Blue Leggings", "blue_leggings"), Color.fromRGB(0, 0, 255), true);
    public static final ModItem BLUE_BOOTS = leatherColor(new ModItem(LEATHER_BOOTS, "&1Blue Boots", "blue_boots"), Color.fromRGB(0, 0, 255), true);

    public static final ModItem PURPLE_HELMET = leatherColor(new ModItem(LEATHER_HELMET, "&5Purple Helmet", "purple_helmet"), Color.fromRGB(255, 0, 255), true);
    public static final ModItem PURPLE_CHESPLATE = leatherColor(new ModItem(LEATHER_CHESTPLATE, "&5Purple Chesplate", "purple_chestplate"), Color.fromRGB(255, 0, 255), true);
    public static final ModItem PURPLE_LEGGINGS = leatherColor(new ModItem(LEATHER_LEGGINGS, "&5Purple Leggings", "purple_leggings"), Color.fromRGB(255, 0, 255), true);
    public static final ModItem PURPLE_BOOTS = leatherColor(new ModItem(LEATHER_BOOTS, "&5Purple Boots", "purple_boots"), Color.fromRGB(255, 0, 255), true);

    public static final ModItem WHITE_HELMET = leatherColor(new ModItem(LEATHER_HELMET, "&fWhite Helmet", "white_helmet"), Color.fromRGB(255, 255, 255), true);
    public static final ModItem WHITE_CHESPLATE = leatherColor(new ModItem(LEATHER_CHESTPLATE, "&fWhite Chesplate", "white_chestplate"), Color.fromRGB(255, 255, 255), true);
    public static final ModItem WHITE_LEGGINGS = leatherColor(new ModItem(LEATHER_LEGGINGS, "&fWhite Leggings", "white_leggings"), Color.fromRGB(255, 255, 255), true);
    public static final ModItem WHITE_BOOTS = leatherColor(new ModItem(LEATHER_BOOTS, "&fWhite Boots", "white_boots"), Color.fromRGB(255, 255, 255), true);

    public static final ModItem BLACK_HELMET = leatherColor(new ModItem(LEATHER_HELMET, "&0Black Helmet", "black_helmet"), Color.fromRGB(0, 0, 0), true);
    public static final ModItem BLACK_CHESPLATE = leatherColor(new ModItem(LEATHER_CHESTPLATE, "&0Black Chesplate", "black_chestplate"), Color.fromRGB(0, 0, 0), true);
    public static final ModItem BLACK_LEGGINGS = leatherColor(new ModItem(LEATHER_LEGGINGS, "&0Black Leggings", "black_leggings"), Color.fromRGB(0, 0, 0), true);
    public static final ModItem BLACK_BOOTS = leatherColor(new ModItem(LEATHER_BOOTS, "&0Black Boots", "black_boots"), Color.fromRGB(0, 0, 0), true);

    public static final ModItem RAINBOW_HELMET = rainbowArmor(new ModItem(LEATHER_HELMET, "&cR&6a&ei&an&bb&1o&dw Helmet", "rainbow_helmet"), Color.fromRGB(255, 0, 0), true);
    public static final ModItem RAINBOW_CHESPLATE = rainbowArmor(new ModItem(LEATHER_CHESTPLATE, "&cR&6a&ei&an&bb&1o&dw Chesplate", "rainbow_chestplate"), Color.fromRGB(255, 0, 0), true);
    public static final ModItem RAINBOW_LEGGINGS = rainbowArmor(new ModItem(LEATHER_LEGGINGS, "&cR&6a&ei&an&bb&1o&dw Leggings", "rainbow_leggings"), Color.fromRGB(255, 0, 0), true);
    public static final ModItem RAINBOW_BOOTS = rainbowArmor(new ModItem(LEATHER_BOOTS, "&cR&6a&ei&an&bb&1o&dw Boots", "rainbow_boots"), Color.fromRGB(255, 0, 0), true);

    public static final ModItem NETHER_MAGIC_LUMP = new ModItem(GHAST_TEAR, "&4Magic Lump - Nether", "nether_magic_lump", 6, new ItemStack(NETHER_STAR));

    public static final ModItem ENCHANTMENT_REMOVER = new EnchantmentRemover();

    public static final ModItem ENCHANTMENT_RUNE_COMBINER = new EnchantmentRuneCombiner();

    public static ModItem leatherColor(ModItem stack, Color color, boolean unbreakable) {
        LeatherArmorMeta meta = (LeatherArmorMeta) stack.getItemMeta();

        meta.setUnbreakable(unbreakable);

        meta.setColor(color);

        stack.setItemMeta(meta);

        return stack;
    }

    public static ModItem rainbowArmor(ModItem stack, Color color, boolean unbreakable) {
        LeatherArmorMeta meta = (LeatherArmorMeta) stack.getItemMeta();

        meta.setUnbreakable(unbreakable);

        meta.setColor(color);

        meta.addEnchant(PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(PROTECTION_EXPLOSIONS, 10, true);
        meta.addEnchant(PROTECTION_FALL, 10, true);
        meta.addEnchant(PROTECTION_FIRE, 10, true);
        meta.addEnchant(PROTECTION_PROJECTILE, 10, true);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        stack.setItemMeta(meta);

        return stack;
    }

    private static <A,B> Pair<A, B> p(A a, B b) {
        return new Pair<>(a, b);
    }

    static {
        ShapelessRecipe blankRune = new ShapelessRecipe(new NamespacedKey(NewMod.get(), "blank_rune"), BLANK_RUNE);

        blankRune.addIngredient(STONE);
        blankRune.addIngredient(POPPED_CHORUS_FRUIT);
        blankRune.addIngredient(MAGMA_CREAM);
        blankRune.addIngredient(NETHER_MAGIC_LUMP);

        Bukkit.addRecipe(blankRune);
    }
}
