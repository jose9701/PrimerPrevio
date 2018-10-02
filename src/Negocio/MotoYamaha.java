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
public class MotoYamaha extends MotoBuilder{

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(25190);
        motor.setPotencia("14,1 HP");
        moto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        moto.setModelo("NMAX 125");
    }

    @Override
    public void buildMarca() {
        moto.setMarca("YAMAHA");
    }

    @Override
    public void buidPrecio() {
        moto.setPrecio(15000000);
    }
}
