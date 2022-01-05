import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class AfficheurCerclePlein implements AfficheurFigure{
  private CerclePlein c;

public AfficheurCerclePlein(CerclePlein c){
    this.c=c;
  }

public void dessiner(Graphics g){
    /*Pour trouver le sommet superieur gauche du CerclePlein
    pour pouvoir la dessiner avec fillOval() -->
    x = centreX - rayon, y = centreY - rayon
    */
    Color couleurChoisie = new Color(this.c.getRouge(), this.c.getVert(), this.c.getBleu());
    g.setColor(couleurChoisie);
    g.fillOval(this.c.getCentreX()-this.c.getRayon(),this.c.getCentreY()-this.c.getRayon(),this.c.getRayon(),this.c.getRayon());
  }

}//fin class
