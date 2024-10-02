package org.example.MODELOS;

import java.time.LocalDate;

public class Inmueble {

    private long id;
    private String nombre;
    private String Ubicacion;
    private LocalDate fechaConstruccion;
    private String direccion;
    private double costo;
    private String  Comodidades;
    private Integer nuemroHabitaciones;
    private String Servicios;
    private String telefono;

    public Inmueble() {
    }

    public Inmueble(long id, String nombre, String ubicacion, LocalDate fechaConstruccion, String direccion, double costo, String comodidades, Integer nuemroHabitaciones, String servicios, String telefono) {
        this.id = id;
        this.nombre = nombre;
        Ubicacion = ubicacion;
        this.fechaConstruccion = fechaConstruccion;
        this.direccion = direccion;
        this.costo = costo;
        Comodidades = comodidades;
        this.nuemroHabitaciones = nuemroHabitaciones;
        Servicios = servicios;
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public LocalDate getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(LocalDate fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getComodidades() {
        return Comodidades;
    }

    public void setComodidades(String comodidades) {
        Comodidades = comodidades;
    }

    public Integer getNuemroHabitaciones() {
        return nuemroHabitaciones;
    }

    public void setNuemroHabitaciones(Integer nuemroHabitaciones) {
        this.nuemroHabitaciones = nuemroHabitaciones;
    }

    public String getServicios() {
        return Servicios;
    }

    public void setServicios(String servicios) {
        Servicios = servicios;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                ", fechaConstruccion=" + fechaConstruccion +
                ", direccion='" + direccion + '\'' +
                ", costo=" + costo +
                ", Comodidades='" + Comodidades + '\'' +
                ", nuemroHabitaciones=" + nuemroHabitaciones +
                ", Servicios='" + Servicios + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
