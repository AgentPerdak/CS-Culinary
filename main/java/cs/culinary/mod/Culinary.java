package cs.culinary.mod;

//18.04.15.

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cs.culinary.mod.blocks.PeppermintCrop;
import cs.culinary.mod.blocks.VanillaCrop;
import cs.culinary.mod.items.CulinaryItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Culinary.modid, version = Culinary.version, name = "CS'Culinary")
public class Culinary {

    public static final String modid = "culinary";
    public static final String version = "1.0";

    public static CreativeTabs culinaryTab;

    public static Item linerCupcake;
    public static Item linerCupcakePack;

    public static Item toolBakingPan;
    public static Item toolMuffinPan;
    public static Item toolGlassBowl;
    public static Item toolWhisk;
    public static Item toolPipingBag;

    public static Item bag;

    public static Item ingredientAllPurposeFlourBag;
    public static Item ingredientSugarBag;
    public static Item ingredientCocoaPowderBag;
    public static Item ingredientBakingSodaBag;
    public static Item ingredientSaltBag;
    public static Item ingredientPowderedSugarBag;
    public static Item ingredientBakingPowderBag;

    public static Item ingredientAllPurposeFlour;
    public static Item ingredientCocoaPowder;
    public static Item ingredientBakingSoda;
    public static Item ingredientSalt;
    public static Item ingredientPowderedSugar;
    public static Item ingredientBakingPowder;

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
    public static Item recipeMintChocolateCupcakesMixture;
    public static Item recipeMintChocolateCupcakesMuffinPan;
    public static Item recipeMintChocolateCupcakesCookedMuffinPan;
    public static Item recipeMintChocolateCupcakesNoFrost;
    public static Item recipeMintChocolateCupcakesFrosting;
    public static Item recipeMintChocolateCupcakesFroster;

    //Actually Food
    public static Item foodMintChocolateCupcake;

    //Actually Crops
    public static Item cropPeppermint;
    public static Item cropPeppermintSeeds;
    public static Block cropPeppermintPlant;

