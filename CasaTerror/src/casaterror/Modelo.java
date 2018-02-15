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

    private Habitacion[] habitaciones = new Habitacion[10];
    private Objeto[] objetos=new Objeto[5];
    private static final int PERRO=1,LLAVE=2,ESCALERA=3,HUESO=4;
    private boolean fin=false;
    private int habActual=1;

    public Modelo() {
        for (int i = 0; i < objetos.length; i++) {
            objetos[i]=new Objeto();
        }
        for (int i = 1; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion();
        }
        asignarObjetos();
        asignarHabitaciones();
        

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
        habitaciones[1].setDesc("Estas en la habitacion 2. Hay un hueso.");
        habitaciones[1].setEste(0);
        habitaciones[1].setOeste(0);
        habitaciones[1].setNorte(0);
        habitaciones[1].setSur(5);
    }

    private void habitacion3() {
        habitaciones[1].setDesc("Estas en la habitacion 3. Hay una llave.");
        habitaciones[1].setEste(0);
        habitaciones[1].setOeste(0);
        habitaciones[1].setNorte(0);
        habitaciones[1].setSur(6);
    }

    private void habitacion4() {
        habitaciones[1].setDesc("Estas en la habitacion 4. No hay nada.");
        habitaciones[1].setEste(5);
        habitaciones[1].setOeste(0);
        habitaciones[1].setNorte(1);
        habitaciones[1].setSur(7);
    }

    private void habitacion5() {
        habitaciones[1].setDesc("Estas en la habitacion 5. No hay nada.");
        habitaciones[1].setEste(6);
        habitaciones[1].setOeste(4);
        habitaciones[1].setNorte(5);
        habitaciones[1].setSur(8);
    }

    private void habitacion6() {
        habitaciones[1].setDesc("Estas en la habitacion 6. No hay nada.");
        habitaciones[1].setEste(0);
        habitaciones[1].setOeste(5);
        habitaciones[1].setNorte(3);
        habitaciones[1].setSur(9);
    }

    private void habitacion7() {
        habitaciones[1].setDesc("Estas en la habitacion 7. El baño, por si necesitas hacer un pis.");
        habitaciones[1].setEste(0);
        habitaciones[1].setOeste(0);
        habitaciones[1].setNorte(4);
        habitaciones[1].setSur(0);
    }

    private void habitacion8() {
        habitaciones[1].setDesc("Estas en la habitacion 8. La salida esta aqui.");
        habitaciones[1].setEste(0);
        habitaciones[1].setOeste(0);
        habitaciones[1].setNorte(5);
        habitaciones[1].setSur(13);
    }

    private void habitacion9() {
        habitaciones[1].setDesc("Estas en la habitacion 9. Hay un perro que muerde. Una escalera para subir.");
        habitaciones[1].setEste(0);
        habitaciones[1].setOeste(0);
        habitaciones[1].setNorte(6);
        habitaciones[1].setSur(0);
    }

    private void objetoPerro() {
        objetos[PERRO].setEstado(1);
        objetos[PERRO].setDesc1("un perro rabioso");
        objetos[PERRO].setDesc2("un perro comiéndose un hueso");
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

    
}
