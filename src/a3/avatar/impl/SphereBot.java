package a3.avatar.impl;

import a3.avatar.BasicAvatar;

public class SphereBot extends BasicAvatar {

	private static final long serialVersionUID = 5825427995305685076L;

	public SphereBot() {
		super.setAvatarName("SphereBot");
		super.setAvatarSkeletalFileName("Sphere_Bot.rks");
		super.setAvatarSkeletalMeshFileName("Sphere_Bot.rkm");
		super.setAvatarAnimationFileName("Sphere_Bot_Attack.rka");
		super.setAvatarTextureFileName("Sphere_Bot_color_1.jpg");
		super.setAvatarHeightOffset(10.0f);
		super.setScale(2.0f);
		super.setMass(1.0f);
		super.setGunNode1HeightOffset(0.0f);
		super.setGunNode1RightOffset(0.0f);
		super.setGunNode2HeightOffset(0.0f);
		super.setGunNode2LeftOffset(0.0f);
	}
	
}
