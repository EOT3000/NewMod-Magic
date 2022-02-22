package fly.magic.setup;

import fly.magic.bases.Rune;
import fly.magic.impl.EnchantingRune;
import fly.magic.impl.LevelRune;
import fly.magic.impl.portals.Teleporter;
import fly.newmod.NewMod;
import fly.newmod.bases.ModItem;
import fly.newmod.utils.Pair;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.JoinConfiguration;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.Collections;

import static org.bukkit.Material.*;
import static org.bukkit.enchantments.Enchantment.*;
import static org.bukkit.enchantments.Enchantment.THORNS;

public class MagicAddonSetup {
    public static void init() {

    }

    public static final Rune BLANK_RUNE = new Rune("Blank Rune", "blank_rune", Color.fromRGB(0x000000), Rune.RuneType.OTHER);
    public static final ModItem BLOCK_RUNE = new ModItem(CLAY, "Block Rune", "block_rune", new ItemStack(STONE), BLANK_RUNE);

    public static final LevelRune LEVEL_RUNE1 = new LevelRune("Level One Rune", "level_rune_one", Color.fromRGB(0xFF0000), 1);
    public static final LevelRune LEVEL_RUNE2 = new LevelRune("Level Two Rune", "level_rune_two", Color.fromRGB(0xFF9900), 2);
    public static final LevelRune LEVEL_RUNE3 = new LevelRune("Level Three Rune", "level_rune_three", Color.fromRGB(0xCCFF00), 3);
    public static final LevelRune LEVEL_RUNE4 = new LevelRune("Level Four Rune", "level_rune_four", Color.fromRGB(0x33FF00), 4);
    public static final LevelRune LEVEL_RUNE5 = new LevelRune("Level Five Rune", "level_rune_five", Color.fromRGB(0x00FF66), 5);
    public static final LevelRune LEVEL_RUNE6 = new LevelRune("Level Six Rune", "level_rune_six", Color.fromRGB(0x00FFFF), 6);
    public static final LevelRune LEVEL_RUNE7 = new LevelRune("Level Seven Rune", "level_rune_seven", Color.fromRGB(0x0066FF), 7);
    public static final LevelRune LEVEL_RUNE8 = new LevelRune("Level Eight Rune", "level_rune_eight", Color.fromRGB(0x3300FF), 8);
    public static final LevelRune LEVEL_RUNE9 = new LevelRune("Level Nine Rune", "level_rune_nine", Color.fromRGB(0xCC00FF), 9);
    public static final LevelRune LEVEL_RUNE10 = new LevelRune("Level Ten Rune", "level_rune_ten", Color.fromRGB(0xFF0099), 10);

    public static final EnchantingRune ENCHANTED_RUNE_UNBREAKING = new EnchantingRune("Unbreaking Rune", "enchanted_rune_unbreaking", Color.fromRGB(0x1C1808), DURABILITY);
    public static final EnchantingRune ENCHANTED_RUNE_SHARPNESS = new EnchantingRune("Sharpness Rune", "enchanted_rune_sharpness", Color.fromRGB(0xFFFF64), DAMAGE_ALL, p(ROTTEN_FLESH, DAMAGE_UNDEAD), p(SPIDER_EYE, DAMAGE_ARTHROPODS), p(ARROW, ARROW_DAMAGE));
    public static final EnchantingRune ENCHANTED_RUNE_EFFICIENCY = new EnchantingRune("Efficiency Rune", "enchanted_rune_efficiency", Color.fromRGB(0x000088), DIG_SPEED);
    public static final EnchantingRune ENCHANTED_RUNE_PROTECTION = new EnchantingRune("Protection Rune", "enchanted_rune_protection", Color.fromRGB(0x3C2814), PROTECTION_ENVIRONMENTAL, p(MAGMA_CREAM, PROTECTION_FIRE), p(GUNPOWDER, PROTECTION_EXPLOSIONS), p(PHANTOM_MEMBRANE, PROTECTION_FALL), p(ARROW, PROTECTION_PROJECTILE));
    public static final EnchantingRune ENCHANTED_RUNE_THORNS = new EnchantingRune("Thorns Rune", "enchanted_rune_thorns", Color.fromRGB(0x008800), THORNS);

    public static final Rune COMBINED_RUNE = new Rune("Combined Enchantment Rune", "combined_rune", Color.fromRGB(0xFFFFFF), Rune.RuneType.OTHER);

    //public static final ModItem BASIC_WAND = new ModItem(STICK, "Basic Wand", "basic_wand");
    //public static final ModItem WATER_WAND = new ModItem(STICK, "Water Wand", "water_wand");
    //public static final ModItem FIRE_WAND = new ModItem(STICK, "Fire Wand", "fire_wand");

