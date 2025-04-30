package fr.afpa.model.bo;

public class Roi extends PieceEchecs {

    public Roi(int coordonneesX, int coordonneesY, Couleur couleur) throws Exception {
        super(coordonneesX, coordonneesY, couleur);
    }

    /**
     * Permet de déterminer sur quelles cases le Roi peut aller
     * 
     * @param xD Coordonnées en x
     * @param yD Coordonnées en y
     * @return Renvoie vrai si le Roi peut aller sur la case et faux si non
     */
    @Override
    public boolean peutAllerA(int xD, int yD) {
        // si les déplacements sont hors-plateau
        if (xD < 1 || xD > 8 || yD < 1 || yD > 8) {
            return false;
        }
        // ici les deux variable permettent un déplacement en diagonale avec Math.abs
        int deplacementX = Math.abs(xD - this.getCoordonneesX());
        int deplacementY = Math.abs(yD - this.getCoordonneesY());
        if (deplacementX == 1 && deplacementY == 1 || deplacementX == 0 && deplacementY == 1
                || deplacementX == 1 && deplacementY == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Permet de déterminer si la pièce donnée peut manger une autre pièce
     * 
     * @param piece
     * @return Renvoie vrai si la pièce peut manger l'autre pièceet faux si non
     */
    @Override
    public boolean peutManger(PieceEchecs piece) {
        if (peutAllerA(piece.getCoordonneesX(), piece.getCoordonneesY()) && piece.getCouleur() != this.getCouleur()) {
            return true;
        } else {
            return false;
        }
    }
}
