public class Rectangle extends Figure {
  private int longeur, largeur;

//constructeur
public Rectangle(int rouge,int vert, int bleu, AfficheurRectangle a, int lg, int lrg) {
  super(rouge, vert, bleu);
  longeur = lg;
  largeur = lrg;
  aff = a;
}

public Rectangle(int rouge,int vert, int bleu, int lg, int lrg) {
  super(rouge, vert, bleu);
  longeur = lg;
  largeur = lrg;
}

//getters
public int getLargeur(){
  return this.largeur;
}
public int getLongueur(){
  return this.longeur;
}

public AfficheurFigure getAfficheur() {
  return aff;
}
public void setAfficheur(AfficheurFigure a) {
  aff = a;
}
}//fin class
