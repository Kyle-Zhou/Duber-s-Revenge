import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Graphics;
import java.awt.Color;

class MedKit extends Entity {
  
  private BufferedImage sprite;
  
  MedKit (int xCord, int yCord){
    super(xCord, yCord);
    loadSprite();
    seteWidth(sprite.getWidth());
    seteHeight(sprite.getHeight());
    setHitbox(new Rectangle(xCord, yCord, geteWidth(), geteHeight()));
  }
  
  public void loadSprite() {
    try {
      sprite = ImageIO.read(new File("medkit.png"));
    } catch(Exception e) { System.out.println("Error Loading 'medkit.png'...");};
  }
  
  public void draw(Graphics g) {
    g.drawImage(sprite, getxCord(), getyCord(), null);
  }
    
}
