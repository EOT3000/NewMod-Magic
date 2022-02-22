package fly.magic.impl.portals;

import fly.newmod.NewMod;
import fly.newmod.bases.ModItem;
import fly.newmod.setup.BlockStorage;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Beacon;
import org.bukkit.block.Block;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class Teleporter extends ModItem {
    public Teleporter(Material material, String name, TextColor color, String id) {
        super(material, name, color, id);
    }

    @Override
    public void onInteract(PlayerInteractEvent event) {
        BlockStorage storage = NewMod.get().getBlockStorage();
        Location location = event.getClickedBlock().getLocation();

        int x = Integer.parseInt(storage.getData(location, "x"));
        int y = Integer.parseInt(storage.getData(location, "y"));
        int z = Integer.parseInt(storage.getData(location, "z"));
        World world = Bukkit.getWorld(storage.getData(location, "world"));

        Location newLocation = new Location(world, x, y, z);

        Block beaconA = location.getBlock().getRelative(1, -6, 0);
        Block beaconB = location.getBlock().getRelative(-1, -6, 0);
        Block beaconC = location.getBlock().getRelative(0, -6, 1);
        Block beaconD = location.getBlock().getRelative(0, -6, -1);

        if(beaconA.getType().equals(Material.BEACON) && beaconB.getType().equals(Material.BEACON) && beaconC.getType().equals(Material.BEACON) && beaconD.getType().equals(Material.BEACON)) {
            if(((Beacon) beaconA.getState()).getTier() == 0) {
                return;
            }

            if(((Beacon) beaconB.getState()).getTier() == 0) {
                return;
            }

            if(((Beacon) beaconC.getState()).getTier() == 0) {
                return;
            }

            if(((Beacon) beaconD.getState()).getTier() == 0) {
                return;
            }
        } else {
            return;
        }

        event.getPlayer().teleport(newLocation, PlayerTeleportEvent.TeleportCause.PLUGIN);
    }
}
