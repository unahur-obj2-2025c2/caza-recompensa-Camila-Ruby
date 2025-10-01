package ar.edu.unahur.obj2.cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Zona;
import ar.edu.unahur.obj2.profugos.Profugo;

public abstract class Cazador {
    private Integer experiencia;
    private List<Profugo> profugosCapturados = new ArrayList<>();
    private Integer cantProfugRecientementeCapturados;
    private List<Profugo> recientementeIntimidados;
    
    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public void cazarEn(Zona zona){
        // Captura a los prófugos de la zona
        zona.getProfugos().forEach(p -> this.capturar(p, zona));

        // Calcular experiencia extra
        int minimoHabilidad = this.recientementeIntimidados
                .stream()
                .mapToInt(Profugo::getHabilidad)
                .min()
                .orElse(0);

        this.experiencia += minimoHabilidad + (2 * this.cantProfugRecientementeCapturados);

        //Resetear para la próxima vez
        this.recientementeIntimidados.clear();              // vaciar la lista
        this.cantProfugRecientementeCapturados = 0;        // reiniciar contador
    }


    protected abstract void capturar(Profugo p, Zona z);
    protected void intimidar(Profugo p){
        p.disminuirInocencia();
        p.disminuirInocencia();
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public List<Profugo> getProfugosCapturados() {
        return profugosCapturados;
    }

    public Integer getCantProfugRecientementeCapturados() {
        return cantProfugRecientementeCapturados;
    }

    

}