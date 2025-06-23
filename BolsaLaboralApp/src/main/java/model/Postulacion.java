package model;

public class Postulacion {

    private String titulo, empresa, ubicacion, fecha, estado;

    public Postulacion(String titulo, String empresa, String ubicacion, String fecha, String estado) {
        this.titulo = titulo;
        this.empresa = empresa;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getTitulo() { return titulo; }
    public String getEmpresa() { return empresa; }
    public String getUbicacion() { return ubicacion; }
    public String getFecha() { return fecha; }
    public String getEstado() { return estado; }

}
