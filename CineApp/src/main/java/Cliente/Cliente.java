/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author Nicolas Castaño
 */
public class Cliente {
    private String nombre;
    private boolean tieneTarjeta;


    public Cliente(String nombre, boolean tieneTarjeta) {
        this.nombre = nombre;
        this.tieneTarjeta = tieneTarjeta;
    }


    public String getNombre() {
        return nombre;
    }

    public boolean isTieneTarjeta() {
        return tieneTarjeta;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTieneTarjeta(boolean tieneTarjeta) {
        this.tieneTarjeta = tieneTarjeta;
    }


    public String toString() {
        return "Cliente: " + nombre + " | Tarjeta: " + (tieneTarjeta ? "Sí" : "No");
    }
}


    

