package ar.edu.unahur.obj2.profugos;

public class Profugo implements IProfugo {
    private Integer inocencia;
    private Integer habilidad;
    private Boolean esNervioso;

    @Override
    public Integer getInocencia() {
        return this.inocencia;
    }
    @Override
    public Integer getHabilidad() {
        return this.habilidad;
    }
    @Override
    public Boolean esNervioso() {
        return this.esNervioso;
    }
    @Override
    public void volverseNervioso() {
        this.esNervioso = Boolean.TRUE;
    }
    @Override
    public void dejarDeEstarNervioso() {
        this.esNervioso = Boolean.FALSE;
    }
    @Override
    public void reducirHabilidad() {
        this.habilidad = Math.max(0, this.habilidad - 1);
    }
    @Override
    public void disminuirInocencia() {
        this.inocencia = Math.max(0, this.inocencia - 1);
    }

}
