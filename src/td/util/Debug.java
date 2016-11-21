package td.util;

import java.awt.Color;
import java.awt.Graphics2D;
import td.GameWindow;
import td.data.Fonts;
import td.screens.ScreenManager;

public class Debug {
    public static boolean ENABLED = false;
    protected static Color bgClr = new Color(0f, 0f, 0f, 0.4f);
    protected static final int baseY = 8;
    
    public static void render(Graphics2D g, GameWindow window) {
        g.setFont(Fonts.DEFAULT);
        RenderUtil.drawString("FPS: " + window.getFPS(), 8, baseY, Color.WHITE, bgClr, g);
        RenderUtil.drawString(window.getPanel().getWidth() + "x" + window.getPanel().getHeight(), 8, baseY * 4, Color.WHITE, bgClr, g);
        RenderUtil.drawString(window.getInput().getMouseX() + "," + window.getInput().getMouseY(), 8, baseY * 7, Color.WHITE, bgClr, g);
        RenderUtil.drawString("S: " + ScreenManager.getCurrentScreen().toString(), 8, baseY * 10, Color.WHITE, bgClr, g);
    }
}
