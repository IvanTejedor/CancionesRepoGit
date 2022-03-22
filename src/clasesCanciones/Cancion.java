package clasesCanciones;

/**
 * 
 * En esta clase vamos a crear diferentes canciones con sus metodos
 * 
 * @author Ivan Tejedor
 * 
 * @version 1.5
 */

public class Cancion {
	
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	
	 // Definimos los constructores

	
	/**
	 * 
	 * Constructor sin parámetros que inicializa titulo vacio, duracion cero y reproduccion falsa
	 * 
	 */
	
	Cancion() {
		
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
		
	}

	/**
	 * 
	 * Constructor con 2 parametros que inicializa titulo, duracion y reproduccion es falsa
	 * 
	 * @param titulo
	 * @param duracion
	 */
	
	Cancion(String titulo, int duracion) {
		
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
		
	}

	/**
	 * 
	 * Constructor con 4 parámetros que incializa titulo, duracion, grupo y la reproduccion es cierta 
	 * 
	 * @param titulo
	 * @param grupo
	 * @param duracion
	 * @param sonando
	 */
	
	Cancion(String titulo, String grupo, int duracion, boolean sonando) {
		
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
		
	}

	/**
	 * 
	 * Método que comprueba si la cancion está o no sonando
	 * 
	 * @return
	 */
	
	boolean reproducirCancion() {
		
		if (this.sonando) {
			
			return false;
			
		} else {
			
			this.sonando = true;
			return true;
			
		}
		
	}

	/**
	 * 
	 * Método para detener la reproducción de una canción
	 * 
	 * @return
	 */
	
	boolean pararCancion() {
		
		if (!this.sonando) {
			
			return false;
			
		} else {
			
			this.sonando = false;
			return true;
			
		}
		
	}
	
	 // Meter métodos get/set/toString()
	
	public String getTitulo() {
		
		return titulo;
	
	}

	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
		
	}

	public String getGrupo() {
		
		return grupo;
		
	}

	public void setGrupo(String grupo) {
		
		this.grupo = grupo;
		
	}

	public int getDuracion() {
		
		return duracion;
		
	}

	public void setDuracion(int duracion) {
		
		this.duracion = duracion;
		
	}

	public boolean isSonando() {
		
		return sonando;
		
	}

	public void setSonando(boolean sonando) {
		
		this.sonando = sonando;
		
	}

	/**
	 * 
	 * Método para comprobar si las canciones son la misma
	 * 
	 * @param cancion
	 * @return
	 */
	
	boolean MismaCancion(Cancion cancion) {
		
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo) {
			
			return true;
		
		} else {
			
			return false;
			
		}
		
	}
	
	/**
	 * 
	 * Método para seleccionar la canción más larga
	 * 
	 * @param canciones
	 * @return
	 */

	public static String MayorDuracion(Cancion[] canciones) {
		
		int posMax = 0;
		int max = 0;
		
		for (int i = 0; i < canciones.length; i++) {
			
			if (canciones[i].duracion > max) {
				
				posMax = i;
				max = canciones[i].duracion;
				
			}
		}
		
		return canciones[posMax].titulo;

	}
	
	/**
	 * 
	 * Método para pasar la canción
	 * 
	 * @param canciones
	 * @param titulo
	 * @return
	 */

	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		
		int pos = 0;
		int siguiente = 0;
		
		for (int i = 0; i < canciones.length; i++) {
			
			if (titulo == canciones[i].titulo) {
				
				pos = i;
				
			}
			
		}
		
		if (pos == canciones.length - 1) {
			
			siguiente = 0;
			
		} else {
			
			siguiente = pos + 1;
			
		}
		
		return canciones[siguiente].titulo;
		
	}

	@Override
	
	public String toString() {
		
		return "Datos de la canción [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando + "]";

	}
	
}