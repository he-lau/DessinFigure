import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

public class Vue extends JFrame implements KeyListener {
  private JPanelFigure zoneDessin; //ref. sur le JPanelFigure contenant l'ArrayList de Figure(modele)
  private int choix = 0; //ref. sur l'action auquelle l'util. aurait fait

  /* ref. sur toutes les sortes d'afficheur pour pouvoir
  instancier les figures plus facilement
  */
  private AfficheurCercle affC;
  private AfficheurCerclePlein affCP;
  private AfficheurRectangle affR;
  private AfficheurRectanglePlein affRP;
  private AfficheurSegment affS;
  private AfficheurTriangle affT;
  private AfficheurTrianglePlein affTP;
  private AfficheurEllipse affE;
  private AfficheurEllipsePleine affEP;


// Constructeur
public Vue (String titre, int w, int h){
  super(titre);
  this.centreEcran(w,h);
  this.initialise();
  this.addKeyListener(this);
  this.setFocusable(true);
  this.setVisible(true);
  this.setSize(1024,768);
  this.setLocationRelativeTo(null);
  seticon();
}

//Ajout d'un Icon pour l'application
public void seticon()
{
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/dessin.png")));
}

//Permet de centrer la fenêtre
public void centreEcran(int w, int h) {
  Toolkit aTK = Toolkit.getDefaultToolkit();
  Dimension dim = aTK.getScreenSize();
  this.setBounds((dim.width / 2) - (w / 2), (dim.height / 2 ) - (h / 2), w, h);
}

// initialise la fenêtre
public void initialise(){
  this.setLayout(new BorderLayout());
  this.add(this.getPanelWest(),BorderLayout.WEST);
  this.add(this.getPanelCenter(), BorderLayout.CENTER);
  this.add(getPanelSouth(), BorderLayout.SOUTH);
}

// Ecouteur de clavier pour raccourci
  public void keyTyped(KeyEvent e) {
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_C) {
        JOptionPane.showMessageDialog(new JFrame(), "Vous pouvez tracer un cercle dans la zone de dessin");
        Vue.this.choix = 1;
    }

    if ((e.getKeyCode() == KeyEvent.VK_C) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)){
        JOptionPane.showMessageDialog(new JFrame(), "Vous pouvez tracer un cercle plein dans la zone de dessin");
        Vue.this.choix = 2;
    }

    if (e.getKeyCode() == KeyEvent.VK_R) {
        JOptionPane.showMessageDialog(new JFrame(), "Vous pouvez tracer un rectangle dans la zone de dessin");
        Vue.this.choix = 3;
    }

    if ((e.getKeyCode() == KeyEvent.VK_R) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)){
        JOptionPane.showMessageDialog(new JFrame(), "Vous pouvez tracer un rectangle plein dans la zone de dessin");
        Vue.this.choix = 4;
    }
  }
  public void keyReleased(KeyEvent e) {
  }

// le panel nord
private JPanel getPanelWest() {
  JPanel jPan = new JPanel();
  jPan.setLayout(new GridLayout(5,2,5,5));

// creation des bouton pour les diff figure + Listener
  JButton but1 = new JButton("Cercle",new ImageIcon("Images/cercle.png"));
  /* On branche le bouton sur un ActionListener, ainsi
    si l'utilisateur appui sur le bouton en question
    la var d'attribut de la classe Vue sera modifié
  */
  but1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 1;
        JOptionPane.showMessageDialog(new JFrame(), "Veuillez cliquer dans la zone de dessin, en choisissant l'emplacement de votre dessin.");
    }
  });
  jPan.add(but1);

  JButton but6 = new JButton("Cercle plein",new ImageIcon("Images/cercleplein.png"));
  but6.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 2;
        JOptionPane.showMessageDialog(new JFrame(), "Veuillez cliquer dans la zone de dessin, en choisissant l'emplacement de votre dessin.");
    }
  });
  jPan.add(but6);

  JButton but2 = new JButton("Rectangle",new ImageIcon("Images/rectangle.png"));
  but2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 3;
    }
  });
  jPan.add(but2);

  JButton but7 = new JButton("Rectangle plein",new ImageIcon("Images/rectangleplein.png"));
  but7.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 4;
    }
  });
  jPan.add(but7);

  JButton but3 = new JButton("Ellipse",new ImageIcon("Images/ellipse.png"));
  but3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 5;
    }
  });
  jPan.add(but3);

  JButton but8 = new JButton("Ellipse pleine",new ImageIcon("Images/ellipseplein.png"));
  but8.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 6;
    }
  });
  jPan.add(but8);

  JButton but5 = new JButton("Triangle",new ImageIcon("Images/triangle.png"));
  but5.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 7;
    }
  });
  jPan.add(but5);

  JButton but10 = new JButton("Triangle plein",new ImageIcon("Images/triangleplein.png"));
  but10.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 8;
    }
  });
  jPan.add(but10);

  JButton but4 = new JButton("Segment",new ImageIcon("Images/ligne.png"));
  but4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 9;
    }
  });
  jPan.add(but4);


  return jPan;
}

