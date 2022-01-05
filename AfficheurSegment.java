import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class AfficheurSegment implements AfficheurFigure {
  private Segment s;

  public AfficheurSegment(Segment s){
    this.s=s;
  }
  public void dessiner(Graphics g){
    Color couleurChoisie = new Color(this.s.getRouge(), this.s.getVert(), this.s.getBleu());
    g.setColor(couleurChoisie);
    g.drawLine(this.s.getX1(),this.s.getY1(),this.s.getX2(),this.s.getY2());
  }

}
