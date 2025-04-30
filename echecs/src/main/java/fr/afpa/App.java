package fr.afpa;

import fr.afpa.model.bo.Cavalier;
import fr.afpa.model.bo.Couleur;
import fr.afpa.model.bo.Fou;
import fr.afpa.model.bo.PieceEchecs;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            PieceEchecs[] pieces = new PieceEchecs[4];
            pieces[0] = new Cavalier(2, 1, Couleur.NOIR, "Cavalier");
            pieces[1] = new Fou(2, 2, Couleur.BLANC, "Fou");
            pieces[2] = new Cavalier(4, 3, Couleur.NOIR, "Cavalier");
            pieces[3] = new Fou(7, 1, Couleur.BLANC, "Fou");

            for (int i = 0; i < pieces.length; i++) {
                if (pieces[i] instanceof Cavalier) {
                    Cavalier cavalier = (Cavalier) pieces[i];
                    System.out.println(cavalier.peutAllerA(5, 5));
                }
                if (pieces[i] instanceof Fou) {
                    Fou fou = (Fou) pieces[i];
                    System.out.println(fou.peutAllerA(5, 5));
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
