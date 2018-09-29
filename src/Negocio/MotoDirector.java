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
public class MotoDirector {
    private MotoBuilder motobuilder;
    public void constructMoto(){
        motobuilder.crearMoto();
        motobuilder.buildMarca();
        motobuilder.buildModelo();
        motobuilder.buildMotor();
        
    }

    public MotoBuilder getMotobuilder() {
        return motobuilder;
    }

    public void setMotobuilder(MotoBuilder ab) {
        this.motobuilder = ab;
    }
    public Moto getMoto(){
        return motobuilder.getMoto();
    }
}
