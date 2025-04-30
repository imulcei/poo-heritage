package fr.afpa.model.bo;

public abstract class PieceEchecs {
    private int coordonneesX;
    private int coordonneesY;
    private Couleur couleur;

    public PieceEchecs(int coordonneesX, int coordonneesY, Couleur couleur) throws Exception {
        this.setCoordonneesX(coordonneesX);
        this.setCoordonneesY(coordonneesY);
        this.setCouleur(couleur);
    }

    public int getCoordonneesX() {
        return coordonneesX;
    }

    public void setCoordonneesX(int coordonneesX) throws Exception {
        if (coordonneesX >= 1 && coordonneesX <= 8) {
            this.coordonneesX = coordonneesX;
        } else {
            throw new Exception("Les coordonnées doivent être comprises entre 1 et 8");
        }
    }

    public int getCoordonneesY() {
        return coordonneesY;
    }

    public void setCoordonneesY(int coordonneesY) throws Exception {
        if (coordonneesY >= 1 && coordonneesY <= 8) {
            this.coordonneesY = coordonneesY;
        } else {
            throw new Exception("Les coordonnées doivent être comprises entre 1 et 8");
        }
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) throws Exception {
        if (couleur == Couleur.BLANC || couleur == Couleur.NOIR) {
            this.couleur = couleur;
        } else {
            throw new Exception("La couleur doit être BLANC ou NOIR.");
        }
    }

    // Pourquoi ne prends tu pas directement coordonneeX et coordonneeY ?
    // Comme tu utilises l'ENUM, tu peux renvoyer directement la couleur BLANC ou
    // NOIR au lieu du int
    /**
     * Permet de renvoyer la couleur de la case sur laquelle se trouve la pièce
     * 
     * @return Renvoie 1 pour une case blanche et 2 pour une case noire
     */
    public int getCouleurCase() {
        int x = Math.min(Math.max(getCoordonneesX(), 1), 8);
        int y = Math.min(Math.max(getCoordonneesY(), 1), 8);
        int couleurCase;
        if ((x + y) % 2 == 0) {
            couleurCase = 2;
        } else {
            couleurCase = 1;
        }
        return couleurCase;
    }

    /**
     * Vérifie si la position passée en paramètre fait partie de l'échiquier
     * 
     * @param x Position en x
     * @param y Position en y
     * @return Renvoie vrai si la position passée en paramètre fait partie de
     *         l'échiquier
     */
    public boolean estDansLEchiquier(int x, int y) {
        if (x >= 1 || y <= 8) {
            return true;
        } else {
            return false;
        }
    }

    public abstract boolean peutAllerA(int x, int y);

    public abstract boolean peutManger(PieceEchecs piece);
}
