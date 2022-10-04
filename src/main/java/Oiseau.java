import java.awt.*;

public class Oiseau extends Carre {

    protected int vitesseVertical;

    protected final static int HAUTEUR_OISEAU = 40;

    public Oiseau(int x, int y) {
        super(x, y, HAUTEUR_OISEAU);
        this.vitesseVertical = 0;
    }

    public Oiseau(int hauteurEcran) {
        super(50, hauteurEcran / 2 - HAUTEUR_OISEAU / 2, HAUTEUR_OISEAU);
        this.vitesseVertical = 0;
    }

    @Override
    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillRect(x,y,largeur,largeur);
    }

    public void sauter() {

    }

    public int getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }
}
