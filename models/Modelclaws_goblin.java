// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelclaws_goblin extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public Modelclaws_goblin() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -7.0F, 0.0F);
		body.setTextureOffset(0, 105).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F, false);
		body.setTextureOffset(98, 117).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 7.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 4.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 10.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -9.0F, -2.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(59, 57).addBox(4.0F, -12.0F, -2.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(57, 56).addBox(-6.0F, -12.0F, -2.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-11.0F, -7.0F, 0.0F);
		setRotationAngle(right_arm, -0.3927F, 0.0F, 0.0F);
		right_arm.setTextureOffset(0, 0).addBox(-2.0F, 15.2451F, 1.877F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 0).addBox(-2.0F, 15.0866F, -0.3534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 0).addBox(-2.0F, 14.9281F, -2.5838F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(108, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 18.0F, 6.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(22.0F, 0.0F, 0.0F);
		right_arm.addChild(left_arm);
		left_arm.setTextureOffset(0, 0).addBox(1.0F, 14.9281F, -2.5838F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 0).addBox(1.0F, 15.0866F, -0.3534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 0).addBox(1.0F, 15.2451F, 1.877F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(108, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 18.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-5.0F, 11.0F, 0.0F);
		right_leg.setTextureOffset(106, 52).addBox(-2.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 0).addBox(-2.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 0).addBox(0.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 0).addBox(2.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.0F, 11.0F, 0.0F);
		left_leg.setTextureOffset(0, 0).addBox(-2.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 0).addBox(0.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 0).addBox(2.0F, 12.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(106, 52).addBox(-2.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}
