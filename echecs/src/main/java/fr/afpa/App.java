package fr.afpa;

import fr.afpa.model.bo.Cavalier;
import fr.afpa.model.bo.Couleur;
import fr.afpa.model.bo.Fou;
import fr.afpa.model.bo.PieceEchecs;
import fr.afpa.model.bo.Pion;
import fr.afpa.model.bo.Roi;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            PieceEchecs[] pieces = new PieceEchecs[5];
            pieces[0] = new Cavalier(2, 1, Couleur.NOIR);
            pieces[1] = new Fou(2, 2, Couleur.BLANC);
            pieces[2] = new Cavalier(4, 3, Couleur.NOIR);
            pieces[3] = new Fou(7, 1, Couleur.BLANC);
            pieces[4] = new Roi(5, 3, Couleur.BLANC);
            pieces[4] = new Pion(5, 1, Couleur.NOIR);

            for (int i = 0; i < pieces.length; i++) {
                if (pieces[i] instanceof Cavalier) {
                    Cavalier cavalier = (Cavalier) pieces[i];
                    System.out.println(cavalier.peutAllerA(5, 5));
                }
                if (pieces[i] instanceof Fou) {
                    Fou fou = (Fou) pieces[i];
                    System.out.println(fou.peutAllerA(5, 5));
                }
                if (pieces[i] instanceof Roi) {
                    Roi fou = (Roi) pieces[i];
                    System.out.println(fou.peutAllerA(4, 2));
                }
                if (pieces[i] instanceof Pion) {
                    Pion fou = (Pion) pieces[i];
                    System.out.println(fou.peutAllerA(5, 6));
                }
            }

            Cavalier cavalier = new Cavalier(3, 3, Couleur.BLANC);
            Roi roi = new Roi(4, 5, Couleur.NOIR);
            System.out.println(cavalier.peutManger(roi));

            Cavalier cavalier2 = new Cavalier(5, 3, Couleur.NOIR);
            Pion pion = new Pion(4, 2, Couleur.BLANC);
            System.out.println(pion.peutManger(cavalier2));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