private JTabbedPane getPanelCenter() {
  JTabbedPane jTab = new JTabbedPane();
  JPanelFigure jPF = new JPanelFigure();
  this.zoneDessin = jPF;



  jPF.addKeyListener(new KeyListener() {
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_C) {
          System.out.println("1");
          JOptionPane.showMessageDialog(new JFrame(), "Vous pouvez tracer un cercle dans la zone de dessin");
          Vue.this.choix = 1;
      }
    }
    public void keyReleased(KeyEvent e) {
    }
  });


  JPanel text = new JPanel();

  JTextArea t = new JTextArea(50, 50);
  text.add(t);

  jTab.add(this.zoneDessin, "Zone de dessin");
  jTab.add(text, "Zone de texte");

  return jTab;
}

private JPanel getPanelSouth() {
  JPanel jPan = new JPanel();

  JButton eff = new JButton("Gomme",new ImageIcon("Images/gomme.png"));
  eff.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 10;
    }
  });
  jPan.add(eff);

  JButton charger = new JButton("Charger",new ImageIcon("Images/charger.png"));
  charger.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        choix = 11;
    }
  });
  jPan.add(charger);

  JButton enregistrer = new JButton("Enregistrer",new ImageIcon("Images/enregistrer.png"));
  enregistrer.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent evt) {
      choix = 12;
    }
  });
  jPan.add(enregistrer);

  return jPan;
}

// class JPanel permettant de dessiner les figures
class JPanelFigure extends JPanel implements MouseListener {
    private ArrayList<Figure> modele; //ref. reliant le modele a la vue/ controleur

// Constructeur
  public JPanelFigure(){
    //on branche JPanelFigure a l'ecouteur charger de la souris
    addMouseListener(this);
    this.addMouseMotionListener((new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                jPanelFigureMouseDragged(evt);
            }
        }));
    this.modele = new ArrayList<Figure>();
  }

