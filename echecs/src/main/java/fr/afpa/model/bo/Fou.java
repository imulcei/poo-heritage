package fr.afpa.model.bo;

public class Fou extends PieceEchecs {

    public Fou(int coordonneesX, int coordonneesY, Couleur couleur) throws Exception {
        super(coordonneesX, coordonneesY, couleur);
    }

    // ✅ cheked
    /**
     * Permet de déterminer sur quelles cases le Fou peut aller
     * 
     * @param xD Coordonnées en x
     * @param yD Coordonnées en y
     * @return Renvoie vrai si le Fou peut aller sur la case et faux si non
     */
    @Override
    public boolean peutAllerA(int xD, int yD) {
        // si les déplacements sont hors-plateau
        if (xD < 1 || xD > 8 || yD < 1 || yD > 8) {
            return false;
        }
        // ici les deux variable permettent un déplacement dans toutes les directions
        int deplacementX = Math.abs(xD - this.getCoordonneesX());
        int deplacementY = Math.abs(yD - this.getCoordonneesY());
        if (deplacementX == deplacementY) {
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
