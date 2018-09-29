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
public class AutoDirector {
    private AutoBuilder autobuilder;
    public void constructAuto(){
        autobuilder.crearAuto();
        autobuilder.buildMarca();
        autobuilder.buildModelo();
        autobuilder.buildMotor();
        autobuilder.buildPuertas();
    }

    public AutoBuilder getAutobuilder() {
        return autobuilder;
    }

    public void setAutobuilder(AutoBuilder ab) {
        this.autobuilder = ab;
    }
    public Auto getAuto(){
        return autobuilder.getAuto();
    }
}
