package me.vaape.colouredname.gradients;

import net.md_5.bungee.api.ChatColor;

import java.util.List;

public class GradientUtils {
    public static String gradientifyString(String string, List<String> gradients) {
        StringBuilder msg = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            msg.append(ChatColor.of(gradients.get(i))).append(string.charAt(i));
        }

        return msg.toString();
    }
}
