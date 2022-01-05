import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class AfficheurRectanglePlein implements AfficheurFigure {
  private RectanglePlein r;

  public AfficheurRectanglePlein(RectanglePlein r){
    this.r=r;
  }
  public void dessiner(Graphics g){

      Color couleurChoisie = new Color(this.r.getRouge(), this.r.getVert(), this.r.getBleu());
      g.setColor(couleurChoisie);
      g.fillRect(0,0,this.r.getLongueur(),this.r.getLargeur());
  }
}
