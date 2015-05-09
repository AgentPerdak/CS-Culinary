package cs.culinary.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cs.culinary.mod.Culinary;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by Win7Ultimate on 18.04.15.
 */
public class CulinaryItems extends Item {

    public CulinaryItems() {

        this.setCreativeTab(Culinary.culinaryTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Culinary.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
