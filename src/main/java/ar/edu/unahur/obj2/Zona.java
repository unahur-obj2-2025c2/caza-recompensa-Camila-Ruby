package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugos.Profugo;

public class Zona {
    private String nombre;
    private List<Profugo> profugos = new ArrayList<>();
    
    public Zona(String nombre, List<Profugo> profugo) {
        this.nombre = nombre;
        this.profugos = profugo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Profugo> getProfugos() {
        return profugos;
    }
    
    public void sacarProfugo(Profugo profugo){
        this.getProfugos().remove(profugo);
    }

    public void agregarProfugo(Profugo profugo){
        this.getProfugos().add(profugo);
    }


}
