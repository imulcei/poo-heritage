package fr.afpa.model.bo;

public class Pion extends PieceEchecs {

    public Pion(int coordonneesX, int coordonneesY, Couleur couleur) throws Exception {
        super(coordonneesX, coordonneesY, couleur);
    }

    /**
     * Permet de déterminer sur quelles cases le Pion peut aller
     * 
     * @param xD Coordonnées en x
     * @param yD Coordonnées en y
     * @return Renvoie vrai si le Pion peut aller sur la case et faux si non
     */
    @Override
    public boolean peutAllerA(int xD, int yD) {
        // si les déplacements sont hors-plateau
        if (xD < 1 || xD > 8 || yD < 1 || yD > 8) {
            return false;
        }

        if (xD == 0 && yD == 1 || this.getCoordonneesY() == 2 && yD == this.getCoordonneesY() + 2) {
            return true;
        } else {
            return false;
        }
    }
}
