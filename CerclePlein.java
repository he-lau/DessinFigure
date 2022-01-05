public class CerclePlein extends Figure {
  private int rayon;
  private int centreX;
  private int centreY;
  private boolean plein = true;

//constructeur
public CerclePlein(int rouge,int vert, int bleu, AfficheurCerclePlein a, int x, int y, int r) {
  super(rouge, vert, bleu);
  centreX = x;
  centreY = y;
  rayon = r;
  aff = a;
}

public CerclePlein(int rouge,int vert, int bleu, int x, int y, int r) {
  super(rouge, vert, bleu);
  centreX = x;
  centreY = y;
  rayon = r;
}

//getters
public int getCentreX() {
  return this.centreX;
}
public int getCentreY() {
  return this.centreY;
}
public int getRayon() {
  return this.rayon;
}

//méthodes AfficheurFigure
public AfficheurFigure getAfficheur() {
  return aff;
}
public void setAfficheur(AfficheurFigure a) {
  aff = a;
}
}//fin class
