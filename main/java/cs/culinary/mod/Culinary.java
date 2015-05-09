package cs.culinary.mod;

//18.04.15.

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cs.culinary.mod.blocks.StrawberryCrop;
import cs.culinary.mod.items.CulinaryItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;

@Mod(modid = Culinary.modid, version = Culinary.version, name = "CS'Culinary")
public class Culinary {

    public static final String modid = "culinary";
    public static final String version = "1.0";

    public static CreativeTabs culinaryTab;

    public static Item linerCupcake;
    public static Item linerCupcakePack;

    public static Item toolBakingPan;
    public static Item toolMuffinPan;

    public static Item ingredientAllPurposeFlourBag;
    public static Item ingredientSugarBag;
    public static Item ingredientCocoaPowderBag;
    public static Item ingredientBakingSodaBag;
    public static Item ingredientSaltBag;
    public static Item ingredientPowderedSugarBag;

    public static Item butter;

    public static Item bottleMilk;
    public static Item bottleVegetableOil;
    public static Item bottleBoilingWater;
    public static Item bottleHeavyCream;

    public static Item extractPeppermint;
    public static Item extractPureVanilla;

    public static Item coloringGreen;

    //Recipes Shit

    public static Item recipeMintChocolateCupcakesFlourMixture;
    public static Item recipeMintChocolateCupcakesLiquidMixture;

    //public static Item cropStrawberrySeeds;
    //public static Item cropStrawberry;
    //public static Block cropStrawberryPlant;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent){

        culinaryTab = new CreativeTabs("Culinary") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return ingredientCocoaPowderBag;
            }
        };

        linerCupcake = new CulinaryItems().setUnlocalizedName("CupcakeLiner");
        GameRegistry.registerItem(linerCupcake, "CupcakeLiner");

        linerCupcakePack = new CulinaryItems().setUnlocalizedName("CupcakeLinerPack");
        GameRegistry.registerItem(linerCupcakePack, "CupcakeLinerPack");

        toolBakingPan = new CulinaryItems().setUnlocalizedName("BakingPan").setMaxStackSize(1).setCreativeTab(culinaryTab);
        GameRegistry.registerItem(toolBakingPan, "BakingPan");
        toolMuffinPan = new CulinaryItems().setUnlocalizedName("MuffinPan").setMaxStackSize(1).setCreativeTab(culinaryTab);
        GameRegistry.registerItem(toolMuffinPan, "MuffinPan");

        ingredientAllPurposeFlourBag = new CulinaryItems().setUnlocalizedName("AllPurposeFlourBag").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(ingredientAllPurposeFlourBag, "AllPurposeFlourBag");
        ingredientSugarBag = new CulinaryItems().setUnlocalizedName("SugarBag").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(ingredientSugarBag, "SugarBag");
        ingredientCocoaPowderBag = new CulinaryItems().setUnlocalizedName("CocoaPowderBag").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(ingredientCocoaPowderBag, "CocoaPowderBag");
        ingredientBakingSodaBag = new CulinaryItems().setUnlocalizedName("BakingSodaBag").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(ingredientBakingSodaBag, "BakingSodaBag");
        ingredientSaltBag = new CulinaryItems().setUnlocalizedName("SaltBag").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(ingredientSaltBag, "SaltBag");
        ingredientPowderedSugarBag = new CulinaryItems().setUnlocalizedName("PowderedSugarBag").setMaxDamage(30).setMaxStackSize(1);
        GameRegistry.registerItem(ingredientPowderedSugarBag, "PowderedSugarBag");

        butter = new CulinaryItems().setUnlocalizedName("Butter").setMaxDamage(20).setMaxStackSize(1);
        GameRegistry.registerItem(butter, "Butter");

        bottleMilk = new CulinaryItems().setUnlocalizedName("MilkBottle").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(bottleMilk, "MilkBottle");
        bottleVegetableOil = new CulinaryItems().setUnlocalizedName("VegetableOilBottle").setMaxDamage(20).setMaxStackSize(1);
        GameRegistry.registerItem(bottleVegetableOil, "VegetableOilBottle");
        bottleBoilingWater = new CulinaryItems().setUnlocalizedName("BoilingWaterBottle").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(bottleBoilingWater, "BoilingWaterBottle");
        bottleHeavyCream = new CulinaryItems().setUnlocalizedName("HeavyCreamBottle").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(bottleHeavyCream, "HeavyCreamBottle");
        
        extractPeppermint = new CulinaryItems().setUnlocalizedName("PeppermintExtract").setMaxDamage(30).setMaxStackSize(1);
        GameRegistry.registerItem(extractPeppermint, "PeppermintExtract");
        extractPureVanilla = new CulinaryItems().setUnlocalizedName("PureVanillaExtract").setMaxDamage(30).setMaxStackSize(1);
        GameRegistry.registerItem(extractPureVanilla, "PureVanillaExtract");

        coloringGreen = new CulinaryItems().setUnlocalizedName("GreenColoring").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(coloringGreen, "GreenColoring");

        //Recipes Shit
        recipeMintChocolateCupcakesFlourMixture = new CulinaryItems().setUnlocalizedName("MintChocolateCupcakesFlourMixture").setMaxStackSize(1);
        GameRegistry.registerItem(recipeMintChocolateCupcakesFlourMixture, "MintChocolateCupcakesFlourMixture");
        recipeMintChocolateCupcakesLiquidMixture = new CulinaryItems().setUnlocalizedName("MintChocolateCupcakesLiquidMixture").setMaxStackSize(1);
        GameRegistry.registerItem(recipeMintChocolateCupcakesLiquidMixture, "MintChocolateCupcakesLiquidMixture");

        /*cropStrawberryPlant = new StrawberryCrop().setBlockName("StrawberryPlant");
        cropStrawberrySeeds = new ItemSeeds(cropStrawberryPlant, Blocks.farmland).setUnlocalizedName("StrawberrySeeds").setTextureName(modid + ":StrawberrySeeds");
        cropStrawberry = new ItemFood(1, 0.1F, false).setUnlocalizedName("Strawberry").setTextureName(modid + ":Strawberry");
        GameRegistry.registerItem(cropStrawberrySeeds, "StrawberrySeeds");
        GameRegistry.registerItem(cropStrawberry, "Strawberry");
        GameRegistry.registerBlock(cropStrawberryPlant, "StrawberryPlant");*/

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){



    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){

    }
}