    public static final ModItem RED_HELMET = coloredSub(new ModItem(LEATHER_HELMET, "Red Helmet", 0xFF0000, "red_helmet"), Color.fromRGB(0xFF0000), true);
    public static final ModItem RED_CHESTPLATE = coloredSub(new ModItem(LEATHER_CHESTPLATE, "Red Chestplate", 0xFF0000, "red_chestplate"), Color.fromRGB(0xFF0000), true);
    public static final ModItem RED_LEGGINGS = coloredSub(new ModItem(LEATHER_LEGGINGS, "Red Leggings", 0xFF0000, "red_leggings"), Color.fromRGB(0xFF0000), true);
    public static final ModItem RED_BOOTS = coloredSub(new ModItem(LEATHER_BOOTS, "Red Boots", 0xFF0000, "red_boots"), Color.fromRGB(0xFF0000), true);

    public static final ModItem ORANGE_HELMET = coloredSub(new ModItem(LEATHER_HELMET, "Orange Helmet", 0xFF8000, "orange_helmet"), Color.fromRGB(0xFF8000), true);
    public static final ModItem ORANGE_CHESTPLATE = coloredSub(new ModItem(LEATHER_CHESTPLATE, "Orange Chestplate", 0xFF8000, "orange_chestplate"), Color.fromRGB(0xFF8000), true);
    public static final ModItem ORANGE_LEGGINGS = coloredSub(new ModItem(LEATHER_LEGGINGS, "Orange Leggings", 0xFF8000, "orange_leggings"), Color.fromRGB(0xFF8000), true);
    public static final ModItem ORANGE_BOOTS = coloredSub(new ModItem(LEATHER_BOOTS, "Orange Boots", 0xFF8000, "orange_boots"), Color.fromRGB(0xFF8000), true);

    public static final ModItem YELLOW_HELMET = coloredSub(new ModItem(LEATHER_HELMET, "Yellow Helmet", 0xFFFF00, "yellow_helmet"), Color.fromRGB(255, 255, 0), true);
    public static final ModItem YELLOW_CHESTPLATE = coloredSub(new ModItem(LEATHER_CHESTPLATE, "Yellow Chestplate", 0xFFFF00, "yellow_chestplate"), Color.fromRGB(255, 255, 0), true);
    public static final ModItem YELLOW_LEGGINGS = coloredSub(new ModItem(LEATHER_LEGGINGS, "Yellow Leggings", 0xFFFF00, "yellow_leggings"), Color.fromRGB(255, 255, 0), true);
    public static final ModItem YELLOW_BOOTS = coloredSub(new ModItem(LEATHER_BOOTS, "Yellow Boots", 0xFFFF00, "yellow_boots"), Color.fromRGB(255, 255, 0), true);

    public static final ModItem GREEN_HELMET = coloredSub(new ModItem(LEATHER_HELMET, "Green Helmet", 0x00FF00, "green_helmet"), Color.fromRGB(0x00FF00), true);
    public static final ModItem GREEN_CHESTPLATE = coloredSub(new ModItem(LEATHER_CHESTPLATE, "Green Chestplate", 0x00FF00, "green_chestplate"), Color.fromRGB(0x00FF00), true);
    public static final ModItem GREEN_LEGGINGS = coloredSub(new ModItem(LEATHER_LEGGINGS, "Green Leggings", 0x00FF00, "green_leggings"), Color.fromRGB(0x00FF00), true);
    public static final ModItem GREEN_BOOTS = coloredSub(new ModItem(LEATHER_BOOTS, "Green Boots", 0x00FF00, "green_boots"), Color.fromRGB(0x00FF00), true);

    public static final ModItem BLUE_HELMET = coloredSub(new ModItem(LEATHER_HELMET, "Blue Helmet", 0x0000FF, "blue_helmet"), Color.fromRGB(0x0000FF), true);
    public static final ModItem BLUE_CHESTPLATE = coloredSub(new ModItem(LEATHER_CHESTPLATE, "Blue Chestplate", 0x0000FF, "blue_chestplate"), Color.fromRGB(0x0000FF), true);
    public static final ModItem BLUE_LEGGINGS = coloredSub(new ModItem(LEATHER_LEGGINGS, "Blue Leggings", 0x0000FF, "blue_leggings"), Color.fromRGB(0x0000FF), true);
    public static final ModItem BLUE_BOOTS = coloredSub(new ModItem(LEATHER_BOOTS, "Blue Boots", 0x0000FF, "blue_boots"), Color.fromRGB(0x0000FF), true);

