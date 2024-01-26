package net.PilotsPitstop.RaptorProject.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.PilotsPitstop.RaptorProject.RaptorProject;
import net.PilotsPitstop.RaptorProject.entity.custom.vraptorEntity;
import net.PilotsPitstop.RaptorProject.entity.model.vraptorModel;

public class VRaptorRenderer extends MobRenderer<vraptorEntity, vraptorModel<vraptorEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(RaptorProject.MOD_ID, "textures/entity/vraptor.png");

    public VRaptorRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new vraptorModel<>(), 1.0F);
    }

    @Override
    public ResourceLocation getEntityTexture(vraptorEntity entity) {
        return TEXTURE;
    }
}