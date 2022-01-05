public class Segment extends Figure {
  private int x1, y1, x2, y2; // début/fin segment
  private int longeur;

public Segment(int r, int v, int b, AfficheurSegment a, int x1, int x2, int y1, int y2, int longeur) {
  super(r, v, b);
  aff = a;
  this.x1 = x1;
  this.x2 = x2;
  this.y1 = y1;
  this.y2 = y2;
  this.longeur = longeur;
}

//getters

public int getX1(){
  return this.x1;
}
public int getX2(){
  return this.x2;
}
public int getY1(){
  return this.y1;
}
public int getY2(){
  return this.y2;
}

public AfficheurFigure getAfficheur() {
  return aff;
}
public void setAfficheur(AfficheurFigure a) {
  aff = a;
}

}//fin class
