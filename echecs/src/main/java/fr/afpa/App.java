package fr.afpa;

import fr.afpa.model.bo.Cavalier;
import fr.afpa.model.bo.Couleur;
import fr.afpa.model.bo.Fou;
import fr.afpa.model.bo.PieceEchecs;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            PieceEchecs piece = new PieceEchecs(1, 4, Couleur.NOIR);
            System.out.println(piece.getCouleurCase());

            Cavalier cavalier = new Cavalier(2, 4, Couleur.BLANC, "Gerard");
            System.out.println(cavalier.peutAllerA(4, 3));

            Fou fou = new Fou(6, 4, Couleur.BLANC, "Michel");
            System.out.println(fou.peutAllerA(4, 5));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
