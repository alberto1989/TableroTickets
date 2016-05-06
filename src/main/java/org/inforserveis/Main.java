/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inforserveis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        SpringApplication.run(Main.class, args);
        try{
            /*
            DAOMensaje dao=new DAOMensaje();
            Mensaje mensa=new Mensaje("Segundo mensaje", "Todos vamos a moriiir!");
            dao.guardar(mensa);
          */
            System.out.println("Mensaje guardado con exito");
        }catch(Exception e){
            System.out.println("Algo malo:"+e.getMessage());
        }
    }
    
}
