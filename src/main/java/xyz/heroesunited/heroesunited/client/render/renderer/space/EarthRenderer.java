package xyz.heroesunited.heroesunited.client.render.renderer.space;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import xyz.heroesunited.heroesunited.HeroesUnited;
import xyz.heroesunited.heroesunited.client.render.model.space.EarthModel;
import xyz.heroesunited.heroesunited.client.render.model.space.SunModel;

public class EarthRenderer extends PlanetRenderer {
    public EarthRenderer() {
        super(new EarthModel());
    }

    @Override
    public ResourceLocation getTextureLocation() {
        return new ResourceLocation(HeroesUnited.MODID,"textures/planets/earth.png");
    }

    @Override
    public void render(MatrixStack matrixStack, IRenderTypeBuffer buffers, int packedLight, float partialTicks) {

        matrixStack.scale(0.95F, 0.95F, 0.95F);
        matrixStack.translate(0,-1,0);
        IVertexBuilder buffer = EarthModel.EARTH_TEXTURE_MATERIAL.buffer(buffers, RenderType::entityTranslucent);
        planetModel.prepareModel(partialTicks);
        planetModel.renderToBuffer(matrixStack, buffer, packedLight, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
    }

    @Override
    protected RenderType getRenderType() {
        return RenderType.entityTranslucent(getTextureLocation());
    }
}
