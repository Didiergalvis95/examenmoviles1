package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        int opcion = 0, contadorJugadores = 0;

        do {
            System.out.print("***** Opciones de jugador ***** \n1. Agregar Jugador \n2. Buscar Jugador \n3. Editar Informacion de Jugador \n4. Mostrar Convocatoria \n5. SALIR \nDigite una opcion: ");
            opcion = entradaDatos.nextInt();

            switch (opcion){
                case 1:
                    Jugador objetoJugador = new Jugador();

                    if (contadorJugadores == 23){
                        System.out.print("LA CANTIDAD MAXIMA DE JUGADORES QUE PUEDE CONVOCAR SON 23!!!!!!");

                    }else {
                        System.out.println("***** Ingrese los datos del juegador que desea ingresar *****");
                        System.out.println("Este es el jugador numero " + (contadorJugadores + 1) + " para el equipo.");

                        System.out.print("Numero de camiseta: ");
                        objetoJugador.setNumeroCamiseta(entradaDatos.nextInt());
                        System.out.print("Nombre: ");
                        objetoJugador.setNombre(entradaDatos.next());
                        System.out.print("Apellido: ");
                        objetoJugador.setApellido(entradaDatos.next());
                        System.out.print("Posicion: ");
                        objetoJugador.setPosicion(entradaDatos.next());
                        System.out.print("Edad: ");
                        objetoJugador.setEdad(entradaDatos.nextInt());
                        System.out.print("Equipo Donde Juega: ");
                        objetoJugador.setEquipoDondeJuega(entradaDatos.next());

                        contadorJugadores++;

                        jugadores.add(objetoJugador);
                    }
                    System.out.println("");
                    break;

                case 2:
                    boolean convocados = false;

                    System.out.print("Ingrese el numero de camiseta del jugador que desea buscar: ");
                    int buscarJugador = entradaDatos.nextInt();

                    for (int i = 0; i < jugadores.size(); i++) {
                        Jugador convocado = jugadores.get(i);
                        if (Objects.equals(convocado.getNumeroCamiseta(), buscarJugador)){
                        System.out.println("El jugador esta convocado y se llama: " + convocado.getNombre());
                            convocados = false;
                            break;

                        }else {
                            convocados = true;

                        }
                    }

                    if (convocados){
                        System.out.println("no existe jugador con ese numero de camiseta!!!");
                    }
                    break;

                case 3:
                    convocados = false;
                    System.out.print("Ingrese el numero de camiseta del jugador que desea editar: ");
                    buscarJugador = entradaDatos.nextInt();

                    for (int i = 0; i < jugadores.size(); i++) {
                        Jugador convocado = jugadores.get(i);
                        if (Objects.equals(convocado.getNumeroCamiseta(), buscarJugador)){
                            System.out.println("El jugador esta convocado y se llama: " + convocado.getNombre());
                            System.out.print("Ingrese el nuevo numero de camiseta: ");
                            convocado.setNumeroCamiseta(entradaDatos.nextInt());
                            jugadores.get(i).setNumeroCamiseta(convocado.getNumeroCamiseta());
                            convocados = false;
                            break;

                        }else {
                            convocados = true;

                        }
                    }

                    if (convocados){
                        System.out.println("no existe jugador con ese numero de camiseta!!!");
                    }

                    break;

                case 4:
                    System.out.println("***** LOS JUGADORES CONVOCADOS SON *****");

                    for(int i=0; i < jugadores.size(); i++)
                        System.out.print(jugadores.get(i));
                    System.out.println("");
                    break;

                default:
                    System.out.println("INGRESE UNA OPCION VALIDA!!!!!");

                    break;

            }
        }while (opcion != 5);



    }
}