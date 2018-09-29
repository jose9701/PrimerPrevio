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
public class ConcesionarioFacade {
    AutoDirector au;
    public ConcesionarioFacade() {
        au = new AutoDirector();
    }
    public void ConstruirAuto(String auto) {
        if (auto.equalsIgnoreCase("fiat")) {
            au.setAutobuilder(new AutoFiat());
            au.constructAuto();
            System.out.println("se creo el auto fiat");
        } else {
            au.setAutobuilder(new AutoFord());
            au.constructAuto();
            System.out.println("se creo el carro ford");
        }
    }
}
