/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author Yann
 */
public class Couleur extends Effet {

    public Couleur(Bandeau bd, String msg, int rep) {
        super(bd, msg, rep);
    }

    @Override
    public void play() {
        bandeau.setMessage(this.message);
        for (int r = 0; r < this.repetition; r++) {
            for (int i = 0; i <= 10; i++) {
                bandeau.setForeground(Color.BLUE);
                bandeau.sleep(100);
                bandeau.setForeground(Color.YELLOW);
                bandeau.sleep(100);
                bandeau.setForeground(Color.RED);
                bandeau.sleep(100);
                bandeau.setForeground(Color.GREEN);
                bandeau.sleep(100);
                bandeau.setForeground(Color.ORANGE);
                bandeau.sleep(100);
            }

        }

    }
}
