package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        Jugador objetoJugador = new Jugador();

        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        int opcion=0;


        do {
            System.out.println("1. Agregar Jugador \n2. Buscar Jugador \n3. Editar Informacion de Jugador \n4. Mostrar Convocatoria \n5. SALIR");
            opcion = entradaDatos.nextInt();

            switch (opcion){
                case 1:

                    System.out.print("Ingrese los datos del juegador que desea ingresar \n*************************************: ");
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

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:
                    break;

            }
        }while (opcion != 5);



    }
}