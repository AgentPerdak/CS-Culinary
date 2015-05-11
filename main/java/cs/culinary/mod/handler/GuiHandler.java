package cs.culinary.mod.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import cs.culinary.mod.Culinary;
import cs.culinary.mod.container.ContainerEssenceExtractor;
import cs.culinary.mod.gui.GuiEssenceExtractor;
import cs.culinary.mod.tileentity.TileEntityEssenceExtractor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Win7Ultimate on 11.05.15.
 */
public class GuiHandler implements IGuiHandler{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x, y, z);

        if(entity != null) {
            switch(ID) {
                case Culinary.guiIDEssenceExtractor:
                    if (entity instanceof TileEntityEssenceExtractor) {
                        return new ContainerEssenceExtractor(player.inventory, (TileEntityEssenceExtractor) entity);
                    }
                    return null;

        }

       }return null;}

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x, y, z);

        switch(ID) {
            case Culinary.guiIDEssenceExtractor:
                if (entity instanceof TileEntityEssenceExtractor) {
                    return new GuiEssenceExtractor(player.inventory, (TileEntityEssenceExtractor) entity);
                }

    }return null;
}
}