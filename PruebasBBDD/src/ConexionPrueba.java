import java.sql.*;



public class ConexionPrueba {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		try {
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://falorente.salesianas.es/falorente_profinal","falor_fralg","fralg100@gmail.com");
			Statement miStatement=miConexion.createStatement();
			ResultSet miResultSet=miStatement.executeQuery("SELECT nombre FROM Profesores");
			
			while (miResultSet.next()) {

				System.out.println(miResultSet.getString("nombre"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
