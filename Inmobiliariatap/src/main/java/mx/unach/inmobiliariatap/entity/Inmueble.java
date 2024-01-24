package mx.unach.inmobiliariatap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inmuebles")
public class Inmueble {

    @Id
    @Column(name="idc")
    private String idcliente;

    @Column(name="municipio")
    private String municipio;

    @Column(name="colonia")
    private String colonia;

    @Column(name="codigopostal")
    private String codigopostal;

    @Column(name="precio")
    private Double precio;

    @Column(name="imagen")
    private String imagen;

    public Inmueble() {}

    public Inmueble(String idcliente, String municipio, String colonia, String codigopostal, Double precio,
			String imagen) {
		this.idcliente = idcliente;
		this.municipio = municipio;
		this.colonia = colonia;
		this.codigopostal = codigopostal;
		this.precio = precio;
		this.imagen = imagen;
	}

	public String getIdcliente() {
        return idcliente;
    }

	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
    
}
