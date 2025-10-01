package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.Zona;
import ar.edu.unahur.obj2.profugos.Profugo;

public class CazadorSigiloso extends Cazador{

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected void capturar(Profugo p, Zona z) {
        if ((this.getExperiencia() > p.getInocencia()) && (p.getHabilidad() < 50)){
            z.sacarProfugo(p);
            this.getProfugosCapturados().add(p);
        }else{
            this.intimidar(p);
        }
    }

    @Override
    protected void intimidar(Profugo p) {
        super.intimidar(p);
        p.reducirHabilidad();
        p.reducirHabilidad();
        p.reducirHabilidad();
        p.reducirHabilidad();
        p.reducirHabilidad();
        //Debi haber hecho que reducirHabilidad() tomara una cantidad como parametro
    }

}
