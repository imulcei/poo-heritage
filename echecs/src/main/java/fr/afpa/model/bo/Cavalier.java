package fr.afpa.model.bo;

public class Cavalier extends PieceEchecs {
    private String nom;

    public Cavalier(int coordonneesX, int coordonneesY, Couleur couleur, String nom) throws Exception {
        super(coordonneesX, coordonneesY, couleur);
        this.nom = nom;
    }

    /**
     * Permet de déterminer sur quelles cases le Cavalier peut aller
     * 
     * @param xD Coordonnées en x
     * @param yD Coordonnées en y
     * @return Renvoie vrai si le Cavalier peut aller sur la case et faux si non
     */
    public boolean peutAllerA(int xD, int yD) {
        // ici les deux variable permettent un déplacement dans toutes les directions
        // avec Math.abs
        int deplacementX = Math.abs(xD - this.getCoordonneesX());
        int deplacementY = Math.abs(yD - this.getCoordonneesY());
        if (deplacementX == 2 && deplacementY == 1 || deplacementX == 1 && deplacementY == 2) {
            return true;
        } else {
            return false;
        }
    }
}
