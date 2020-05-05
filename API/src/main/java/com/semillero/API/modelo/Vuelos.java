package com.semillero.API.modelo;

import javax.persistence.*;

@Entity //anotaciones
@Table( name = "Vuelos") // para crear la tabla



public class Vuelos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idavion;
    private int idruta;
    private String fecha_salida;
    private String estado;
    public Vuelos(){ }
    public Vuelos(int id, int idavion, int idruta, String fecha_salida, String estado){
        super();
        this.id = id;
        this.idavion = idavion;
        this.idruta = idruta;
        this.fecha_salida = fecha_salida;
        this.estado = estado;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getIdavion(){
        return idavion;
    }
    public void setIdavion(int idavion){
        this.idavion = idavion;
    }
    public int getIdruta(){
        return idruta = idruta;
    }
    public void setIdruta(int idruta){
        this.idruta = idruta;
    }
    public String getFecha_salida(){
        return fecha_salida;
    }
    public void setFecha_salida(String fecha_salida){
        this.fecha_salida = fecha_salida;
    }
    public String getEstado(){
        return  estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }


}
