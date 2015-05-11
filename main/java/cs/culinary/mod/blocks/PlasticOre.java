package cs.culinary.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cs.culinary.mod.Culinary;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Win7Ultimate on 11.05.15.
 */
public class PlasticOre extends Block {

    public PlasticOre(Material material) {
        super(material);

        this.setHardness(3.0F);
        this.setResistance(200.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(Culinary.culinaryTab);

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Culinary.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
