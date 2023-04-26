package entidades;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Videojuego implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String desarollador;
	private int anyo;
	public Videojuego(int id, String nombre, String desarollador, int anyo) {
		this.id = id;
		this.nombre = nombre;
		this.desarollador = desarollador;
		this.anyo = anyo;
	}
	public Videojuego() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesarollador() {
		return desarollador;
	}
	public void setDesarollador(String desarollador) {
		this.desarollador = desarollador;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
}
