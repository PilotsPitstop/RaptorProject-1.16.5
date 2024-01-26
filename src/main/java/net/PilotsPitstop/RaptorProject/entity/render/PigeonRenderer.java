package net.PilotsPitstop.RaptorProject.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.PilotsPitstop.RaptorProject.RaptorProject;
import net.PilotsPitstop.RaptorProject.entity.custom.PigeonEntity;
import net.PilotsPitstop.RaptorProject.entity.model.PigeonModel;

public class PigeonRenderer extends MobRenderer<PigeonEntity, PigeonModel<PigeonEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(RaptorProject.MOD_ID, "textures/entity/pigeon.png");

    public PigeonRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PigeonModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(PigeonEntity entity) {
        return TEXTURE;
    }
}