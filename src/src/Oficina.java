package src;

public class Oficina implements Edificio{
	private String provinciaLocalizacion;
	private String nombre;
	private Integer id;
	private String tipo = "Oficina";
	public Oficina(Integer id, String provinciaLocalizacion, String nombre) {
		super();
		this.provinciaLocalizacion = provinciaLocalizacion;
		this.nombre = nombre;
		this.id = id;
	}
	public Oficina(String provinciaLocalizacion, String nombre) {
		super();
		this.provinciaLocalizacion = provinciaLocalizacion;
		this.nombre = nombre;
	}
	public String getProvinciaLocalizacion() {
		return provinciaLocalizacion;
	}
	public void setProvinciaLocalizacion(String provinciaLocalizacion) {
		this.provinciaLocalizacion = provinciaLocalizacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	public String getTipo() {
		return tipo;
	}
}
