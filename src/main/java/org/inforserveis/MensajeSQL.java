/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inforserveis;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author campitos
 */
public class MensajeSQL extends DETCLIMO implements ComportamientoDetclimo{

    @Override
    public ArrayList<DETCLIMO> leerTodosLosMensajes(){
           DAODetclimo dao=new DAODetclimo();
            ArrayList<DETCLIMO> mensajes=new ArrayList<DETCLIMO>();
        try {
         mensajes=dao.buscarTodos();
        } catch (Exception ex) {
     System.out.println(ex.getMessage());
        }
          return mensajes ;
          
    }

    @Override
    public void guardar(DETCLIMO m) {
        DAODetclimo dao = new DAODetclimo();
        try {
            dao.guardar(m);
        } catch (Exception ex) {
            Logger.getLogger(MensajeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public DETCLIMO obtenerMensajePorID(Integer id){
     DAODetclimo dao=new DAODetclimo();
     DETCLIMO mensaje=new DETCLIMO();
        try {
           mensaje=    dao.buscarPorId(id);
        } catch (Exception ex) {
            Logger.getLogger(MensajeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;
    }

    @Override
    public void actualizarMensaje(DETCLIMO m){
    DAODetclimo dao=new DAODetclimo();
        try {
            dao.actualizar(m);
        } catch (Exception ex) {
            Logger.getLogger(MensajeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void borrarMensaje(Integer id){
      DAODetclimo dao=new DAODetclimo();
        try {
            dao.borrar(id);
        } catch (Exception ex) {
            Logger.getLogger(MensajeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
