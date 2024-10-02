package org.example.MODELOS;

public class Asesor {

    private long id;
    private String nombre;
    private String edad;
    private String telefono;
    private String areaEmpresa;
    private String correo;
    private double bonificaciones;
    private double descuentos;
    private String ProcesoReclamos;
    private String AnterioresClientes;

    public Asesor() {
    }

    public Asesor(long id, String nombre, String edad, String telefono, String areaEmpresa, String correo, double bonificaciones, double descuentos, String procesoReclamos, String anterioresClientes) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.areaEmpresa = areaEmpresa;
        this.correo = correo;
        this.bonificaciones = bonificaciones;
        this.descuentos = descuentos;
        ProcesoReclamos = procesoReclamos;
        AnterioresClientes = anterioresClientes;
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

    public String getAreaEmpresa() {
        return areaEmpresa;
    }

    public void setAreaEmpresa(String areaEmpresa) {
        this.areaEmpresa = areaEmpresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public String getProcesoReclamos() {
        return ProcesoReclamos;
    }

    public void setProcesoReclamos(String procesoReclamos) {
        ProcesoReclamos = procesoReclamos;
    }

    public String getAnterioresClientes() {
        return AnterioresClientes;
    }

    public void setAnterioresClientes(String anterioresClientes) {
        AnterioresClientes = anterioresClientes;
    }

    @Override
    public String toString() {
        return "Asesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", areaEmpresa='" + areaEmpresa + '\'' +
                ", correo='" + correo + '\'' +
                ", bonificaciones=" + bonificaciones +
                ", descuentos=" + descuentos +
                ", ProcesoReclamos='" + ProcesoReclamos + '\'' +
                ", AnterioresClientes='" + AnterioresClientes + '\'' +
                '}';
    }
}
