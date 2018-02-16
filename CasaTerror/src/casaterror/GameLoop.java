/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casaterror;

import java.util.Scanner;

/**
 *
 * @author Trinitarios
 */
public class GameLoop {

    private Habitacion[] habitaciones;
    private Objeto[] objetos;
    private boolean fin = false;
    private int habActual = 1;
    private Scanner in = new Scanner(System.in);
    private String accion, nombre;
    private int completada;

    public GameLoop(Habitacion[] habitaciones, Objeto[] objetos) {
        this.habitaciones = habitaciones;
        this.objetos = objetos;
        while (!fin) {
            jugar();
        }
    }

    private void jugar() {
        //Mostramos la informacion al jugador
        System.out.println(habitaciones[habActual].getDesc());
        // Mostramos si hay algún objeto
        for (int i = 1; i <= objetos.length-1; i++) {
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
        System.out.println("Puedes ir dirección ");
        if (habitaciones[habActual].getNorte() != 0) {
            System.out.println("Norte ");
        }
        if (habitaciones[habActual].getSur() != 0) {
            System.out.println("Sur ");
        }
        if (habitaciones[habActual].getEste() != 0) {
            System.out.println("Este ");
        }
        if (habitaciones[habActual].getOeste() != 0) {
            System.out.println("Oeste ");
        }

        // Leemos la entrada del jugador
        System.out.println("Indica la accion ");
        accion = in.next();
        nombre = in.next();

        // Procesamos la entrada del jugador
        switch (accion) {
            case "coger":
                completada = 0;
                // Hueso
                if (nombre.equals("hueso") && objetos[Game.getHUESO()].getHab() == habActual) {
                    completada = 1;
                    objetos[Game.getHUESO()].setHab(0);
                    objetos[Game.getHUESO()].setLotengo(1);
                    System.out.println("Has cogido el hueso.");
                }   // Escalera
                if (nombre.equals("escalera") && objetos[Game.getESCALERA()].getHab() == habActual && objetos[Game.getPERRO()].getEstado() == 0) {
                    completada = 1;
                    objetos[Game.getESCALERA()].setHab(0);
                    objetos[Game.getESCALERA()].setLotengo(1);
                    objetos[Game.getLLAVE()].setEstado(0);
                    System.out.println("Has cogido la escalera.");
                }   //Llave
                if (nombre.equals("llave") && objetos[Game.getLLAVE()].getHab() == habActual && objetos[Game.getESCALERA()].getLotengo() == 1) {
                    completada = 1;
                    objetos[Game.getLLAVE()].setHab(0);
                    objetos[Game.getLLAVE()].setLotengo(1);
                    System.out.println("Has cogido la llave.");
                }   break;
            case "usar":
                if (nombre.equals("llave") && objetos[Game.getLLAVE()].getLotengo()== 1) {
                    completada = 1;
                    fin = true;
                    System.out.println("Has conseguido salir");
                }   break;
            case "ir":
                //
                switch (nombre) {
                    case "norte":
                        if(habitaciones[habActual].getNorte()!=0){
                            habActual=habitaciones[habActual].getNorte();
                        }
                        break;
                    case "este":
                        if(habitaciones[habActual].getEste()!=0){
                            habActual=habitaciones[habActual].getEste();
                        }
                        break;
                    case "oeste":
                        if(habitaciones[habActual].getOeste()!=0){
                            habActual=habitaciones[habActual].getOeste();
                        }
                        break;
                    case "sur":
                        if(habitaciones[habActual].getSur()!=0){
                            habActual=habitaciones[habActual].getSur();
                        }
                        break;
                    default:
                        System.out.println("No existe esa direccion");
                        break;
                }   break;
            case "dar":
                if (nombre.equals("hueso") && objetos[Game.getPERRO()].getHab() == habActual) {
                    completada = 1;
                    objetos[Game.getPERRO()].setEstado(0);
                    System.out.println("El perro se ha tranquilizado");
                }   break;
            default:
                System.out.println("Accion incorrecta");
                break;
        }
    }

}
