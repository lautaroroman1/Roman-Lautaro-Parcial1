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
public abstract class Servicio {
    
    protected String codServicio;
    protected double porcentajeDescuento;
    protected boolean enPromocion;
    protected LocalDate fecha;

    public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion, LocalDate fecha) {
        if (codServicio.length() != 6){
            throw new IllegalArgumentException("El codigo de servicio debe contener 7 caracteres.");
        }
        this.codServicio = codServicio;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
        this.fecha = fecha;
    }
    
    public String getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(String codServicio) {
        if (codServicio.length() != 6){
            throw new IllegalArgumentException("El codigo de servicio debe contener 7 caracteres.");
        }
        this.codServicio = codServicio;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    public abstract double calcularPrecioFinal();
    
    
}
