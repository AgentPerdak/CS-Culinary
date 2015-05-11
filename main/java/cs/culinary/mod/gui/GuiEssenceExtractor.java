package cs.culinary.mod.gui;

import cs.culinary.mod.Culinary;
import cs.culinary.mod.container.ContainerEssenceExtractor;
import cs.culinary.mod.tileentity.TileEntityEssenceExtractor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Win7Ultimate on 11.05.15.
 */
public class GuiEssenceExtractor extends GuiContainer{

    public static final ResourceLocation bground = new ResourceLocation(Culinary.modid + ":" + "textures/gui/GuiEssenceExtractor.png");

    public TileEntityEssenceExtractor essenceExtractor;

    public GuiEssenceExtractor(InventoryPlayer inventoryPlayer, TileEntityEssenceExtractor entity) {
        super(new ContainerEssenceExtractor(inventoryPlayer, entity));

        this.essenceExtractor = entity;

        this.xSize = 176;
        this.ySize = 166;
    }


    public void drawGuiContainerForegroundLayer(int par1, int par2) {

        String name = this.essenceExtractor.hasCustomInventoryName() ? this.essenceExtractor.getInventoryName() : I18n.format(this.essenceExtractor.getInventoryName(), new Object[0]);
        this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 702398472);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 702398472);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GL11.glColor4f(1F, 1F, 1F, 1F);

        Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        if(this.essenceExtractor.isBurning()) {
            int k = this.essenceExtractor.getBurnTimeRemainingScaled(40);
            int j = 40 - k;
            drawTexturedModalRect(guiLeft + 29, guiTop + 65, 176, 0, 40 - j, 10);
        }

        int k = this.essenceExtractor.getCookProgressScaled(24);
        drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 10, k + 1, 16);
    }
}
