public class Ellipse extends Figure {
  private int centreX;
  private int centreY;
  private int hauteur;
  private int longueur;

//constructeur
public Ellipse(int rouge,int vert, int bleu, AfficheurEllipse a, int x, int y, int h, int l) {
  super(rouge, vert, bleu);
  centreX = x;
  centreY = y;
  hauteur = h;
  longueur = l;
  aff = a;
}

//getters
public int getCentreX() {
  return this.centreX;
}
public int getCentreY() {
  return this.centreY;
}
public int getHauteur() {
  return this.hauteur;
}
public int getLongueur() {
  return this.longueur;
}
//méthodes AfficheurFigure
public AfficheurFigure getAfficheur() {
  return aff;
}
public void setAfficheur(AfficheurFigure a) {
  aff = a;
}
}//fin class
