import java.sql.*;
import java.util.Scanner;

public class DemoDb {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    // JDBC variables for opening, closing and managing connection
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try {
            // 1. Connect to the database
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database");

            // 2. Create a table
            createTable();

            // 3. Insert data into the table
            insertData();

            // 4. Query data from the table
            queryData();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. Close the resources
            closeResources();
        }
    }

    private static void createTable() throws SQLException {
        statement = connection.createStatement();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(50)," +
                "age INT)";
        statement.executeUpdate(createTableSQL);
        System.out.println("Table created successfully");
    }

    private static void insertData() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = scanner.nextLine();
        System.out.print("Enter the age of the student: ");
        int age = scanner.nextInt();

        statement = connection.createStatement();
        String insertDataSQL = "INSERT INTO students (name, age) VALUES " +
                "('" + name + "', " + age + ")";
        int rowsAffected = statement.executeUpdate(insertDataSQL);
        System.out.println(rowsAffected + " row(s) inserted");
    }

    private static void queryData() throws SQLException {
        statement = connection.createStatement();
        String queryDataSQL = "SELECT * FROM students";
        resultSet = statement.executeQuery(queryDataSQL);

        // Iterate over the result set and print the data
        System.out.println("Query result:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }
    }

    private static void closeResources() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
