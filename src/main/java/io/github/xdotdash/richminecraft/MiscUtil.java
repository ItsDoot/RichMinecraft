package io.github.xdotdash.richminecraft;

import net.minecraft.client.Minecraft;

public class MiscUtil {

    public static String getIGN() {
        return Minecraft.getMinecraft().getSession().getProfile().getName();
    }
}
