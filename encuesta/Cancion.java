/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encuesta;

/**
 *
 * @author 57314
 */
public class Cancion {
  private String titulo;
    private String artista;

    // Constructor
    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    // Método para mostrar detalles de la canción
    public void mostrarCancion() {
        System.out.println("Título: " + titulo + ", Artista: " + artista);
    }

}





   

