package fr.afpa.model.bo;

public class Pion extends PieceEchecs {

    public Pion(int coordonneesX, int coordonneesY, Couleur couleur) throws Exception {
        super(coordonneesX, coordonneesY, couleur);
    }

    // ✅ cheked
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

        int deplacementX = xD - this.getCoordonneesX();
        int deplacementY = yD - this.getCoordonneesY();

        if (this.getCouleur() == Couleur.BLANC) {
            if (deplacementX == 0 && deplacementY == 1) {
                return true;
            }
            if (deplacementX == 0 && deplacementY == 2 && this.getCoordonneesY() == 2) {
                return true;
            }
        }

        if (this.getCouleur() == Couleur.NOIR) {
            if (deplacementX == 0 && deplacementY == -1) {
                return true;
            }
            if (deplacementX == 0 && deplacementY == -2 && this.getCoordonneesY() == 7) {
                return true;
            }
        }
        return false;
    }

    // ✅ cheked
    /**
     * Permet de déterminer si la pièce donnée peut manger une autre pièce
     * 
     * @param piece
     * @return Renvoie vrai si la pièce peut manger l'autre pièceet faux si non
     */
    @Override
    public boolean peutManger(PieceEchecs piece) {
        int pieceX = piece.getCoordonneesX();
        int pieceY = piece.getCoordonneesY();
        if (!estDansLEchiquier(pieceX, pieceY) || piece.getCouleur() == this.getCouleur()) {
            return false;
        }
        int deplacementX = Math.abs(pieceX - this.getCoordonneesX());
        int deplacementY = pieceY - this.getCoordonneesY();
        if (deplacementX == 1 && deplacementY == 1 && this.getCouleur() == Couleur.BLANC) {
            return true;
        }
        if (deplacementX == -1 && deplacementY == 1 && this.getCouleur() == Couleur.NOIR) {
            return true;
        }
        return false;
    }
}
