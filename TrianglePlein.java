public class TrianglePlein extends Figure {
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private int x3;
  private int y3;
  private boolean plein = true;

  //constructeur
  public TrianglePlein(int rouge,int vert, int bleu, AfficheurTrianglePlein a, int x1, int y1, int x2, int y2, int x3, int y3) {
    super(rouge, vert, bleu);
    aff = a;
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;
  }

  //getters
  public int getX1(){
    return this.x1;
  }
  public int getY1(){
    return this.y1;
  }
  public int getX2(){
    return this.x2;
  }
  public int getY2(){
    return this.y2;
  }
   public int getX3(){
     return this.x3;
  }
  public int getY3(){
    return this.y3;
  }

  //méthodes AfficheurFigure
  public AfficheurFigure getAfficheur() {
    return aff;
  }
  public void setAfficheur(AfficheurFigure a) {
    aff = a;
  }



}//fin class
