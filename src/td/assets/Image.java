package td.assets;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import td.TowerDefence;

public enum Image {
    BLOCK_PATH("assets/block_path_2.png"),
    BLOCK_TOWER("assets/block_tower_4.jpg"),
    BLOCK_UNKNOWN("assets/block_unknown_80x.png"),
    BLOCK_HIGHLIGHT("assets/block_highlight.png"),
    TOWER_BASIC("assets/tower_basic.png"),
    BUTTON_PLAY("assets/button_play.png"),
    INFO_AREA("assets/info_area.png"),
    MENU_BAR("assets/menu_bar.png");
    
    private final String path;
    
    private Image(String path) {
        this.path = path;
    }
    
    public BufferedImage getBufferedImage() throws IOException {
        return ImageIO.read(TowerDefence.class.getResourceAsStream(path));
    }
    
    public java.awt.Image getImage() {
        return new ImageIcon(TowerDefence.class.getResource(path)).getImage();
    }
    
    public Icon getIcon() {
        return new ImageIcon(getImage());
    }
}
