/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuariovideo;

/**
 *
 * @author Alumnos
 */
public class Video {
    private String titulo;
    private int duracion;//Duracion en segundos
    
    public Video(String titulo, int duracion) {
        this.titulo=titulo;
        this.duracion=duracion;
    }
    
    public void reproducir(){
        System.out.println("Reprduciendo el video: "+titulo);
    }
    
    public void detener(){
        System.out.println("Se detuvo el video: "+ titulo);
    }
    
    public void comentario(){
        System.out.println("Alguien le ha comentado: ");
    }
    
    public String getTitulo(){
        return titulo;
    }
   
    
}
