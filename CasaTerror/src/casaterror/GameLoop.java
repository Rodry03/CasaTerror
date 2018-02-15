/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casaterror;

/**
 *
 * @author Trinitarios
 */
public class GameLoop {

    public GameLoop() {
        while (!fin) {
            //Mostramos la informacion al jugador
            System.out.println(habitaciones[habActual].getDesc());
            // Mostramos si hay algún objeto
            for (int i = 1; i <= objetos.length; i++) {
                if (objetos[i].getHab() == habActual) {
                     System.out.println("También puedes ver ");
                    // mostramos la descripción del objeto según su estado
                    if (objetos[i].getEstado() == 1) {
                         System.out.println(objetos[i].getDesc1());
                    } else {
                         System.out.println(objetos[i].getDesc2());
                    }
                }
            }

            // Leemos la entrada del jugador
            // Procesamos la entrada del jugador
        }
    }
    
}