    public static final ModItem PURPLE_HELMET = coloredSub(new ModItem(LEATHER_HELMET, "Purple Helmet", 0x400080, "purple_helmet"), Color.fromRGB(0x400080), true);
    public static final ModItem PURPLE_CHESTPLATE = coloredSub(new ModItem(LEATHER_CHESTPLATE, "Purple Chestplate", 0x400080, "purple_chestplate"), Color.fromRGB(0x400080), true);
    public static final ModItem PURPLE_LEGGINGS = coloredSub(new ModItem(LEATHER_LEGGINGS, "Purple Leggings", 0x400080, "purple_leggings"), Color.fromRGB(0x400080), true);
    public static final ModItem PURPLE_BOOTS = coloredSub(new ModItem(LEATHER_BOOTS, "Purple Boots", 0x400080, "purple_boots"), Color.fromRGB(0x400080), true);

    public static final ModItem WHITE_HELMET = coloredSub(new ModItem(LEATHER_HELMET, "White Helmet", 0xFFFFFF, "white_helmet"), Color.fromRGB(0xFFFFFF), true);
    public static final ModItem WHITE_CHESTPLATE = coloredSub(new ModItem(LEATHER_CHESTPLATE, "White Chestplate", 0xFFFFFF, "white_chestplate"), Color.fromRGB(0xFFFFFF), true);
    public static final ModItem WHITE_LEGGINGS = coloredSub(new ModItem(LEATHER_LEGGINGS, "White Leggings", 0xFFFFFF, "white_leggings"), Color.fromRGB(0xFFFFFF), true);
    public static final ModItem WHITE_BOOTS = coloredSub(new ModItem(LEATHER_BOOTS, "White Boots", 0xFFFFFF, "white_boots"), Color.fromRGB(0xFFFFFF), true);

    public static final ModItem BLACK_HELMET = coloredSub(new ModItem(LEATHER_HELMET, "Black Helmet", 0x000000, "black_helmet"), Color.fromRGB(0x000000), true);
    public static final ModItem BLACK_CHESTPLATE = coloredSub(new ModItem(LEATHER_CHESTPLATE, "Black Chestplate", 0x000000, "black_chestplate"), Color.fromRGB(0x000000), true);
    public static final ModItem BLACK_LEGGINGS = coloredSub(new ModItem(LEATHER_LEGGINGS, "Black Leggings", 0x000000, "black_leggings"), Color.fromRGB(0x000000), true);
    public static final ModItem BLACK_BOOTS = coloredSub(new ModItem(LEATHER_BOOTS, "Black Boots", 0x000000, "black_boots"), Color.fromRGB(0x000000), true);

    public static final ModItem RAINBOW_HELMET = rainbowArmor(new ModItem(LEATHER_HELMET, "Rainbow Helmet", "rainbow_helmet"), Color.fromRGB(0xFF0000), true);
    public static final ModItem RAINBOW_CHESTPLATE = rainbowArmor(new ModItem(LEATHER_CHESTPLATE, "Rainbow Chestplate", "rainbow_chestplate"), Color.fromRGB(0xFF0000), true);
    public static final ModItem RAINBOW_LEGGINGS = rainbowArmor(new ModItem(LEATHER_LEGGINGS, "Rainbow Leggings", "rainbow_leggings"), Color.fromRGB(0xFF0000), true);
    public static final ModItem RAINBOW_BOOTS = rainbowArmor(new ModItem(LEATHER_BOOTS, "Rainbow Boots", "rainbow_boots"), Color.fromRGB(0xFF0000), true);

    public static final ModItem NETHER_MAGIC_LUMP = new ModItem(GHAST_TEAR, Component.join(JoinConfiguration.noSeparators(), Component.text("Magic Lump").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, TextDecoration.State.FALSE),
            Component.text(" - ").color(NamedTextColor.DARK_GRAY).decoration(TextDecoration.ITALIC, TextDecoration.State.FALSE),
            Component.text("Nether").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, TextDecoration.State.FALSE)), "nether_magic_lump", 6, new ItemStack(NETHER_STAR));

    public static final ModItem TELEPORTER = new Teleporter(STRUCTURE_BLOCK, "Teleporter", NamedTextColor.LIGHT_PURPLE, "teleporter");

    //public static final ModItem ENCHANTMENT_REMOVER = new EnchantmentRemover();

    //public static final ModItem ENCHANTMENT_RUNE_COMBINER = new EnchantmentRuneCombiner();

    public static ModItem coloredSub(ModItem stack, Color color, boolean unbreakable) {
        LeatherArmorMeta meta = (LeatherArmorMeta) stack.getItemMeta();

        meta.setUnbreakable(unbreakable);

        meta.setColor(color);

        meta.lore(Collections.singletonList(Component.text("Do not destroy").color(TextColor.color(0x808080))));

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
