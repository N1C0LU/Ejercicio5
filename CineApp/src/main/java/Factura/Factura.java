/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura;

import Cliente.Cliente;

/**
 *
 * @author Nicolas Castaño
 */
public class Factura {
    private Cliente cliente;
    private String promotora;
    private String tipoFuncion;
    private int numBoletas;
    private double valorTotal;

    
    public Factura(Cliente cliente, String promotora, String tipoFuncion, int numBoletas) {
        this.cliente = cliente;
        this.promotora = promotora;
        this.tipoFuncion = tipoFuncion;
        this.numBoletas = numBoletas;
        this.valorTotal = calcularValor();
    }


    public Cliente getCliente() {
        return cliente;
    }

    public String getPromotora() {
        return promotora;
    }

    public String getTipoFuncion() {
        return tipoFuncion;
    }

    public int getNumBoletas() {
        return numBoletas;
    }

    public double getValorTotal() {
        return valorTotal;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPromotora(String promotora) {
        this.promotora = promotora;
    }

    public void setTipoFuncion(String tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }

    public void setNumBoletas(int numBoletas) {
        this.numBoletas = numBoletas;
        this.valorTotal = calcularValor(); 
    }


    private double calcularValor() {
        double precio = 0;

        if (promotora.equalsIgnoreCase("Cine Colombia")) {
            precio = tipoFuncion.equalsIgnoreCase("35mm") ? 8000 : 9500;
        } else if (promotora.equalsIgnoreCase("Royal Films")) {
            precio = tipoFuncion.equalsIgnoreCase("35mm") ? 6500 : 8500;
        }

        double total = precio * numBoletas;
        if (cliente.isTieneTarjeta()) {
            total *= 0.9; // 10% descuento
        }

        return total;
    }

    // toString
    public String toString() {
        return cliente.toString() +
               " | Promotora: " + promotora +
               " | Tipo: " + tipoFuncion +
               " | Boletas: " + numBoletas +
               " | Valor: $" + valorTotal;
    }
}



    

