package fr.afpa.model.bo;

public class Pion extends PieceEchecs {

    public Pion(int coordonneesX, int coordonneesY, Couleur couleur) throws Exception {
        super(coordonneesX, coordonneesY, couleur);
    }

    // Il y aurait la prise à voir mais tel qu'est pensé la structure, ce n'est pas
    // adapté
    // TODO revoir le déplacement du pion, il faut bien penser qu'il y a les pions
    // noirs et les blancs. Au niveau des lignes Y, ce n'est pas la même chose
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

        if (xD == 0 && yD == 1 || this.getCoordonneesY() == 2 && yD == this.getCoordonneesY() + 2) {
            return true;
        } else {
            return false;
        }
    }

    // TODO les conditions, il faut bien penser qu'il y a les pions
    // noirs et les blancs. Au niveau des lignes Y, ce n'est pas la même chose
    // Utilise la méthode estDansLEchiquier()
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
        if (pieceX < 1 || pieceX > 8 || pieceY < 1
                || pieceY > 8 || piece.getCouleur() == this.getCouleur()) {
            return false;
        }
        int deplacementX = Math.abs(pieceX - this.getCoordonneesX());
        int deplacementY = pieceY - this.getCoordonneesY();
        if (deplacementX == 1 && deplacementY == 1) {
            return true;
        }
        return false;
    }
}
