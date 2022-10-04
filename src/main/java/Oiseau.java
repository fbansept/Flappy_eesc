import java.awt.*;

public class Oiseau extends Carre {

    protected float vitesseVertical;

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

    public void deplacement() {
        y -= vitesseVertical;
        vitesseVertical -= 0.05f;

        if(y < 0) {
            vitesseVertical = Math.abs(vitesseVertical) * - 1;
        }
    }

    public void sauter() {

    }

    public float getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(float vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }
}
