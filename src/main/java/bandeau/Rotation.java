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
public class Rotation extends Effet {

    public Rotation(Bandeau bd, String msg, int rep) {
        super(bd, msg, rep);
    }

    @Override
    public void play() {
        bandeau.setMessage(this.message);
        bandeau.setBackground(Color.BLACK);
        for (int r = 0; r < this.repetition; r++) {
            for (int i = 0; i <= 100; i++) {
                bandeau.setRotation(2 * Math.PI * i / 100);
                bandeau.sleep(25);
            }

        }

    }
}
