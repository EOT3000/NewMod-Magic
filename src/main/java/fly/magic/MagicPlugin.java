package fly.magic;

import fly.magic.setup.MagicAddonSetup;
import fly.metals.MetalsPlugin;
import fly.newmod.NewMod;
import fly.newmod.setup.BlockStorage;
import fly.newmod.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.WorldCreator;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class MagicPlugin extends NewMod.ModExtension {
    @Override
    public void load() {
        MagicAddonSetup.init();
    }

    @Override
    public void tick(int count) {
        if(count % 3 == 0) {
            for(Player player : Bukkit.getOnlinePlayers()) {
                ItemStack helmet = player.getInventory().getHelmet();
                ItemStack chestplate = player.getInventory().getChestplate();
                ItemStack leggings = player.getInventory().getLeggings();
                ItemStack boots = player.getInventory().getBoots();

                updateArmor(player, helmet);
                updateArmor(player, chestplate);
                updateArmor(player, leggings);
                updateArmor(player, boots);
            }
        }
    }

    @Override
    public void onEnable() {
        //Bukkit.createWorld(new WorldCreator("earth2"));
    }

    private void updateArmor(Player player, ItemStack stack) {
        if(stack == null) {
            return;
        }

        ItemMeta meta = stack.getItemMeta();

        if(BlockStorage.isSimilar(MagicAddonSetup.RAINBOW_HELMET, stack)) {
            ((LeatherArmorMeta) meta).setColor(nextColor(((LeatherArmorMeta) meta).getColor()));
        }

        if(BlockStorage.isSimilar(MagicAddonSetup.RAINBOW_BOOTS, stack) || BlockStorage.isSimilar(MagicAddonSetup.RAINBOW_LEGGINGS, stack) || BlockStorage.isSimilar(MagicAddonSetup.RAINBOW_CHESTPLATE, stack)) {
            ItemStack h = player.getInventory().getHelmet();

            if(h != null && BlockStorage.isSimilar(MagicAddonSetup.RAINBOW_HELMET, h)) {
                ((LeatherArmorMeta) meta).setColor(((LeatherArmorMeta) h.getItemMeta()).getColor());
            }
        }

        stack.setItemMeta(meta);
    }

    private static Color nextColor(Color color) {
        float[] b = new float[3];

        java.awt.Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), b);

        float hp = b[0];

        int[] previous = new int[] {color.getRed(), color.getGreen(), color.getBlue()};

        for(int h = 0; h < 360; h++) {
            java.awt.Color hc = new java.awt.Color(java.awt.Color.HSBtoRGB((float) (((h+(hp*360))%360)/360.0), 1, 1));

            int[] lab = new int[3];

            ColorUtils.rgb2lab(hc.getRed(), hc.getBlue(), hc.getGreen(), lab);
            ColorUtils.rgb2lab(color.getRed(), color.getBlue(), color.getGreen(), previous);

            double d = ColorUtils.calculateDeltaE(previous[0], previous[1], previous[2], lab[0], lab[1], lab[2]);

            if(d > 3.7) {
                return Color.fromRGB(hc.getRed(), hc.getGreen(), hc.getBlue());
            }
        }

        return color;
    }

    @Override
    public List<NewMod.ModExtension> requirements() {
        List<NewMod.ModExtension> r = new ArrayList<>();

        r.add(JavaPlugin.getPlugin(MetalsPlugin.class));

        return r;
    }
}
