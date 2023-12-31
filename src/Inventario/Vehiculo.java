package Inventario;

import java.io.Serializable;
import java.util.*;

import Reservas.Reserva;

public class Vehiculo implements Serializable {

    private String categoria;
    private Boolean enAlquiler = false;
    private ArrayList<Reserva> reservas;
    private CaracteristicasBasicas caracteristicasBasicas;
    private DetallesAlquiler detallesAlquiler;
    private DetallesSede detallesSede;
    private HistorialVehiculo historialVehiculo;

    /**
     * metodo constructo de un vehiculo
     * @param categoria categoria a la que pertenece el vehiculo
     * @param caracteristicasBasicas caracteristicas del vehiculo
     */
    public Vehiculo(String categoria, CaracteristicasBasicas caracteristicasBasicas) {
        this.categoria = categoria;
        this.reservas = new ArrayList<Reserva>();
        this.caracteristicasBasicas = caracteristicasBasicas;
        this.detallesAlquiler = new DetallesAlquiler();
        this.detallesSede = new DetallesSede();
        this.historialVehiculo = new HistorialVehiculo();
    }

    /**
     * @return retorna la categoria del vehiculo
     */
    public String getCategoriaVehiculo() {
        return this.categoria;
    }

    /**
     * @return retorna si el vehiculo esta en alquiler 
     */
    public Boolean getEnAlquiler() {
        return this.enAlquiler;
    }

    /**´
     * metodo que sirve para poner un vehiculo en alquiler o quitarlo
     * @param alquiler boolean que define el estado del vehiculo, true para en alquiler, false para en no alquiler
     */
    public void setEnAlquiler(Boolean alquiler) {
        this.enAlquiler = alquiler;
    }

    /**
     * @return retorna la reserva del vehiculo
     */
    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }

    /**
     * metodo que sirve para asignar el vehiculo a una reserva
     * @param idReserva un int unico para la reserva
     */
    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    /**
     * @return retorna las caracteristicas basicas de un vehiculo
     */
    public CaracteristicasBasicas getCaracteristicasBasicas() {
        return this.caracteristicasBasicas;
    }

    /**
     * @return retorna los detalles del alquiler de un vehiculo
     */
    public DetallesAlquiler getDetallesAlquiler() {
        return this.detallesAlquiler;
    }

    /**
     * @return retorna los detalles de la sede en la que esta el vehiculo
     */
    public DetallesSede getDetallesSede() {
        return this.detallesSede;
    }

    /**
     * @return retorna el historial del vehiculo
     */
    public HistorialVehiculo getHistorialVehiculo() {
        return this.historialVehiculo;
    }

}