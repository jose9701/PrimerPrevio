/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author josea
 */
public class Prueba {
    public static void main(String[] args) {
        Concesionario con= new Concesionario();
        String construir="moto";
        String tipo="YaMaHa";
        if(construir.equalsIgnoreCase("carro")){
            if(tipo.equalsIgnoreCase("fiat")){
                con.ConstruirAuto(tipo);
            }else{
                con.ConstruirAuto(tipo);
            }
        }else{
            
            if(tipo.equalsIgnoreCase("Honda")){
                con.ConstruirMoto(tipo);
            }else{
                con.ConstruirMoto(tipo);
            }
        }
        
    }
}
