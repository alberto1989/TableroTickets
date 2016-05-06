/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inforserveis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author heroe1989
 */
public interface ComportamientoDetclimo {
    
  public List<DETCLIMO> leerTodosLosMensajes();
  public void guardar(DETCLIMO m);
  public DETCLIMO obtenerMensajePorID(Integer id);
  public void actualizarMensaje(DETCLIMO m);
  public void borrarMensaje(Integer id);
  
}
