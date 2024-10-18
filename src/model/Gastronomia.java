/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author lauti
 */
public class Gastronomia extends Servicio {
    private String gastronomia;
    private double precio;
    private int diaSemDesc;

    public Gastronomia(String gastronomia, double precio, int diaSemDesc, String codServicio, double porcentajeDescuento, boolean enPromocion, LocalDate fecha) {
        super(codServicio, porcentajeDescuento, enPromocion, fecha);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }

    

    public String getGastronomia() {
        return gastronomia;
    }

    public void setGastronomia(String gastronomia) {
        this.gastronomia = gastronomia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDiaSemDesc() {
        return diaSemDesc;
    }

    public void setDiaSemDesc(int diaSemDesc) {
        this.diaSemDesc = diaSemDesc;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = precio;
        if (fecha.getDayOfWeek().getValue() == diaSemDesc && enPromocion){
            precioFinal -= (precioFinal * (porcentajeDescuento / 100));
        }
        
        return precioFinal;
    }

    //Sobreescribí el método toString para que sean visibles los atributos de las instancias a la hora de imprimirlos.
    @Override
    public String toString() {
        return "Gastronomia{" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + ", gastronomia=" + gastronomia + ", precio=" + precio + ", diaSemDesc=" + diaSemDesc + '}';
    }    
    
}
