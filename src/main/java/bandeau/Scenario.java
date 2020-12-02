/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;

/**
 *
 * @author Yann
 */
public class Scenario {

    private Bandeau bd;
    private ArrayList<Effet> effets;

    public Scenario(Bandeau bd) {
        this.bd = bd;
        this.effets = new ArrayList<>();
    }

    public void playEffets() {
        for (Effet e : effets) {
            e.play();
            bd.sleep(500);
        }
        bd.sleep(3000);
        bd.close();
    }

    public void addEffet(Effet eff) {

        this.effets.add(eff);
    }

}