    public static Item  cropVanilla;
    public static Item  cropVanillaSeeds;
    public static Block cropVanillaPlant;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent){

        culinaryTab = new CreativeTabs("Culinary") {
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return extractPeppermint;
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
        toolGlassBowl = new CulinaryItems().setUnlocalizedName("GlassBowl").setMaxStackSize(1).setCreativeTab(culinaryTab);
        GameRegistry.registerItem(toolGlassBowl, "GlassBowl");
        toolWhisk = new CulinaryItems().setUnlocalizedName("Whisk").setMaxStackSize(1).setCreativeTab(culinaryTab);
        GameRegistry.registerItem(toolWhisk, "Whisk");
        toolPipingBag = new CulinaryItems().setUnlocalizedName("PipingBag").setMaxStackSize(1).setCreativeTab(culinaryTab);
        GameRegistry.registerItem(toolPipingBag, "PipingBag");

        bag = new CulinaryItems().setUnlocalizedName("Bag");
        GameRegistry.registerItem(bag, "Bag");

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
        ingredientBakingPowderBag = new CulinaryItems().setUnlocalizedName("BakingPowderBag").setTextureName("SaltBag").setMaxDamage(10).setMaxStackSize(1);
        GameRegistry.registerItem(ingredientBakingPowderBag, "BakingPowderBag");

        ingredientAllPurposeFlour = new CulinaryItems().setUnlocalizedName("AllPurposeFlour");
        GameRegistry.registerItem(ingredientAllPurposeFlour, "AllPurposeFlour");
        ingredientCocoaPowder = new CulinaryItems().setUnlocalizedName("CocoaPowder");
        GameRegistry.registerItem(ingredientCocoaPowder, "CocoaPowder");
        ingredientBakingSoda = new CulinaryItems().setUnlocalizedName("BakingSoda");
        GameRegistry.registerItem(ingredientBakingSoda, "BakingSoda");
        ingredientSalt = new CulinaryItems().setUnlocalizedName("Salt");
        GameRegistry.registerItem(ingredientSalt, "Salt");
        ingredientPowderedSugar = new CulinaryItems().setUnlocalizedName("PowderedSugar");
        GameRegistry.registerItem(ingredientPowderedSugar, "PowderedSugar");
        ingredientBakingPowder = new CulinaryItems().setUnlocalizedName("BakingPowder");
        GameRegistry.registerItem(ingredientBakingPowder, "BakingPowder");

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
        recipeMintChocolateCupcakesMixture = new CulinaryItems().setUnlocalizedName("MintChocolateCupcakesMixture").setMaxStackSize(1);
        GameRegistry.registerItem(recipeMintChocolateCupcakesMixture, "MintChocolateCupcakesMixture");
        recipeMintChocolateCupcakesMuffinPan = new CulinaryItems().setUnlocalizedName("MintChocolateCupcakesMuffinPan").setMaxStackSize(1);
        GameRegistry.registerItem(recipeMintChocolateCupcakesMuffinPan, "MintChocolateCupcakesMuffinPan");
        recipeMintChocolateCupcakesCookedMuffinPan = new CulinaryItems().setUnlocalizedName("MintChocolateCupcakesCookedMuffinPan").setMaxStackSize(1);
        GameRegistry.registerItem(recipeMintChocolateCupcakesCookedMuffinPan, "MintChocolateCupcakesCookedMuffinPan");
        recipeMintChocolateCupcakesNoFrost = new CulinaryItems().setUnlocalizedName("MintChocolateCupcakesNoFrost").setMaxStackSize(1);
        GameRegistry.registerItem(recipeMintChocolateCupcakesNoFrost, "MintChocolateCupcakesNoFrost");
        recipeMintChocolateCupcakesFrosting = new CulinaryItems().setUnlocalizedName("MintChocolateCupcakesFrosting").setMaxStackSize(1);
        GameRegistry.registerItem(recipeMintChocolateCupcakesFrosting, "MintChocolateCupcakesFrosting");
        recipeMintChocolateCupcakesFroster = new CulinaryItems().setUnlocalizedName("MintChocolateCupcakesFroster").setMaxStackSize(1).setMaxDamage(16);
        GameRegistry.registerItem(recipeMintChocolateCupcakesFroster, "MintChocolateCupcakesFroster");

        //Actually Food
        foodMintChocolateCupcake = new ItemFood(4, 1F, false).setUnlocalizedName("MintChocolateCupcake").setTextureName(modid + ":MintChocolateCupcake").setCreativeTab(culinaryTab);
        GameRegistry.registerItem(foodMintChocolateCupcake, "MintChocolateCupcake");

        //Actually Crops

        cropPeppermintPlant = new PeppermintCrop().setBlockName("PeppermintPlant");
        cropPeppermintSeeds = new ItemSeeds(cropPeppermintPlant, Blocks.farmland).setUnlocalizedName("PeppermintSeeds").setTextureName(modid + ":PeppermintSeeds").setCreativeTab(culinaryTab);
        cropPeppermint = new CulinaryItems().setUnlocalizedName("Peppermint").setTextureName(modid + ":Peppermint");
        GameRegistry.registerItem( cropPeppermintSeeds, "PeppermintSeeds");
        GameRegistry.registerItem( cropPeppermint,      "Peppermint");
        GameRegistry.registerBlock(cropPeppermintPlant, "PeppermintPlant");
        MinecraftForge.addGrassSeed(new ItemStack(cropPeppermintSeeds), 10);

        cropVanillaPlant = new VanillaCrop().setBlockName("VanillaPlant");
        cropVanillaSeeds = new ItemSeeds(cropVanillaPlant, Blocks.farmland).setUnlocalizedName("VanillaSeeds").setTextureName(modid + ":VanillaSeeds").setCreativeTab(culinaryTab);;
        cropVanilla = new CulinaryItems().setUnlocalizedName("Vanilla").setTextureName(modid + ":Vanilla");
        GameRegistry.registerItem( cropVanillaSeeds, "VanillaSeeds");
        GameRegistry.registerItem( cropVanilla,      "Vanilla");
        GameRegistry.registerBlock(cropVanillaPlant, "VanillaPlant");
        MinecraftForge.addGrassSeed(new ItemStack(cropVanillaSeeds), 10);

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    GameRegistry.addRecipe(new ItemStack(linerCupcake), new Object[]{"PRP", "P", 'P', Items.paper, 'R', new ItemStack(Items.dye, 1, 1)});
    GameRegistry.addRecipe(new ItemStack(linerCupcakePack), new Object[]{"LLL", "LLL", "LLL", 'L', linerCupcake});

    GameRegistry.addRecipe(new ItemStack(toolGlassBowl), new Object[]{"G G", " G ", 'G', Blocks.glass});
    GameRegistry.addRecipe(new ItemStack(toolWhisk), new Object[]{"  I", "II ", "II ", 'I', Items.iron_ingot});
    GameRegistry.addRecipe(new ItemStack(toolPipingBag), new Object[]{" WW", " IW", "I ", 'I', Items.iron_ingot, 'W', Blocks.wool});
    GameRegistry.addRecipe(new ItemStack(toolBakingPan), new Object[]{"III", 'I', Items.iron_ingot});
    GameRegistry.addRecipe(new ItemStack(toolMuffinPan), new Object[]{"I I", "III", 'I', Items.iron_ingot});

    GameRegistry.addRecipe(new ItemStack(bag), new Object[]{"S S", "S S", "WWW", 'S', Items.string, 'W', Blocks.wool});

    GameRegistry.addRecipe(new ItemStack(ingredientAllPurposeFlourBag), new Object[]{"FFF", "FBF", "FFF", 'F', ingredientAllPurposeFlour, 'B', bag});
    GameRegistry.addRecipe(new ItemStack(ingredientSugarBag), new Object[]{"FFF", "FBF", "FFF", 'F', Items.sugar, 'B', bag});
    GameRegistry.addRecipe(new ItemStack(ingredientCocoaPowderBag), new Object[]{"FFF", "FBF", "FFF", 'F', ingredientCocoaPowder, 'B', bag});
    GameRegistry.addRecipe(new ItemStack(ingredientSaltBag), new Object[]{"FFF", "FBF", "FFF", 'F', ingredientSalt, 'B', bag});
    GameRegistry.addRecipe(new ItemStack(ingredientBakingSodaBag), new Object[]{"FFF", "FBF", "FFF", 'F', ingredientBakingSoda, 'B', bag});
    GameRegistry.addRecipe(new ItemStack(ingredientBakingPowderBag), new Object[]{"FFF", "FBF", "FFF", 'F', ingredientBakingPowder, 'B', bag});
    GameRegistry.addRecipe(new ItemStack(ingredientPowderedSugarBag), new Object[]{"FFF", "FBF", "FFF", 'F', ingredientPowderedSugar, 'B', bag});

    GameRegistry.addSmelting(bottleBoilingWater, new ItemStack(Items.potionitem, 0), 1F);
    GameRegistry.addShapelessRecipe(new ItemStack(bottleMilk, 3), new ItemStack(Items.glass_bottle), new ItemStack(Items.glass_bottle), new ItemStack(Items.glass_bottle), new ItemStack(Items.milk_bucket));

    GameRegistry.addShapelessRecipe(new ItemStack(recipeMintChocolateCupcakesFlourMixture), new Object[]{new ItemStack(toolGlassBowl), new ItemStack(ingredientSugarBag), new ItemStack(ingredientAllPurposeFlourBag), new ItemStack(ingredientCocoaPowderBag), new ItemStack(ingredientSaltBag), new ItemStack(ingredientBakingSodaBag), new ItemStack(ingredientBakingPowderBag)});
    GameRegistry.addShapelessRecipe(new ItemStack(recipeMintChocolateCupcakesLiquidMixture), new Object[]{new ItemStack(toolGlassBowl), new ItemStack(Items.egg), new ItemStack(bottleMilk), new ItemStack(bottleVegetableOil), new ItemStack(extractPeppermint), new ItemStack(extractPureVanilla)});
    GameRegistry.addShapelessRecipe(new ItemStack(recipeMintChocolateCupcakesMixture), new Object[]{new ItemStack(recipeMintChocolateCupcakesFlourMixture), new ItemStack(recipeMintChocolateCupcakesLiquidMixture), new ItemStack(bottleBoilingWater), new ItemStack(toolWhisk)});
    GameRegistry.addShapelessRecipe(new ItemStack(recipeMintChocolateCupcakesMuffinPan), new Object[]{new ItemStack(recipeMintChocolateCupcakesMixture), new ItemStack(toolMuffinPan), new ItemStack(linerCupcakePack)});
    GameRegistry.addSmelting(recipeMintChocolateCupcakesMuffinPan, new ItemStack(recipeMintChocolateCupcakesCookedMuffinPan), 10F);
    GameRegistry.addShapelessRecipe(new ItemStack(recipeMintChocolateCupcakesNoFrost, 9), new Object[]{new ItemStack(recipeMintChocolateCupcakesCookedMuffinPan)});
    GameRegistry.addShapelessRecipe(new ItemStack(recipeMintChocolateCupcakesFrosting), new Object[]{new ItemStack(ingredientPowderedSugarBag), new ItemStack(butter), new ItemStack(toolWhisk), new ItemStack(bottleHeavyCream), new ItemStack(extractPureVanilla), new ItemStack(extractPeppermint), new ItemStack(coloringGreen), new ItemStack(toolGlassBowl), new ItemStack(ingredientSaltBag)});
    GameRegistry.addShapelessRecipe(new ItemStack(recipeMintChocolateCupcakesFroster), new Object[]{new ItemStack(toolPipingBag), new ItemStack(recipeMintChocolateCupcakesFrosting)});
    GameRegistry.addShapelessRecipe(new ItemStack(foodMintChocolateCupcake), new Object[]{new ItemStack(recipeMintChocolateCupcakesFroster), new ItemStack(recipeMintChocolateCupcakesNoFrost)});
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){

    }
}
