package xyz.heroesunited.heroesunited.client.render.renderer.planet;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.util.ResourceLocation;
import xyz.heroesunited.heroesunited.HeroesUnited;
import xyz.heroesunited.heroesunited.client.render.model.EarthModel;

public class EarthRenderer extends PlanetRenderer{
    public EarthRenderer() {
        super(new EarthModel());
    }

    @Override
    public ResourceLocation getTextureLocation() {
        return new ResourceLocation(HeroesUnited.MODID,"textures/planets/earth.png");
    }

    @Override
    protected RenderType getRenderType() {
        return RenderType.entityCutout(getTextureLocation());
    }
}
