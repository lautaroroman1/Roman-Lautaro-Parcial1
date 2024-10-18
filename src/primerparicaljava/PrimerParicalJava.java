/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparicaljava;

import java.time.LocalDate;
import model.Gastronomia;
import model.Hospedaje;
import model.Sistema;

/**
 *
 * @author lauti
 */
public class PrimerParicalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PRUEBAS DE CREACIÓN ---------------");
        System.out.println("Test 1-1:");
        try{
            Gastronomia gast1 = new Gastronomia("Hamburguesa", 180.0, 4, "4892", 15.0, true, LocalDate.now());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Test 1-2:");
        try{
            Gastronomia gast2 = new Gastronomia("Hamburguesa criolla", 180.0, 4, "489235", 15.0, true, LocalDate.now());
            System.out.println("CREADO.");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Test 1-3:");
        try{
            Hospedaje hosp1 = new Hospedaje("Cabaña 3 personas", 1500.0, "2872", 10.0, true, LocalDate.now());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Test 1-4:");
        try{
            Hospedaje hosp2 = new Hospedaje("Cabaña 3 personas", 1500.0, "287282", 10.0, true, LocalDate.now());
            System.out.println("CREADO.");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("CALCULO DE PRECIOS FINALES ---------------");
        System.out.println("Test 2-1:");
        try{
            Gastronomia gast3 = new Gastronomia("Hamburguesa criolla", 180.0, 4, "489235", 15.0, true, LocalDate.parse("2020-10-28"));
            System.out.println(gast3.calcularPrecioFinal());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Test 2-2:");
        try{
            Hospedaje hosp3 = new Hospedaje("Cabaña 3 personas", 1500.0, "287282", 10.0, true, LocalDate.parse("2020-10-28"));
            System.out.println(hosp3.calcularPrecioFinal());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("AGREGAR SERVICIOS ---------------");
        System.out.println("Test 3:");
        try{
            Sistema sys = new Sistema();
            
            sys.agregarGastronomia("858927", 15.0, true, "Milanesa con pure", 350.0, 3, LocalDate.now());
            sys.agregarGastronomia("182835", 20.0, false, "Gaseosa", 120.0, 3, LocalDate.now());
            sys.agregarHospedaje("489259", 10.0, true, "Habitacion triple", 2200.0, LocalDate.parse("2020-10-18"));
            sys.agregarHospedaje("758972", 15.0, false, "Habitacion simple", 1000.0, LocalDate.parse("2020-10-18"));
            sys.mostrarLista();

            System.out.println("CONSULTAS DE SERVICIOS ---------------");
            System.out.println("Test 4-1:");
            System.out.println(sys.traerServicio(true));
            
            System.out.println("Test 4-2:");
            System.out.println(sys.traerServicio(true, LocalDate.parse("2020-10-18")));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
