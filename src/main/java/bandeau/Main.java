/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author Yann
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Bandeau bd = new Bandeau();

        Scenario sn = new Scenario(bd);

        sn.addEffet(new Clignote(bd, "clignote", 2));
        sn.addEffet(new Couleur(bd, "couleur", 2));
        sn.addEffet(new Rotation(bd, "tourne", 2));
        sn.playEffets();
    }
}
