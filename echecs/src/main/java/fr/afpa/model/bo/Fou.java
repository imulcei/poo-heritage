package fr.afpa.model.bo;

public class Fou extends PieceEchecs {
    private String nom;

    public Fou(int coordonneesX, int coordonneesY, Couleur couleur, String nom) throws Exception {
        super(coordonneesX, coordonneesY, couleur);
        this.nom = nom;
    }

    /**
     * Permet de déterminer sur quelles cases le Fou peut aller
     * 
     * @param xD Coordonnées en x
     * @param yD Coordonnées en y
     * @return Renvoie vrai si le Fou peut aller sur la case et faux si non
     */
    public boolean peutAllerA(int xD, int yD) {
        // ici les deux variable permettent un déplacement en diagonale avec Math.abs
        int deplacementX = Math.abs(xD - this.getCoordonneesX());
        int deplacementY = Math.abs(yD - this.getCoordonneesY());
        if (deplacementX == deplacementY) {
            return true;
        } else {
            return false;
        }
    }
}
