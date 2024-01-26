package net.PilotsPitstop.RaptorProject.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.PilotsPitstop.RaptorProject.entity.custom.vraptorEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.ZombieEntity;

public class vraptorModel<V extends ZombieEntity> extends EntityModel<vraptorEntity> {
    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

    }

    @Override
    public void setRotationAngles(vraptorEntity vraptorEntity, float v, float v1, float v2, float v3, float v4) {

    }

    // Made with Blockbench 4.6.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


    public class VRaptorModel extends EntityModel<Entity> {
        private final ModelRenderer leftLeg;
        private final ModelRenderer leftfoot;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer cube_r4;
        private final ModelRenderer cube_r5;
        private final ModelRenderer cube_r6;
        private final ModelRenderer RightLeg;
        private final ModelRenderer rightfoot;
        private final ModelRenderer cube_r7;
        private final ModelRenderer cube_r8;
        private final ModelRenderer cube_r9;
        private final ModelRenderer cube_r10;
        private final ModelRenderer cube_r11;
        private final ModelRenderer cube_r12;
        private final ModelRenderer BODY;
        private final ModelRenderer tail;
        private final ModelRenderer cube_r13;
        private final ModelRenderer cube_r14;
        private final ModelRenderer cube_r15;
        private final ModelRenderer LEFTARM;
        private final ModelRenderer cube_r16;
        private final ModelRenderer cube_r17;
        private final ModelRenderer cube_r18;
        private final ModelRenderer cube_r19;
        private final ModelRenderer cube_r20;
        private final ModelRenderer NECK;
        private final ModelRenderer cube_r21;
        private final ModelRenderer HEAD;
        private final ModelRenderer firstjaw3top_r1;
        private final ModelRenderer topjaw;
        private final ModelRenderer firstjawtop_r1;
        private final ModelRenderer bottomjaw;
        private final ModelRenderer cube_r22;
        private final ModelRenderer firstjawbottom_r1;
        private final ModelRenderer RIGHTARM;
        private final ModelRenderer cube_r23;
        private final ModelRenderer cube_r24;
        private final ModelRenderer cube_r25;
        private final ModelRenderer cube_r26;
        private final ModelRenderer cube_r27;
        private final ModelRenderer cube_r28;
        private final ModelRenderer cube_r29;
        private final ModelRenderer cube_r30;
        private final ModelRenderer bb_main;
        private final ModelRenderer cube_r31;

        public VRaptorModel(ModelRenderer topjaw) {
            this.topjaw = topjaw;
            textureWidth = 512;
            textureHeight = 512;

            leftLeg = new ModelRenderer(this);
            leftLeg.setRotationPoint(-1.0F, 24.0F, 0.0F);
            leftLeg.setTextureOffset(131, 74).addBox(7.0F, -4.0F, 4.0F, 9.0F, 2.0F, 5.0F, 0.0F, false);
            leftLeg.setTextureOffset(131, 35).addBox(7.0F, -6.0F, 4.0F, 9.0F, 2.0F, 5.0F, 0.0F, false);
            leftLeg.setTextureOffset(34, 88).addBox(8.0F, -8.0F, 4.0F, 7.0F, 2.0F, 5.0F, 0.0F, false);
            leftLeg.setTextureOffset(127, 177).addBox(8.0F, -8.0F, 9.0F, 7.0F, 2.0F, 3.0F, 0.0F, false);
            leftLeg.setTextureOffset(67, 285).addBox(8.0F, -10.0F, 3.0F, 7.0F, 2.0F, 9.0F, 0.0F, false);
            leftLeg.setTextureOffset(283, 273).addBox(8.0F, -12.0F, 1.0F, 7.0F, 2.0F, 9.0F, 0.0F, false);
            leftLeg.setTextureOffset(201, 222).addBox(8.0F, -14.0F, 0.0F, 7.0F, 2.0F, 9.0F, 0.0F, false);
            leftLeg.setTextureOffset(274, 231).addBox(7.0F, -16.0F, -3.0F, 9.0F, 2.0F, 11.0F, 0.0F, false);
            leftLeg.setTextureOffset(0, 172).addBox(7.0F, -18.0F, -4.0F, 9.0F, 2.0F, 14.0F, 0.0F, false);
            leftLeg.setTextureOffset(0, 154).addBox(7.0F, -20.0F, -4.0F, 9.0F, 2.0F, 16.0F, 0.0F, false);
            leftLeg.setTextureOffset(194, 103).addBox(8.0F, -22.0F, -3.0F, 7.0F, 2.0F, 16.0F, 0.0F, false);
            leftLeg.setTextureOffset(194, 85).addBox(8.0F, -24.0F, -1.0F, 7.0F, 2.0F, 16.0F, 0.0F, false);
            leftLeg.setTextureOffset(91, 193).addBox(8.0F, -26.0F, 2.0F, 7.0F, 2.0F, 16.0F, 0.0F, false);
            leftLeg.setTextureOffset(190, 170).addBox(8.0F, -28.0F, 5.0F, 7.0F, 2.0F, 16.0F, 0.0F, false);
            leftLeg.setTextureOffset(95, 130).addBox(7.0F, -22.0F, -3.0F, 9.0F, 2.0F, 16.0F, 0.0F, false);
            leftLeg.setTextureOffset(119, 287).addBox(8.0F, -40.0F, 5.0F, 9.0F, 12.0F, 16.0F, 0.0F, false);

            leftfoot = new ModelRenderer(this);
            leftfoot.setRotationPoint(0.0F, 0.0F, 0.0F);
            leftLeg.addChild(leftfoot);
            leftfoot.setTextureOffset(34, 160).addBox(9.0F, -2.0F, 0.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
            leftfoot.setTextureOffset(129, 148).addBox(8.0F, -2.0F, 4.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r1 = new ModelRenderer(this);
            cube_r1.setRotationPoint(19.0F, -2.0F, -3.0F);
            leftfoot.addChild(cube_r1);
            setRotationAngle(cube_r1, -0.0472F, -0.3923F, 0.0181F);
            cube_r1.setTextureOffset(55, 68).addBox(-6.0F, 0.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r1.setTextureOffset(55, 74).addBox(-6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this);
            cube_r2.setRotationPoint(19.0F, -2.0F, -1.0F);
            leftfoot.addChild(cube_r2);
            setRotationAngle(cube_r2, -0.0436F, -0.3491F, 0.0F);
            cube_r2.setTextureOffset(6, 70).addBox(-5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r3 = new ModelRenderer(this);
            cube_r3.setRotationPoint(19.0F, -2.0F, -1.0F);
            leftfoot.addChild(cube_r3);
            setRotationAngle(cube_r3, -0.1745F, -0.3491F, 0.0F);
            cube_r3.setTextureOffset(53, 71).addBox(-5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r4 = new ModelRenderer(this);
            cube_r4.setRotationPoint(19.0F, 0.0F, 2.0F);
            leftfoot.addChild(cube_r4);
            setRotationAngle(cube_r4, -0.2618F, -0.1745F, 0.0F);
            cube_r4.setTextureOffset(40, 0).addBox(-10.0F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r5 = new ModelRenderer(this);
            cube_r5.setRotationPoint(19.0F, -2.0F, -1.0F);
            leftfoot.addChild(cube_r5);
            setRotationAngle(cube_r5, -0.2618F, -0.1745F, 0.0F);
            cube_r5.setTextureOffset(6, 75).addBox(-10.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r6 = new ModelRenderer(this);
            cube_r6.setRotationPoint(19.0F, -2.0F, -3.0F);
            leftfoot.addChild(cube_r6);
            setRotationAngle(cube_r6, 0.3927F, -0.1745F, 0.0F);
            cube_r6.setTextureOffset(0, 75).addBox(-10.0F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            RightLeg = new ModelRenderer(this);
            RightLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
            RightLeg.setTextureOffset(131, 67).addBox(-16.0F, -4.0F, 4.0F, 9.0F, 2.0F, 5.0F, 0.0F, false);
            RightLeg.setTextureOffset(131, 28).addBox(-16.0F, -6.0F, 4.0F, 9.0F, 2.0F, 5.0F, 0.0F, false);
            RightLeg.setTextureOffset(129, 130).addBox(-15.0F, -8.0F, 4.0F, 7.0F, 2.0F, 5.0F, 0.0F, false);
            RightLeg.setTextureOffset(38, 120).addBox(-15.0F, -8.0F, 9.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
            RightLeg.setTextureOffset(278, 18).addBox(-15.0F, -10.0F, 3.0F, 7.0F, 2.0F, 10.0F, 0.0F, false);
            RightLeg.setTextureOffset(281, 175).addBox(-15.0F, -12.0F, 1.0F, 7.0F, 2.0F, 9.0F, 0.0F, false);
            RightLeg.setTextureOffset(0, 276).addBox(-15.0F, -14.0F, 0.0F, 7.0F, 2.0F, 9.0F, 0.0F, false);
            RightLeg.setTextureOffset(161, 256).addBox(-16.0F, -16.0F, -3.0F, 9.0F, 2.0F, 11.0F, 0.0F, false);
            RightLeg.setTextureOffset(198, 38).addBox(-16.0F, -18.0F, -4.0F, 9.0F, 2.0F, 14.0F, 0.0F, false);
            RightLeg.setTextureOffset(95, 148).addBox(-16.0F, -20.0F, -4.0F, 9.0F, 2.0F, 16.0F, 0.0F, false);
            RightLeg.setTextureOffset(95, 166).addBox(-16.0F, -22.0F, -3.0F, 8.0F, 2.0F, 16.0F, 0.0F, false);
            RightLeg.setTextureOffset(194, 67).addBox(-15.0F, -24.0F, -1.0F, 7.0F, 2.0F, 16.0F, 0.0F, false);
            RightLeg.setTextureOffset(0, 191).addBox(-15.0F, -26.0F, 2.0F, 7.0F, 2.0F, 16.0F, 0.0F, false);
            RightLeg.setTextureOffset(190, 152).addBox(-15.0F, -28.0F, 5.0F, 7.0F, 2.0F, 16.0F, 0.0F, false);
            RightLeg.setTextureOffset(99, 0).addBox(-17.0F, -40.0F, 5.0F, 9.0F, 12.0F, 16.0F, 0.0F, false);

            rightfoot = new ModelRenderer(this);
            rightfoot.setRotationPoint(0.0F, 0.0F, 0.0F);
            RightLeg.addChild(rightfoot);
            rightfoot.setTextureOffset(129, 154).addBox(-15.0F, -2.0F, 0.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
            rightfoot.setTextureOffset(129, 137).addBox(-16.0F, -2.0F, 4.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r7 = new ModelRenderer(this);
            cube_r7.setRotationPoint(-7.0F, -2.0F, -3.0F);
            rightfoot.addChild(cube_r7);
            setRotationAngle(cube_r7, -0.0167F, 0.3415F, -0.0358F);
            cube_r7.setTextureOffset(12, 14).addBox(-8.0F, 0.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r7.setTextureOffset(53, 65).addBox(-8.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r8 = new ModelRenderer(this);
            cube_r8.setRotationPoint(-8.0F, -2.0F, -4.0F);
            rightfoot.addChild(cube_r8);
            setRotationAngle(cube_r8, -0.0202F, 0.2542F, -0.0329F);
            cube_r8.setTextureOffset(54, 58).addBox(-5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r9 = new ModelRenderer(this);
            cube_r9.setRotationPoint(-8.0F, -2.0F, -4.0F);
            rightfoot.addChild(cube_r9);
            setRotationAngle(cube_r9, -0.1511F, 0.2542F, -0.0329F);
            cube_r9.setTextureOffset(6, 65).addBox(-5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r10 = new ModelRenderer(this);
            cube_r10.setRotationPoint(0.0F, -2.0F, -5.0F);
            rightfoot.addChild(cube_r10);
            setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
            cube_r10.setTextureOffset(47, 75).addBox(-10.0F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r11 = new ModelRenderer(this);
            cube_r11.setRotationPoint(0.0F, -2.0F, -3.0F);
            rightfoot.addChild(cube_r11);
            setRotationAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
            cube_r11.setTextureOffset(53, 88).addBox(-10.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r12 = new ModelRenderer(this);
            cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
            rightfoot.addChild(cube_r12);
            setRotationAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
            cube_r12.setTextureOffset(52, 0).addBox(-10.0F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

            BODY = new ModelRenderer(this);
            BODY.setRotationPoint(0.0F, 24.0F, 0.0F);
            BODY.setTextureOffset(0, 191).addBox(-8.0F, -28.0F, -25.0F, 15.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(95, 130).addBox(-9.0F, -30.0F, -25.0F, 17.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(99, 4).addBox(-10.0F, -32.0F, -25.0F, 19.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(0, 65).addBox(-10.0F, -34.0F, -25.0F, 19.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(205, 252).addBox(-12.0F, -34.0F, -13.0F, 22.0F, 2.0F, 34.0F, 0.0F, false);
            BODY.setTextureOffset(243, 195).addBox(-12.0F, -36.0F, -13.0F, 22.0F, 2.0F, 34.0F, 0.0F, false);
            BODY.setTextureOffset(198, 0).addBox(-12.0F, -38.0F, -14.0F, 22.0F, 2.0F, 36.0F, 0.0F, false);
            BODY.setTextureOffset(0, 0).addBox(-10.0F, -38.0F, -25.0F, 19.0F, 4.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(0, 128).addBox(-9.0F, -40.0F, -25.0F, 17.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(99, 67).addBox(-9.0F, -42.0F, -25.0F, 17.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(190, 132).addBox(-8.0F, -44.0F, -25.0F, 15.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(91, 193).addBox(-7.0F, -46.0F, -25.0F, 13.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(194, 69).addBox(-6.0F, -47.0F, -25.0F, 11.0F, 2.0F, 61.0F, 0.0F, false);
            BODY.setTextureOffset(178, 195).addBox(-2.0F, -49.0F, -23.0F, 5.0F, 2.0F, 55.0F, 0.0F, false);
            BODY.setTextureOffset(0, 29).addBox(-2.0F, -50.0F, 3.0F, 5.0F, 2.0F, 24.0F, 0.0F, false);
            BODY.setTextureOffset(190, 132).addBox(-2.0F, -51.0F, 6.0F, 5.0F, 3.0F, 17.0F, 0.0F, false);

            tail = new ModelRenderer(this);
            tail.setRotationPoint(0.0F, 0.0F, 0.0F);
            BODY.addChild(tail);
            tail.setTextureOffset(127, 172).addBox(-7.0F, -30.0F, 36.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
            tail.setTextureOffset(99, 94).addBox(-9.0F, -45.0F, 35.0F, 17.0F, 15.0F, 8.0F, 0.0F, false);

            cube_r13 = new ModelRenderer(this);
            cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
            tail.addChild(cube_r13);
            setRotationAngle(cube_r13, -0.6548F, -0.0403F, 0.0167F);
            cube_r13.setTextureOffset(99, 28).addBox(-1.0F, -77.0F, 73.0F, 7.0F, 9.0F, 18.0F, 0.0F, false);

            cube_r14 = new ModelRenderer(this);
            cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
            tail.addChild(cube_r14);
            setRotationAngle(cube_r14, -0.393F, -0.0403F, 0.0167F);
            cube_r14.setTextureOffset(99, 67).addBox(-1.0F, -56.0F, 74.0F, 7.0F, 9.0F, 18.0F, 0.0F, false);
            cube_r14.setTextureOffset(0, 0).addBox(-3.0F, -57.0F, 56.0F, 11.0F, 11.0F, 18.0F, 0.0F, false);

            cube_r15 = new ModelRenderer(this);
            cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
            tail.addChild(cube_r15);
            setRotationAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
            cube_r15.setTextureOffset(278, 0).addBox(-7.0F, -53.0F, 40.0F, 11.0F, 1.0F, 8.0F, 0.0F, false);
            cube_r15.setTextureOffset(198, 54).addBox(-8.0F, -52.0F, 40.0F, 15.0F, 3.0F, 8.0F, 0.0F, false);
            cube_r15.setTextureOffset(91, 117).addBox(-9.0F, -50.0F, 40.0F, 17.0F, 0.0F, 8.0F, 0.0F, false);
            cube_r15.setTextureOffset(278, 9).addBox(-7.0F, -54.0F, 32.0F, 11.0F, 1.0F, 8.0F, 0.0F, false);
            cube_r15.setTextureOffset(230, 38).addBox(-8.0F, -53.0F, 32.0F, 15.0F, 2.0F, 8.0F, 0.0F, false);
            cube_r15.setTextureOffset(0, 111).addBox(-9.0F, -51.0F, 32.0F, 17.0F, 1.0F, 8.0F, 0.0F, false);
            cube_r15.setTextureOffset(161, 270).addBox(-7.0F, -50.0F, 46.0F, 13.0F, 11.0F, 18.0F, 0.0F, false);
            cube_r15.setTextureOffset(43, 256).addBox(-9.0F, -50.0F, 28.0F, 17.0F, 11.0F, 18.0F, 0.0F, false);
            cube_r15.setTextureOffset(99, 55).addBox(-8.0F, -51.0F, 28.0F, 17.0F, 1.0F, 4.0F, 0.0F, false);
            cube_r15.setTextureOffset(0, 120).addBox(-7.0F, -53.0F, 28.0F, 15.0F, 2.0F, 4.0F, 0.0F, false);
            cube_r15.setTextureOffset(129, 121).addBox(-6.0F, -54.0F, 28.0F, 11.0F, 1.0F, 4.0F, 0.0F, false);
            cube_r15.setTextureOffset(236, 54).addBox(-10.0F, -39.0F, 28.0F, 19.0F, 4.0F, 4.0F, 0.0F, false);
            cube_r15.setTextureOffset(194, 121).addBox(-7.0F, -37.0F, 28.0F, 13.0F, 4.0F, 3.0F, 0.0F, false);
            cube_r15.setTextureOffset(0, 55).addBox(-10.0F, -39.0F, 27.0F, 19.0F, 4.0F, 2.0F, 0.0F, false);
            cube_r15.setTextureOffset(34, 95).addBox(-6.0F, -54.0F, 27.0F, 11.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r15.setTextureOffset(171, 0).addBox(-7.0F, -53.0F, 27.0F, 15.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r15.setTextureOffset(133, 0).addBox(-8.0F, -51.0F, 27.0F, 17.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r15.setTextureOffset(91, 237).addBox(-10.0F, -50.0F, 27.0F, 19.0F, 11.0F, 2.0F, 0.0F, false);

            LEFTARM = new ModelRenderer(this);
            LEFTARM.setRotationPoint(0.0F, 24.0F, 0.0F);
            LEFTARM.setTextureOffset(27, 221).addBox(7.0F, -40.0F, -25.0F, 6.0F, 12.0F, 11.0F, 0.0F, false);

            cube_r16 = new ModelRenderer(this);
            cube_r16.setRotationPoint(20.0F, -29.0F, 11.0F);
            LEFTARM.addChild(cube_r16);
            setRotationAngle(cube_r16, 2.8971F, -0.2169F, -0.1481F);
            cube_r16.setTextureOffset(6, 89).addBox(-22.0F, -25.0F, 36.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r17 = new ModelRenderer(this);
            cube_r17.setRotationPoint(20.0F, -29.0F, 11.0F);
            LEFTARM.addChild(cube_r17);
            setRotationAngle(cube_r17, 1.3699F, -0.2169F, -0.1481F);
            cube_r17.setTextureOffset(0, 93).addBox(-22.0F, -41.0F, -23.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r18 = new ModelRenderer(this);
            cube_r18.setRotationPoint(18.0F, -29.0F, 11.0F);
            LEFTARM.addChild(cube_r18);
            setRotationAngle(cube_r18, 2.9175F, -0.3189F, -0.2333F);
            cube_r18.setTextureOffset(6, 94).addBox(-22.0F, -25.0F, 36.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r19 = new ModelRenderer(this);
            cube_r19.setRotationPoint(18.0F, -29.0F, 11.0F);
            LEFTARM.addChild(cube_r19);
            setRotationAngle(cube_r19, 1.3903F, -0.3189F, -0.2333F);
            cube_r19.setTextureOffset(50, 98).addBox(-22.0F, -41.0F, -23.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r20 = new ModelRenderer(this);
            cube_r20.setRotationPoint(0.0F, -27.0F, 14.0F);
            LEFTARM.addChild(cube_r20);
            setRotationAngle(cube_r20, 0.6545F, 0.0F, 0.0F);
            cube_r20.setTextureOffset(95, 256).addBox(9.0F, -29.0F, -43.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);
            cube_r20.setTextureOffset(277, 92).addBox(9.0F, -31.0F, -33.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

            NECK = new ModelRenderer(this);
            NECK.setRotationPoint(0.0F, 24.0F, 0.0F);
            NECK.setTextureOffset(0, 29).addBox(-5.0F, -50.0F, -27.0F, 10.0F, 22.0F, 2.0F, 0.0F, false);
            NECK.setTextureOffset(34, 29).addBox(-5.0F, -50.0F, -29.0F, 10.0F, 21.0F, 2.0F, 0.0F, false);
            NECK.setTextureOffset(283, 252).addBox(-5.0F, -50.0F, -31.0F, 10.0F, 19.0F, 2.0F, 0.0F, false);
            NECK.setTextureOffset(205, 256).addBox(-5.0F, -50.0F, -38.0F, 10.0F, 19.0F, 5.0F, 0.0F, false);
            NECK.setTextureOffset(281, 154).addBox(-5.0F, -50.0F, -33.0F, 10.0F, 19.0F, 2.0F, 0.0F, false);
            NECK.setTextureOffset(0, 209).addBox(-5.0F, -50.0F, -47.0F, 10.0F, 14.0F, 9.0F, 0.0F, false);
            NECK.setTextureOffset(0, 254).addBox(-2.0F, -52.0F, -59.0F, 5.0F, 2.0F, 33.0F, 0.0F, false);
            NECK.setTextureOffset(259, 38).addBox(-2.0F, -53.0F, -56.0F, 5.0F, 3.0F, 26.0F, 0.0F, false);

            cube_r21 = new ModelRenderer(this);
            cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
            NECK.addChild(cube_r21);
            setRotationAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
            cube_r21.setTextureOffset(113, 256).addBox(-7.0F, -54.0F, -60.0F, 15.0F, 13.0F, 18.0F, 0.0F, false);

            HEAD = new ModelRenderer(this);
            HEAD.setRotationPoint(0.0F, 24.0F, 0.0F);
            HEAD.setTextureOffset(91, 211).addBox(-9.0F, -51.0F, -70.0F, 10.0F, 20.0F, 6.0F, 0.0F, false);
            HEAD.setTextureOffset(243, 195).addBox(1.0F, -51.0F, -70.0F, 9.0F, 20.0F, 6.0F, 0.0F, false);
            HEAD.setTextureOffset(0, 65).addBox(-8.0F, -52.0F, -76.0F, 17.0F, 5.0F, 13.0F, 0.0F, false);
            HEAD.setTextureOffset(40, 0).addBox(-10.0F, -52.0F, -74.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);

            firstjaw3top_r1 = new ModelRenderer(this);
            firstjaw3top_r1.setRotationPoint(0.0F, 35.0F, -36.0F);
            HEAD.addChild(firstjaw3top_r1);
            setRotationAngle(firstjaw3top_r1, -1.3526F, 0.0F, 0.0F);
            firstjaw3top_r1.setTextureOffset(123, 211).addBox(-6.0F, 12.0F, -90.0F, 12.0F, 20.0F, 2.0F, 0.0F, false);
            firstjaw3top_r1.setTextureOffset(281, 132).addBox(-5.0F, 12.0F, -92.0F, 10.0F, 20.0F, 2.0F, 0.0F, false);
            firstjaw3top_r1.setTextureOffset(0, 254).addBox(-7.0F, 12.0F, -88.0F, 14.0F, 20.0F, 2.0F, 0.0F, false);
            firstjaw3top_r1.setTextureOffset(99, 287).addBox(-4.0F, 12.0F, -93.0F, 8.0F, 20.0F, 2.0F, 0.0F, false);
            firstjaw3top_r1.setTextureOffset(0, 128).addBox(-8.0F, 12.0F, -86.0F, 16.0F, 20.0F, 6.0F, 0.0F, false);


            topjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
            HEAD.addChild(topjaw);
            topjaw.setTextureOffset(40, 0).addBox(9.0F, -52.0F, -74.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);

            firstjawtop_r1 = new ModelRenderer(this);
            firstjawtop_r1.setRotationPoint(0.0F, 35.0F, -36.0F);
            topjaw.addChild(firstjawtop_r1);
            setRotationAngle(firstjawtop_r1, -1.3526F, 0.0F, 0.0F);
            firstjawtop_r1.setTextureOffset(0, 0).addBox(-3.0F, 43.0F, -84.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(198, 27).addBox(-5.0F, 40.0F, -85.0F, 10.0F, 3.0F, 6.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(0, 6).addBox(-4.0F, 36.0F, -88.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(38, 128).addBox(-5.0F, 36.0F, -87.0F, 10.0F, 4.0F, 1.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(34, 83).addBox(-6.0F, 36.0F, -86.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(0, 11).addBox(-3.0F, 36.0F, -89.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(277, 67).addBox(-7.0F, 36.0F, -85.0F, 14.0F, 4.0F, 6.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(34, 154).addBox(-4.0F, 32.0F, -92.0F, 8.0F, 4.0F, 2.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(133, 9).addBox(-5.0F, 32.0F, -90.0F, 10.0F, 4.0F, 2.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(32, 172).addBox(-6.0F, 32.0F, -88.0F, 12.0F, 4.0F, 2.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(42, 55).addBox(-3.0F, 32.0F, -92.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
            firstjawtop_r1.setTextureOffset(243, 231).addBox(-7.0F, 32.0F, -86.0F, 14.0F, 4.0F, 7.0F, 0.0F, false);

            bottomjaw = new ModelRenderer(this);
            bottomjaw.setRotationPoint(0.0F, 24.0F, 0.0F);
            bottomjaw.setTextureOffset(29, 209).addBox(-7.0F, -27.0F, -81.0F, 14.0F, 4.0F, 2.0F, 0.0F, false);
            bottomjaw.setTextureOffset(127, 166).addBox(-6.0F, -27.0F, -83.0F, 12.0F, 4.0F, 2.0F, 0.0F, false);
            bottomjaw.setTextureOffset(133, 3).addBox(-5.0F, -27.0F, -85.0F, 10.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r22 = new ModelRenderer(this);
            cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
            bottomjaw.addChild(cube_r22);
            setRotationAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
            cube_r22.setTextureOffset(40, 12).addBox(-4.0F, -20.0F, -88.0F, 8.0F, 4.0F, 2.0F, 0.0F, false);

            firstjawbottom_r1 = new ModelRenderer(this);
            firstjawbottom_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
            bottomjaw.addChild(firstjawbottom_r1);
            setRotationAngle(firstjawbottom_r1, -1.0472F, 0.0F, 0.0F);
            firstjawbottom_r1.setTextureOffset(198, 0).addBox(-7.0F, 37.0F, -66.0F, 11.0F, 20.0F, 7.0F, 0.0F, false);
            firstjawbottom_r1.setTextureOffset(178, 195).addBox(-3.0F, 37.0F, -66.0F, 11.0F, 20.0F, 7.0F, 0.0F, false);

            RIGHTARM = new ModelRenderer(this);
            RIGHTARM.setRotationPoint(0.0F, 7.0F, 16.0F);
            setRotationAngle(RIGHTARM, 0.5236F, 0.0F, 0.0F);
            RIGHTARM.setTextureOffset(178, 222).addBox(-14.0F, -40.0F, -25.0F, 6.0F, 12.0F, 11.0F, 0.0F, false);
            RIGHTARM.setTextureOffset(277, 107).addBox(-14.0F, -31.0F, -33.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);
            RIGHTARM.setTextureOffset(277, 77).addBox(-14.0F, -29.0F, -43.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

            cube_r23 = new ModelRenderer(this);
            cube_r23.setRotationPoint(22.0F, -5.0F, -3.0F);
            RIGHTARM.addChild(cube_r23);
            setRotationAngle(cube_r23, 2.5732F, -0.2614F, 0.0173F);
            cube_r23.setTextureOffset(0, 65).addBox(-22.0F, -10.0F, 43.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r24 = new ModelRenderer(this);
            cube_r24.setRotationPoint(22.0F, -5.0F, -3.0F);
            RIGHTARM.addChild(cube_r24);
            setRotationAngle(cube_r24, 2.2241F, -0.2614F, 0.0173F);
            cube_r24.setTextureOffset(47, 65).addBox(-22.0F, -24.0F, 36.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r25 = new ModelRenderer(this);
            cube_r25.setRotationPoint(22.0F, -5.0F, -3.0F);
            RIGHTARM.addChild(cube_r25);
            setRotationAngle(cube_r25, 0.697F, -0.2614F, 0.0173F);
            cube_r25.setTextureOffset(0, 70).addBox(-22.0F, -40.0F, -23.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r26 = new ModelRenderer(this);
            cube_r26.setRotationPoint(10.0F, -2.0F, -9.0F);
            RIGHTARM.addChild(cube_r26);
            setRotationAngle(cube_r26, 2.2293F, 0.044F, 0.0167F);
            cube_r26.setTextureOffset(47, 70).addBox(-22.0F, -25.0F, 36.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r27 = new ModelRenderer(this);
            cube_r27.setRotationPoint(10.0F, -2.0F, -9.0F);
            RIGHTARM.addChild(cube_r27);
            setRotationAngle(cube_r27, 0.7022F, 0.044F, 0.0167F);
            cube_r27.setTextureOffset(0, 83).addBox(-22.0F, -41.0F, -23.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r28 = new ModelRenderer(this);
            cube_r28.setRotationPoint(1.0F, -2.0F, -3.0F);
            RIGHTARM.addChild(cube_r28);
            setRotationAngle(cube_r28, 2.2241F, -0.2614F, 0.0173F);
            cube_r28.setTextureOffset(6, 84).addBox(-22.0F, -25.0F, 36.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r29 = new ModelRenderer(this);
            cube_r29.setRotationPoint(1.0F, -2.0F, -3.0F);
            RIGHTARM.addChild(cube_r29);
            setRotationAngle(cube_r29, 0.697F, -0.2614F, 0.0173F);
            cube_r29.setTextureOffset(0, 88).addBox(-22.0F, -41.0F, -23.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            cube_r30 = new ModelRenderer(this);
            cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
            RIGHTARM.addChild(cube_r30);
            setRotationAngle(cube_r30, 1.0472F, 0.0F, 0.0F);
            cube_r30.setTextureOffset(217, 132).addBox(-14.0F, -53.0F, -7.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

            bb_main = new ModelRenderer(this);
            bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);


            cube_r31 = new ModelRenderer(this);
            cube_r31.setRotationPoint(0.0F, -27.0F, 14.0F);
            bb_main.addChild(cube_r31);
            setRotationAngle(cube_r31, 1.7017F, 0.0F, 0.0F);
            cube_r31.setTextureOffset(0, 234).addBox(9.0F, -53.0F, -7.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);
        }

        @Override
        public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
            //previously the render function, render code was moved to a method below
        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            BODY.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            LEFTARM.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            NECK.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            HEAD.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            bottomjaw.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            RIGHTARM.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
    }





}
