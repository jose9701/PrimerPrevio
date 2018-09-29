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
        ConcesionarioFacade con= new ConcesionarioFacade();
        con.ConstruirAuto("fiat");
        con.ConstruirAuto("ford");
    }
}
