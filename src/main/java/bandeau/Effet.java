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
public abstract class Effet {

    Bandeau bandeau;
    public String message;
    public int repetition;

    public Effet(Bandeau bd, String msg, int rep) {
        this.bandeau = bd;
        this.message = msg;
        this.repetition = rep;
    }

    public abstract void play();

}
