/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lauti
 */
public class Sistema {
    private List<Servicio> lstServicio;

    public Sistema() {
        this.lstServicio = new ArrayList<>();
    }

    public List<Servicio> getLstServicio() {
        return lstServicio;
    }
    
    public void mostrarLista(){
        for (Servicio servicio: lstServicio){
            System.out.println(servicio);
        }
    }
    
    public Servicio traerServicio(String codServicio) throws Exception{
        for (Servicio servicio: lstServicio){
            if (servicio.getCodServicio().equals(codServicio)){
                return servicio;
            }
        }
        
        return null;
    }
    
    public List<Servicio> traerServicio(boolean enPromocion){
        List<Servicio> listaFiltrada = new ArrayList<>();
        
        for (Servicio servicio: lstServicio){
            if (servicio.isEnPromocion() == enPromocion){
                listaFiltrada.add(servicio);
            }
        }
        
        return listaFiltrada;
    }
    
    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia){
        List<Servicio> listaFiltrada = new ArrayList<>();
        for (Servicio servicio: lstServicio){
            if(servicio.isEnPromocion() == enPromocion && servicio.getFecha().equals(dia)){
                listaFiltrada.add(servicio);
            }
        }
        
        return listaFiltrada;
    }
    
    public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDesc, LocalDate fecha) throws Exception{
        if (traerServicio(codServicio) != null){
            throw new Exception("Ya existe un servicio con ese código.");
        }
        lstServicio.add(new Gastronomia(gastronomia, precio, diaSemDesc, codServicio, porcentajeDescuento, enPromocion, fecha));
        return true;
    }
    
    public boolean agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche, LocalDate fecha) throws Exception{
        if (traerServicio(codServicio) != null){
            throw new Exception("Ya existe un servicio con ese código.");
        }
        
        lstServicio.add(new Hospedaje(hospedaje, precioPorNoche, codServicio, porcentajeDescuento, enPromocion, fecha));
        return true;
    }

    @Override
    public String toString() {
        return "Sistema{" + "lstServicio=" + lstServicio + '}';
    }
    
    
}
