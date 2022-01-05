import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;

public class AfficheurEllipsePleine implements AfficheurFigure {
  private EllipsePleine e;

  public AfficheurEllipsePleine(EllipsePleine e){
    this.e=e;
  }
  public void dessiner(Graphics g){
    /* On donne x=0 et y=0, cela n'a pas d'importance car par la
    suite on recuperera ses données avec la souris (MouseListener) */
    Color couleurChoisie = new Color(this.e.getRouge(), this.e.getVert(), this.e.getBleu());
    g.setColor(couleurChoisie);
    g.fillOval(0,0,this.e.getLongueur(),this.e.getHauteur());
    }
  }
