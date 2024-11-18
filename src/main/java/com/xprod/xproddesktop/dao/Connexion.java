package com.xprod.xproddesktop.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Samir Ibrahim
 */
public class Connexion {
    private Connection con;

    public Connexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xprod", "root", "greta");
            
        } catch (Exception e) {
        }
    }

    public Connection getCon() {
        return con;
    }
    
    
}
