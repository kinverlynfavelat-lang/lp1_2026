/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Interface.IUsuario;
import Model.Persona;
import Model.Usuario;
import java.sql.*;

/**
 *
 * @author kinve
 */
public class UsuarioDaoImpl implements IUsuario {

    private Connection cn;

    @Override
    public Usuario validate(String user, String passw) {
        Usuario u = null;
        Persona p = null;
        
        PreparedStatement st;
        ResultSet rs;
        String query = null;
        
        try {
            u = new Usuario();
            p = new Persona();
            String hashedPassword = u.HashPassword(passw);
            
            
        } catch (Exception e) {
        } finally {
        }
        return u;
    }

}
