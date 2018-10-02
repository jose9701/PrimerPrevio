/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author josea
 */
public class Vender {
    
    private int totalPagarCarros;
    private int totalPagarMotos;
    private int totalMotos;
    private int totalCarros;
    private ArrayList< Auto> au;
    private ArrayList<Moto> mo;

    public Vender() {
        au= new ArrayList<>();
        mo=new ArrayList<>();
    }
    
    public void ventas(String tipo,String marca,int precio,int cantPuertas,String modelo,String potencia){
        if(tipo.equalsIgnoreCase("carro"))
             venderAuto(marca,cantPuertas, modelo, precio,potencia);
        else
            venderMoto(precio,marca, modelo,potencia);
    }
    private void venderAuto(String marca, int cantPuertas, String modelo,  int precio, String cilindraje){
        Auto au= new Auto();
        Motor mo=new Motor();
        mo.setNumero(232323);
        mo.setPotencia(cilindraje);
        au.setCantidadDePuertas(cantPuertas);
        au.setMarca(marca);
        au.setModelo(modelo);
        au.setPrecio(precio);
        au.setMotor(mo);
        this.au.add(au);
    }
    private void venderMoto(int precio,String marca,String modelo,String cilindraje){
        Moto moto=new Moto();
        Motor mo=new Motor();
        moto.setMarca(marca);
        moto.setModelo(modelo);
        moto.setPrecio(precio);
        mo.setNumero(232323);
        mo.setPotencia(cilindraje);
        moto.setMotor(mo);
        this.mo.add(moto);
    }
    public int totalAPagar(){
        totalPagarMotos=recorrerMotos();
        totalPagarCarros=recorrerCarros();
        return totalPagarMotos+totalPagarCarros;
    }
    public int recorrerMotos(){
        int total=0;
        for (Moto m:mo){
        total+=m.getPrecio();
        totalMotos++;
    }
        return total;
    }
    public int recorrerCarros(){
        int total=0;
        for (Auto m:au){
        total+=m.getPrecio();
        totalCarros++;
    }
        return total;
    }

    public int getTotalMotos() {
        return totalMotos;
    }

    public void setTotalMotos(int totalMotos) {
        this.totalMotos = totalMotos;
    }

    public int getTotalCarros() {
        return totalCarros;
    }

    public void setTotalCarros(int totalCarros) {
        this.totalCarros = totalCarros;
    }
    
}
