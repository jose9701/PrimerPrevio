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
    MotoDirector moto;
    public ConcesionarioFacade() {
        au = new AutoDirector();
        moto= new MotoDirector();
    }
    public void ConstruirAuto(String auto) {
        if (auto.equalsIgnoreCase("fiat")) {
            au.setAutobuilder(new AutoFiat());
            au.constructAuto();
            System.out.println(au.getAuto().toString());
        } else {
            au.setAutobuilder(new AutoFord());
            au.constructAuto();
            System.out.println(au.getAuto().toString());
        }
    }
    public void ConstruirMoto(String moto){
        if(moto.equalsIgnoreCase("YAMAHA")){
            this.moto.setMotobuilder(new MotoYamaha());
            this.moto.constructMoto();
            System.out.println(this.moto.getMoto().toString());
        }else{
            this.moto.setMotobuilder(new MotoHonda());
            this.moto.constructMoto();
            System.out.println(this.moto.getMoto().toString());
        }
    }
}
