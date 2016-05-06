/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inforserveis;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
/**
 *
 * @author heroe
 */
@Controller
@RequestMapping("/")
public class ControladorDetclimo {
    @Autowired ComportamientoDetclimo miServicioMensaje;
    
    @CrossOrigin
    @RequestMapping(value="/Monitor", method=RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody String obtenerTodos()throws Exception{
     
     ObjectMapper maper=new ObjectMapper();
   List<DETCLIMO> mensajitos=   miServicioMensaje.leerTodosLosMensajes();
   return maper.writeValueAsString(mensajitos);
   
    }
    
    @CrossOrigin
    @RequestMapping(value="/Monitor/{id}", method=RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody String obtenerPorId(@PathVariable Integer id)throws Exception{
     
     ObjectMapper maper=new ObjectMapper();
   DETCLIMO mensajito=   miServicioMensaje.obtenerMensajePorID(id);
   return maper.writeValueAsString(mensajito);
   
    }
    
    @CrossOrigin
    @RequestMapping(value="/Monitor/{id}/{titulo}/{cuerpo}", method=RequestMethod.PUT, headers = {"Accept=text/html"})
    @ResponseBody String obtenerPorId(@PathVariable Integer id,
            @PathVariable String titulo, @PathVariable String cuerpo)throws Exception{
     DETCLIMO m=new DETCLIMO();
             m.setID(id);
            
     miServicioMensaje.actualizarMensaje(m);
   return "Mensaje actualizado con exito";
   
    }
     
    
     @CrossOrigin
    @RequestMapping(value = "/Monitor/{titulo}/{cuerpo}",
            method = RequestMethod.POST, headers = {"Accept=text/html"})
    @ResponseBody String guardarMensaje(@PathVariable String titulo,
            @PathVariable String cuerpo) throws Exception{
        DETCLIMO m = new DETCLIMO();
       
        miServicioMensaje.guardar(m);
        return "Mensaje guardado con exito";
        
    }
    
    
    @CrossOrigin
    @RequestMapping(value="/Monitor/{id}", method=RequestMethod.DELETE, headers = {"Accept=text/html"})
    @ResponseBody String borrarMensaje (@PathVariable Integer id)throws Exception{
     
     DETCLIMO m = new DETCLIMO();
        m.setID(id);
     miServicioMensaje.borrarMensaje(id);
     return "Mensaje borrado con Exito";
   
    } 
    
    
}
