package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo{
    private Double tarifaBase;
    private Double tarifaAdicional;
    private TRANSMISION transmision;

    public Moto (String numeroMatricula, String marca, String modelo, String anioFabricacion){
        super(numeroMatricula, marca, modelo, anioFabricacion);
    }

    @Override
    public Double calcularCostoReserva(Integer dias){
        Double costo = tarifaBase * dias;
        if (transmision == TRANSMISION.AUTOMATICA){
            costo += tarifaAdicional * dias;
        }
        return costo;
    }
}