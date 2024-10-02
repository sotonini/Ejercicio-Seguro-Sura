package org.example.MODELOS;

import java.time.LocalDate;

public class Asegurado {

    private long id;
    private String nombre;
    private String edad;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correo;
    private double salario;
    private double ingresosAdicionales;
    private String beneficiario;
    private Integer cuantasPersonasVive;
    private Integer cuantosHijos;
    private String eps;
    private String direccion;
    private String casaPropia;
    private String segundoBeneficiario;

    public Asegurado() {
    }

    public Asegurado(long id, String nombre, String edad, LocalDate fechaNacimiento, String telefono, String correo, double salario, double ingresosAdicionales, String beneficiario, Integer cuantasPersonasVive, Integer cuantosHijos, String eps, String direccion, String casaPropia, String segundoBeneficiario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.salario = salario;
        this.ingresosAdicionales = ingresosAdicionales;
        this.beneficiario = beneficiario;
        this.cuantasPersonasVive = cuantasPersonasVive;
        this.cuantosHijos = cuantosHijos;
        this.eps = eps;
        this.direccion = direccion;
        this.casaPropia = casaPropia;
        this.segundoBeneficiario = segundoBeneficiario;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getIngresosAdicionales() {
        return ingresosAdicionales;
    }

    public void setIngresosAdicionales(double ingresosAdicionales) {
        this.ingresosAdicionales = ingresosAdicionales;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Integer getCuantasPersonasVive() {
        return cuantasPersonasVive;
    }

    public void setCuantasPersonasVive(Integer cuantasPersonasVive) {
        this.cuantasPersonasVive = cuantasPersonasVive;
    }

    public Integer getCuantosHijos() {
        return cuantosHijos;
    }

    public void setCuantosHijos(Integer cuantosHijos) {
        this.cuantosHijos = cuantosHijos;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCasaPropia() {
        return casaPropia;
    }

    public void setCasaPropia(String casaPropia) {
        this.casaPropia = casaPropia;
    }

    public String getSegundoBeneficiario() {
        return segundoBeneficiario;
    }

    public void setSegundoBeneficiario(String segundoBeneficiario) {
        this.segundoBeneficiario = segundoBeneficiario;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", salario=" + salario +
                ", ingresosAdicionales=" + ingresosAdicionales +
                ", beneficiario='" + beneficiario + '\'' +
                ", cuantasPersonasVive=" + cuantasPersonasVive +
                ", cuantosHijos=" + cuantosHijos +
                ", eps='" + eps + '\'' +
                ", direccion='" + direccion + '\'' +
                ", casaPropia='" + casaPropia + '\'' +
                ", segundoBeneficiario='" + segundoBeneficiario + '\'' +
                '}';
    }
}
