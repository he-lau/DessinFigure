import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;

public class AfficheurRectangle implements AfficheurFigure {
  private Rectangle r;

  public AfficheurRectangle(Rectangle r){
    this.r=r;
  }
  public void dessiner(Graphics g){
    /* On donne x=0 et y=0, cela n'a pas d'importance car par la
    suite on recuperera ses données avec la souris (MouseListener) */
    Color couleurChoisie = new Color(this.r.getRouge(), this.r.getVert(), this.r.getBleu());
    g.setColor(couleurChoisie);
    g.drawRect(0,0,this.r.getLongueur(),this.r.getLargeur());
  }
}
