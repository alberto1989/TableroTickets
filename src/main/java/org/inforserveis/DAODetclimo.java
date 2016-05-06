/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inforserveis;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author heroe
 */
public class DAODetclimo {
    
    public  SessionFactory sessionFactory;
    public  Session session;
    public  Transaction transaction;
    public DAODetclimo(){
        
     sessionFactory=   HibernateUtilidades.getSessionFactory();
     session=sessionFactory.openSession();
     transaction=session.beginTransaction();
    }
    private void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    /*
  1.   GUARDAR
    */
    public void guardar(DETCLIMO obj)throws Exception{
        session.save(obj);
        cerrarTodo();
    }
/*
    2. BUSCAR TODOS
    */
    ArrayList<DETCLIMO> buscarTodos() throws Exception{
  ArrayList<DETCLIMO>objetos=  (ArrayList<DETCLIMO>) session.createCriteria(DETCLIMO.class).list();
  cerrarTodo();
  
    return objetos;
    }
    /*
   3.  BUSCAR POR ID
    */
    public DETCLIMO buscarPorId(Integer id) throws Exception{
 
     DETCLIMO    obj=(DETCLIMO) session.createCriteria(DETCLIMO.class).add(Restrictions.idEq(id)).uniqueResult();
  cerrarTodo();
  
      //   obj=(Cliente) session.createCriteria(Mensaje.class).add(Restrictions.idEq(c.getIdCliente())).uniqueResult();
         
    return obj;
    }
    /*
    4. ACTUALIZAR
    */
    public void actualizar(DETCLIMO obj)throws Exception{
        

       
         session.update(obj);
         cerrarTodo();
        
    }
    /*
    5. BORRAR
    */
     public void   borrar(Integer id)throws Exception{
        
DETCLIMO obj=new DETCLIMO();
        obj.setID(id); 
         session.delete(obj);
         cerrarTodo();
         
    }
    
    
}
