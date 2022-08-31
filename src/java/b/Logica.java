package b;

import static java.lang.System.out;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marlon gonzalez
 */
public class Logica {
    
   public String Robot(String texto){
    
    if(texto.equals("hola") || texto.equals("como vas?") || texto.equals("hola nena")){
     out.println("holaaa");
    }else if(texto.equals("quieres ir al cine?") || texto.equals("quieres ir por una empanada")|| texto.equals("quieres ir por una pola?")){
     out.print("claro, me encantaria");
    }else if(texto.equals("te gusta la salchipapa")|| texto.equals("te gusta la pizza") || texto.equals("te gusta el arroz con leche")){
     out.print("me encanta esa comida ");
     }else if(texto.equals("te gustan las peliculas de accion?") || texto.equals("te gustan las peliculas de suspenso?") || texto.equals("te gustan las peliculas de dibujitos?")){
      out.print("me encantan cualquier tipo de pelicula");
    }else if(texto.equals("chao") || texto.equals("hablamos despues ") || texto.equals("chao linda")){
    out.print("chao cuidate");
   }else{
    out.println("calmate , vas muy rapido");
    }
       return null;
        
        
    }
      
  }
    

