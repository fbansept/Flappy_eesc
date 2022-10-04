import java.awt.*;

public abstract class Rectangle extends Carre {

    protected int hauteur;

    public Rectangle(int x, int y, int largeur, int hauteur, Color couleur) {
        super(x, y, largeur, couleur);
        this.hauteur = hauteur;
    }

    public Rectangle(int x, int y, int largeur, int hauteur) {
        super(x, y, largeur, Color.GREEN);
        this.hauteur = hauteur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
}
