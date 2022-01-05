import java.util.*;

public abstract class Figure {
  protected int rouge, vert, bleu;
  protected AfficheurFigure aff; //protected --> accces aux figures

public Figure(int r, int v, int b) {
  rouge = r;
  vert = v;
  bleu = b;
}

//getters
public int getRouge(){
  return this.rouge;
}
public int getVert(){
  return this.vert;
}
public int getBleu(){
  return this.bleu;
}
public abstract AfficheurFigure getAfficheur();

}//fin class
