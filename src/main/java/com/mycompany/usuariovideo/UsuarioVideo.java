/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usuariovideo;

/**
 *
 * @author Alumnos
 */
public class UsuarioVideo {

    public static void main(String[] args) {
        //Crear usuario con comentario
        Usuario usuario = new Usuario("Macaco ", "macaco@gmail.com", "Este video es genial!");
        //Crear video
        Video video = new Video("Monky Flyp", 3600);
        
        //Mostrar video
        usuario.verVideo(video);
        
        //Detener video
        video.detener();
        
        //Crear comentario y mostrarlo
        Comentario comentario = new Comentario("Me encanto el video!");
        System.out.println(usuario.obtenerNombre()+ " comento: " + comentario.getComentario());
    }
}
