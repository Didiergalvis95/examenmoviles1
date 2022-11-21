package org.example.clases;

public class Jugador {

    public String nombre, apellido, posicion, equipoDondeJuega;
    public int numeroCamiseta, edad;


    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, String equipoDondeJuega, int numeroCamiseta, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.equipoDondeJuega = equipoDondeJuega;
        this.numeroCamiseta = numeroCamiseta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipoDondeJuega() {
        return equipoDondeJuega;
    }

    public void setEquipoDondeJuega(String equipoDondeJuega) {
        this.equipoDondeJuega = equipoDondeJuega;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
