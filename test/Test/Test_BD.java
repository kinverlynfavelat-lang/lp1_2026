/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Util.ConexionSingleton;

/**
 *
 * @author kinve
 */
import java.sql.*;

public class Test_BD {

    
    public static void main(String[] args) {

        Test_BD test = new Test_BD();
        test.testConexion();
    }
    
    public void testConexion(){
        ConexionSingleton conn = new ConexionSingleton();
        try {
            Connection connection = conn.getConnection();
            if (connection !=null && !connection.isClosed()) {
                System.out.println("Conexion satisfactoria!!!");
            } else {
                System.out.println("No se puede establecer la coneccion");
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
            e.printStackTrace();
        }
    }
}
