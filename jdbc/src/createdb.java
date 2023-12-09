import java.sql.*;

public class createdb{
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/rawatji";
        String user = "root";
        String password = "Sana89@";

        // JDBC variables for opening, closing, and managing connection
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(url, user, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query
            String sqlQuery = "SELECT * FROM job";
            resultSet = statement.executeQuery(sqlQuery);

            // Process the results
            while (resultSet.next()) {
                // Retrieve data from the result set
                // int id = resultSet.getInt("driver");
                String name = resultSet.getString("driver");
                // Process the data (you can perform other actions here)
                System.out.println(", Name: " + name);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Handle exceptions properly in a real application
        } finally {
            // Close resource
        }
    }
}