/* méthode permettant de dessiner les figures
  en parcourant l'ArrayList */
  public void paintComponent(Graphics g) {
    // affiche le composant
    super.paintComponent(g);
    /* parcours l'ArrayList de figure pour
    acceder a leurs Afficheur pour acceder a la
    methode dessiner() */
    for(int i=0; i <this.modele.size();i++){
      this.modele.get(i).getAfficheur().dessiner(g);
    }
  }

  public void mousePressed(MouseEvent evt){

      if (Vue.this.choix == 1) {
        // boite de confirmation
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Voulez vous dessiner un cercle ici? ", "Cercle", dialogButton);
        if(dialogResult == 0) {
          // Determnation rayon du cercle + x/y
          JOptionPane jop = new JOptionPane();
          int rayon = Integer.parseInt(jop.showInputDialog(null, "Rayon du cercle? : ", "Tracer de cercle", JOptionPane.QUESTION_MESSAGE));

          //position du click
          int x=evt.getX();
          int y=evt.getY();

          // Determnation de la couleur souhaité
          JOptionPane.showMessageDialog(new JFrame(), "Veuillez choisir une couleur");
          Color color = JColorChooser.showDialog(this,"Choix de la couleur", Color.BLACK);
          // On la convertit en RGB
          int rouge = color.getRed();
          int vert = color.getGreen();
          int bleu = color.getBlue();
          // Ajoute la figure a l'ArrayList et la dessine
          Vue.this.affC = new AfficheurCercle(new Cercle(rouge,vert,bleu,x,y,rayon));
          this.modele.add(new Cercle(rouge,vert,bleu,Vue.this.affC,x,y,rayon));
          Vue.this.repaint();
        } else {
          choix = 0;
        }
      }

      if (Vue.this.choix == 2) {
        // boite de confirmation
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Voulez vous dessiner un cercle plein ici? ", "Cercle Plein", dialogButton);
        if(dialogResult == 0) {
          // Determnation rayon du cercle + x/y
          JOptionPane jop = new JOptionPane();
          int rayon = Integer.parseInt(jop.showInputDialog(null, "Rayon du cercle? : ", "Tracer de cercle plein", JOptionPane.QUESTION_MESSAGE));

          //position du click
          int x=evt.getX();
          int y=evt.getY();

          // Determnation de la couleur souhaité
          JOptionPane.showMessageDialog(new JFrame(), "Veuillez choisir une couleur");
          Color color = JColorChooser.showDialog(this,"Choix de la couleur", Color.BLACK);
          // On la convertit en RGB
          int rouge = color.getRed();
          int vert = color.getGreen();
          int bleu = color.getBlue();
          // Ajoute la figure a l'ArrayList et la dessine
          Vue.this.affCP = new AfficheurCerclePlein(new CerclePlein(rouge,vert,bleu,x,y,rayon));
          this.modele.add(new CerclePlein(rouge,vert,bleu,Vue.this.affCP,x,y,rayon));
          Vue.this.repaint();
        } else {
          choix = 0;
        }
      }

      if (Vue.this.choix == 3) {
        // boite de confirmation
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Voulez vous dessiner un rectangle ici? ", "Rectangle", dialogButton);
        if(dialogResult == 0) {
          // Determnation rayon du cercle + x/y
          JOptionPane jop = new JOptionPane();
          int largeur = Integer.parseInt(jop.showInputDialog(null, "Largeur du rectangle? : ", "Tracer de Rectngle", JOptionPane.QUESTION_MESSAGE));
          int longeur = Integer.parseInt(jop.showInputDialog(null, "Longeur du rectangle? : ", "Tracer de Rectangle", JOptionPane.QUESTION_MESSAGE));

          //position du click
          int lg=evt.getX();
          int lrg=evt.getY();

          // Determnation de la couleur souhaité
          JOptionPane.showMessageDialog(new JFrame(), "Veuillez choisir une couleur");
          Color color = JColorChooser.showDialog(this,"Choix de la couleur", Color.BLACK);
          // On la convertit en RGB
          int rouge = color.getRed();
          int vert = color.getGreen();
          int bleu = color.getBlue();
          // Ajoute la figure a l'ArrayList et la dessine
          Vue.this.affR = new AfficheurRectangle(new Rectangle(rouge,vert,bleu,lg,lrg));
          this.modele.add(new Rectangle(rouge,vert,bleu,Vue.this.affR,lg,lrg));
          Vue.this.repaint();
        } else {
          choix = 0;
        }
      }

      if (Vue.this.choix == 4) {
        // boite de confirmation
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Voulez vous dessiner un rectangle plein ici? ", "Rectangle Plein", dialogButton);
        if(dialogResult == 0) {
          // Determnation rayon du cercle + x/y
          JOptionPane jop = new JOptionPane();
          int largeur = Integer.parseInt(jop.showInputDialog(null, "Largeur du rectangle plein? : ", "Tracer de Rectangle", JOptionPane.QUESTION_MESSAGE));
          int longeur = Integer.parseInt(jop.showInputDialog(null, "Longeur du rectangle plein? : ", "Tracer de Rectangle", JOptionPane.QUESTION_MESSAGE));

          //position du click
          int lg=evt.getX();
          int lrg=evt.getY();

          // Determnation de la couleur souhaité
          JOptionPane.showMessageDialog(new JFrame(), "Veuillez choisir une couleur");
          Color color = JColorChooser.showDialog(this,"Choix de la couleur", Color.BLACK);
          // On la convertit en RGB
          int rouge = color.getRed();
          int vert = color.getGreen();
          int bleu = color.getBlue();
          // Ajoute la figure a l'ArrayList et la dessine
          Vue.this.affRP = new AfficheurRectanglePlein(new RectanglePlein(rouge,vert,bleu,lg,lrg));
          this.modele.add(new RectanglePlein(rouge,vert,bleu,Vue.this.affRP,lg,lrg));
          Vue.this.repaint();
        } else {
          choix = 0;
        }
      }
  } // fin mousePressed

  public void jPanelFigureMouseDragged(MouseEvent evt) {
    Graphics g =  this.getGraphics();
    Color color = UIManager.getColor ( "Panel.background" );

    if (Vue.this.choix == 10) {

      int x = evt.getX();
      int y = evt.getY();

      g.setColor(color);
      g.fillOval(x, y, 20, 20);
      // PROBLEME : LE MODELE RESTE INCHANGE !
    }
  }

  public void mouseReleased(MouseEvent evt){
  }
  public void mouseClicked(MouseEvent evt){
  }
  public void mouseEntered(MouseEvent evt){
  }
  public void mouseExited(MouseEvent evt){
  }



} //fin JPanelFigure


//main
public static void main(String[] args) {
  new Vue("Dessin de figures", 960, 720);
}


}//fin class
