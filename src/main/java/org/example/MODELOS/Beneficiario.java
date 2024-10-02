package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {

    private long id;
    private String nombre;
    private String edad;
    private String telefono;
    private String fechaNacimiento;
    private Integer cuantasPersonasVive;
    private String correo;
    private String ciudad;
    private String Barrio;
    private String direccion;

    public Beneficiario() {
    }

    public Beneficiario(long id, String nombre, String edad, String telefono, String fechaNacimiento, Integer cuantasPersonasVive, String correo, String ciudad, String barrio, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuantasPersonasVive = cuantasPersonasVive;
        this.correo = correo;
        this.ciudad = ciudad;
        Barrio = barrio;
        this.direccion = direccion;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCuantasPersonasVive() {
        return cuantasPersonasVive;
    }

    public void setCuantasPersonasVive(Integer cuantasPersonasVive) {
        this.cuantasPersonasVive = cuantasPersonasVive;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", cuantasPersonasVive=" + cuantasPersonasVive +
                ", correo='" + correo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", Barrio='" + Barrio + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
