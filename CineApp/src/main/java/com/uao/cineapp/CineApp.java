/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.cineapp;
import Cliente.Cliente;
import Factura.Factura;
import javax.swing.JOptionPane;
/**
 *
 * @author Nicolas Castaño
 */
public class CineApp {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas a procesar:"));

        double totalCineColombia = 0, totalRoyalFilms = 0;
        int total35mm = 0, total3D = 0;

        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
            int tarjeta = JOptionPane.showConfirmDialog(null, "¿Tiene tarjeta de descuento?");
            boolean tieneTarjeta = (tarjeta == 0);
            Cliente cliente = new Cliente(nombre, tieneTarjeta);

            String promotora = JOptionPane.showInputDialog("Promotora (Cine Colombia / Royal Films):");
            String tipoFuncion = JOptionPane.showInputDialog("Tipo de función (35mm / 3D):");
            int numBoletas = Integer.parseInt(JOptionPane.showInputDialog("Número de boletas:"));

            Factura factura = new Factura(cliente, promotora, tipoFuncion, numBoletas);

            JOptionPane.showMessageDialog(null, factura.toString());

            // Acumular totales
            if (promotora.equalsIgnoreCase("Cine Colombia")) {
                totalCineColombia += factura.getValorTotal();
            } else {
                totalRoyalFilms += factura.getValorTotal();
            }

            if (tipoFuncion.equalsIgnoreCase("35mm")) {
                total35mm += numBoletas;
            } else {
                total3D += numBoletas;
            }
        }

        // Resumen final
        String resumen = "Total Cine Colombia: $" + totalCineColombia +
                         "\nTotal Royal Films: $" + totalRoyalFilms +
                         "\nFunción más vendida: " + (total35mm > total3D ? "35mm" : "3D");
        JOptionPane.showMessageDialog(null, resumen);
    }
}



