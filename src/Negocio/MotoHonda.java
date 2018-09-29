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
public class MotoHonda extends MotoBuilder{

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(25145);
        motor.setPotencia("7,8 HP");
        moto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        moto.setModelo("Navi");
    }

    @Override
    public void buildMarca() {
        moto.setMarca("Honda");
    }
    
}
