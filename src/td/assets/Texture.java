package td.assets;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import td.util.Hitbox;

public class Texture {
    private final BufferedImage image;
    private Hitbox hitbox = null;
    
    public Texture(Image image) throws IOException {
        this.image = image.getBufferedImage();
    }
    
    public BufferedImage getImage() {
        return image;
    }
    
    public void createHitbox(int x, int y) {
        hitbox = new Hitbox(x, y, image.getWidth(), image.getHeight());
    }
    
    public Hitbox getHitbox() {
        return hitbox;
    }
    
    public void draw(Graphics2D g) {
        g.drawImage(image, hitbox.getX(), hitbox.getY(), null);
    }
}
