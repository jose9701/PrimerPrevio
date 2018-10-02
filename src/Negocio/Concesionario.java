
package Negocio;

/**
 *
 * @author josea
 */
public class Concesionario implements ConcesionarioInterface{
    BodegaAuto au;
    BodegaMoto moto;
    
    
    
    public Concesionario() {
        au = new BodegaAuto();
        moto= new BodegaMoto();
    }
    
    
    @Override
    public void ConstruirAuto(String auto) {
        
        if (auto.equalsIgnoreCase("fiat")) {
            
            au.setAutobuilder(new AutoFiat());
            au.constructAuto();
            
        } else {
            
            au.setAutobuilder(new AutoFord());
            au.constructAuto();
            
        }
    }
    
    
    @Override
    public String devolverAuto(){
        return au.getAuto().toString();
    }
    
    
    
    
    @Override
    public void ConstruirMoto(String moto){
        if(moto.equalsIgnoreCase("YAMAHA")){
            this.moto.setMotobuilder(new MotoYamaha());
            this.moto.constructMoto();
            
        }else{
            this.moto.setMotobuilder(new MotoHonda());
            this.moto.constructMoto();
            
        }
    }
    @Override
    public String devolverMoto(){
        return moto.getMoto().toString();
        
    }
    @Override
    public String devolverPotenciaMoto(){
        return moto.getMoto().DevolverPotenciaMotor();
    }

    @Override
    public String DevolverModeloMoto() {
        return moto.getMoto().getModelo();
    }

    @Override
    public String devolverPotenciaAuto() {
        return au.getAuto().devolverPotencia();
    }

    @Override
    public String DevolverModeloAuto() {
        return au.getAuto().getModelo();
    }

    @Override
    public String DevolverPrecioMoto() {
        return ""+ moto.getMoto().getPrecio();
    }

    @Override
    public String devolverPrecioAuto() {
        System.out.println("precio ="+ au.getAuto().getPrecio());
        return ""+au.getAuto().getPrecio();
    }

    @Override
    public String devolverCantidadPuertas() {
        return ""+au.getAuto().getCantidadDePuertas();
    }
    
}
