package xyz.heroesunited.heroesunited.client.render.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;
import xyz.heroesunited.heroesunited.common.objects.items.GeckoAccessory;

import javax.annotation.Nullable;

public class GeckoAccessoryRenderer extends GeoItemRenderer<GeckoAccessory> {

    public GeckoAccessoryRenderer() {
        super(new AnimatedGeoModel<GeckoAccessory>() {
            @Override
            public ResourceLocation getAnimationFileLocation(GeckoAccessory accessory) {
                return accessory.getAnimationFile();
            }

            @Override
            public ResourceLocation getModelLocation(GeckoAccessory accessory) {
                return accessory.getModelFile();
            }

            @Override
            public ResourceLocation getTextureLocation(GeckoAccessory accessory) {
                return accessory.getTextureFile();
            }
        });
    }

    @Override
    public RenderType getRenderType(GeckoAccessory animatable, float partialTicks, MatrixStack stack, @Nullable IRenderTypeBuffer renderTypeBuffer, @Nullable IVertexBuilder vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        return RenderType.entityCutoutNoCull(textureLocation);
    }
}
