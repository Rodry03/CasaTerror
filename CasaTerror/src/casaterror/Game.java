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
public class Game {

    private Habitacion[] habitaciones = new Habitacion[10];
    private Objeto[] objetos=new Objeto[5];
    private static final int PERRO=1,LLAVE=2,ESCALERA=3,HUESO=4;

    public Game() {
        for (int i = 0; i < objetos.length; i++) {
            objetos[i]=new Objeto();
        }
        for (int i = 1; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion();
        }
        asignarObjetos();
        asignarHabitaciones();
        new GameLoop(habitaciones,objetos);

    }
    
    private void asignarObjetos() {
        objetoPerro();
        objetoLlave();
        objtoEscalera();
        objetoHueso();
    }

    public void asignarHabitaciones() {
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
        habitaciones[1].setDesc("Estas en la habitacion 1");
        habitaciones[1].setEste(0);
        habitaciones[1].setOeste(0);
        habitaciones[1].setNorte(0);
        habitaciones[1].setSur(4);

    }

    private void habitacion2() {
        habitaciones[2].setDesc("Estas en la habitacion 2.");
        habitaciones[2].setEste(0);
        habitaciones[2].setOeste(0);
        habitaciones[2].setNorte(0);
        habitaciones[2].setSur(5);
    }

    private void habitacion3() {
        habitaciones[3].setDesc("Estas en la habitacion 3.");
        habitaciones[3].setEste(0);
        habitaciones[3].setOeste(0);
        habitaciones[3].setNorte(0);
        habitaciones[3].setSur(6);
    }

    private void habitacion4() {
        habitaciones[4].setDesc("Estas en la habitacion 4. No hay nada.");
        habitaciones[4].setEste(5);
        habitaciones[4].setOeste(0);
        habitaciones[4].setNorte(1);
        habitaciones[4].setSur(7);
    }

    private void habitacion5() {
        habitaciones[5].setDesc("Estas en la habitacion 5. No hay nada.");
        habitaciones[5].setEste(6);
        habitaciones[5].setOeste(4);
        habitaciones[5].setNorte(2);
        habitaciones[5].setSur(8);
    }

    private void habitacion6() {
        habitaciones[6].setDesc("Estas en la habitacion 6. No hay nada.");
        habitaciones[6].setEste(0);
        habitaciones[6].setOeste(5);
        habitaciones[6].setNorte(3);
        habitaciones[6].setSur(9);
    }

    private void habitacion7() {
        habitaciones[7].setDesc("Estas en la habitacion 7. El baño, por si necesitas hacer un pis.");
        habitaciones[7].setEste(0);
        habitaciones[7].setOeste(0);
        habitaciones[7].setNorte(4);
        habitaciones[7].setSur(0);
    }

    private void habitacion8() {
        habitaciones[8].setDesc("Estas en la habitacion 8. La salida esta aqui.");
        habitaciones[8].setEste(0);
        habitaciones[8].setOeste(0);
        habitaciones[8].setNorte(5);
        habitaciones[8].setSur(0);
    }

    private void habitacion9() {
        habitaciones[9].setDesc("Estas en la habitacion 9.");
        habitaciones[9].setEste(0);
        habitaciones[9].setOeste(0);
        habitaciones[9].setNorte(6);
        habitaciones[9].setSur(0);
    }

    private void objetoPerro() {
        objetos[PERRO].setEstado(1);
        objetos[PERRO].setDesc1("Un perro rabioso");
        objetos[PERRO].setDesc2("Un perro comiéndose un hueso");
        objetos[PERRO].setHab(9);
        objetos[PERRO].setLotengo(0);
    }

    private void objetoHueso() {
        objetos[HUESO].setEstado(1);
        objetos[HUESO].setDesc1("Un hueso");
        objetos[HUESO].setDesc2("");
        objetos[HUESO].setHab(2);
        objetos[HUESO].setLotengo(0);
    }

    private void objetoLlave() {
        objetos[LLAVE].setEstado(1);
        objetos[LLAVE].setDesc1("Una llave");
        objetos[LLAVE].setDesc2("");
        objetos[LLAVE].setHab(3);
        objetos[LLAVE].setLotengo(0);
    }

    private void objtoEscalera() {
        objetos[ESCALERA].setEstado(1);
        objetos[ESCALERA].setDesc1("Una escalera");
        objetos[ESCALERA].setDesc2("");
        objetos[ESCALERA].setHab(9);
        objetos[ESCALERA].setLotengo(0);
    }

    public static int getPERRO() {
        return PERRO;
    }

    public static int getLLAVE() {
        return LLAVE;
    }

    public static int getESCALERA() {
        return ESCALERA;
    }

    public static int getHUESO() {
        return HUESO;
    }

    
}
