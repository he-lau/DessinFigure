import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;


public class AfficheurTriangle implements AfficheurFigure {
  private Triangle t;

  public AfficheurTriangle(Triangle t){
    this.t=t;
  }
  public void dessiner(Graphics g){
    int[]x= new int[3];
    x[0]= this.t.getX1(); x[1]=this.t.getX2(); x[2]=this.t.getX3();

    int[]y= new int[3];
    y[0]= this.t.getY1(); y[1]= this.t.getY2(); y[2]= this.t.getY3();

      g.drawPolygon(x,y,3);

    }
}
