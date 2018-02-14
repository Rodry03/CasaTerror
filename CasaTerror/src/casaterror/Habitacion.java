/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casaterror;

/**
 *
 * @author rodry
 */
public class Habitacion {
    private String desc;
    private int norte, sur, este, oeste;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNorte(int norte) {
        this.norte = norte;
    }

    public void setSur(int sur) {
        this.sur = sur;
    }

    public void setEste(int este) {
        this.este = este;
    }

    public void setOeste(int oeste) {
        this.oeste = oeste;
    }

    public String getDesc() {
        return desc;
    }

    public int getNorte() {
        return norte;
    }

    public int getSur() {
        return sur;
    }

    public int getEste() {
        return este;
    }

    public int getOeste() {
        return oeste;
    }
    
    
}
