public class RectanglePlein extends Figure {
  private int longueur, largeur;
  private boolean plein = true;

public RectanglePlein(int rouge,int vert, int bleu, AfficheurRectanglePlein a, int lg, int lrg) {
  super(rouge, vert, bleu);
  longueur = lg;
  largeur = lrg;
  aff = a;
}

public RectanglePlein(int rouge,int vert, int bleu, int lg, int lrg) {
  super(rouge, vert, bleu);
  longueur = lg;
  largeur = lrg;
}

//getters
public int getLargeur(){
  return this.largeur;
}
public int getLongueur(){
  return this.longueur;
}

public AfficheurFigure getAfficheur() {
  return aff;
}
public void setAfficheur(AfficheurFigure a) {
  aff = a;
}
}//fin class
