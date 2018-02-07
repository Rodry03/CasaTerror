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
public class Modelo {

    private Habitacion habitaciones[] = new Habitacion[10];

    public Modelo() {
        for (int i = 1; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion();
        }

        asignarPropiedades();
    }

    public void asignarPropiedades() {
        habitacion1();
        habitacion2();
        habitacion3();
        habitacion4();
        habitacion5();
        habitacion6();
        habitacion7();
        habitacion8();        
        habitacion9();


    }

    private void habitacion1() {
    }

    private void habitacion2() {
    }

    private void habitacion3() {
    }

    private void habitacion4() {
    }

    private void habitacion5() {
    }

    private void habitacion6() {
    }

    private void habitacion7() {
    }

    private void habitacion8() {
    }

    private void habitacion9() {
    }
}
