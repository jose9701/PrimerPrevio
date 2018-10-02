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
public class VenderFacade {
    private Vender ven;

    public VenderFacade() {
        ven=new Vender();
    }
    public void vender(String tipo,int precio,String marca,int cantPuertas,String modelo, String potencia){
        ven.ventas(tipo, marca,precio,cantPuertas,modelo,potencia);
    }
    public int totalVenta(){
        return ven.totalAPagar();
    }
    public int cantCarros(){
        return ven.getTotalCarros();
    }
    public int cantMotos(){
        return ven.getTotalMotos();
    }
    
}
