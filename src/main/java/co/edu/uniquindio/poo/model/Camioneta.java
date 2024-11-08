package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo{
    private Double capacidadCargaTonelada;
    private Double tarifaBase;
    private Double porcentajeTonelada;

    public Camioneta (String numeroMatricula, String marca, String modelo, String anioFabricacion, Double capacidadCargaTonelada){
        super(numeroMatricula, marca, modelo, anioFabricacion);
        this.capacidadCargaTonelada = capacidadCargaTonelada;
    }

    public Double getCapacidadCargaTonelada(){
        return capacidadCargaTonelada;
    }
    public void setCapacidadCargaTonelada(Double capacidadCargaTonelada){
        this.capacidadCargaTonelada = capacidadCargaTonelada;
    }

    @Override
    public Double calcularCostoReserva(Integer dias){
        return (tarifaBase + (capacidadCargaTonelada * porcentajeTonelada)) * dias;
    }
}