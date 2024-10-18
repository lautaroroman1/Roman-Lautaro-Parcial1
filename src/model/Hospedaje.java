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
public class Hospedaje extends Servicio {
    
    private String hospedaje;
    private double precioPorNoche;

    public Hospedaje(String hospedaje, double precioPorNoche, String codServicio, double porcentajeDescuento, boolean enPromocion, LocalDate fecha) {
        super(codServicio, porcentajeDescuento, enPromocion, fecha);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }

    public String getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(String hospedaje) {
        this.hospedaje = hospedaje;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = precioPorNoche;
        if (fecha.getDayOfWeek().getValue() != 6 && fecha.getDayOfWeek().getValue() != 7 && enPromocion){
            precioFinal -= (precioFinal * (porcentajeDescuento / 100));
        }
        
        return precioFinal;
    }

    //Sobreescribí el método toString para que sean visibles los atributos de las instancias a la hora de imprimirlos.
    @Override
    public String toString() {
        return "Hospedaje{" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + ", hospedaje=" + hospedaje + ", precioPorNoche=" + precioPorNoche + '}';
    }

    
    
}
