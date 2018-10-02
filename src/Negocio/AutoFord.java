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
public class AutoFord extends AutoBuilder {
    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(212121);
        motor.setPotencia("20 HP");
        auto.setMotor(motor);
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(4);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Focus");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Ford");
    }

    @Override
    public void buidPrecio() {
        auto.setPrecio(40000000);
    }
}
