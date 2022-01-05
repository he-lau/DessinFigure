public class EllipsePleine extends Figure {
  private int centreX;
  private int centreY;
  private int hauteur;
  private int longueur;
  private boolean plein = true;

//constructeur
public EllipsePleine(int rouge,int vert, int bleu, AfficheurEllipsePleine a, int x, int y, int h, int l) {
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
