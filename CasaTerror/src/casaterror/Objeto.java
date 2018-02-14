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
public class Objeto {
    private int estado; // Estado del objeto
    private String desc1; // Descripción para estado 1
    private String desc2; // Descripción para estado 2
    private int hab; // Habitación en la que se encuentra
    private int lotengo; // Indica si tengo este objeto en mi inventario

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public void setLotengo(int lotengo) {
        this.lotengo = lotengo;
    }

    
}
