/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UsuarioDAO;
import entidad.Usuario;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author Nicolás
 */
public class Inicialización {
    
    @Test
    public void initData(){
        UsuarioDAO dao= new UsuarioDAO();
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        Usuario c = new Usuario();
        
        a.setNombre("Juan");
        a.setPassword("1234");
        b.setNombre("Pedro");
        b.setPassword("123");
        c.setNombre("Maria");
        c.setPassword("12345");
        
        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);
        
        
        for (Usuario u: usuarios){
            System.out.println(u.getNombre());
            System.out.println(u.getPassword());
            System.out.println("--------------");
            dao.crear(u);
        }
    }
}
