package com.mycompany.usuariovideo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumnos
 */
public class Usuario {
   private String nombre;
   private String correo;
   private String comentario;


   public Usuario(String nombre, String correo, String comentario){
       this.nombre=nombre;
       this.correo=correo;
       this.comentario=comentario;
   }
    
   public void verVideo(Video video){
    System.out.println(nombre + "esta viendo el video"+video.getTitulo() );
    video.reproducir();
}

   public String obtenerNombre(){
    return nombre;
}
   public String Comentario(){
    return comentario;
   }
}
