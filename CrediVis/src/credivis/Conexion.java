
package credivis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/pr";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Se recomienda usar el controlador más reciente
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return con;
    }
    
    // Método para cerrar la conexión
    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión.");
                e.printStackTrace();
            }
        }
    }
}