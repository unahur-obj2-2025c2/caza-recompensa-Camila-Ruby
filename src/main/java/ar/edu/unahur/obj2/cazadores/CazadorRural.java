package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.Zona;
import ar.edu.unahur.obj2.profugos.Profugo;

public class CazadorRural extends Cazador{

    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected void capturar(Profugo p, Zona z) {
        if ((this.getExperiencia() > p.getInocencia()) && (p.esNervioso() == Boolean.TRUE )){
            z.sacarProfugo(p);
            this.getProfugosCapturados().add(p);
        }else{
            this.intimidar(p);
        }
    }

    @Override
    protected void intimidar(Profugo p) {
        super.intimidar(p);
        p.volverseNervioso();
    }
    

}
