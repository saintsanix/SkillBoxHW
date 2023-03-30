import java.sql.*;
import java.text.ParseException;

public class DBConnection {
    private static Connection connection;

    private static String dbName = "learn";
    private static String dbUser = "root";
    private static String dbPass = "testtest";
    sout

    private static StringBuilder insertQuery = new StringBuilder();

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/" + dbName +
                                "?user=" + dbUser + "&password=" + dbPass);
                connection.createStatement().execute("DROP TABLE IF EXISTS voter_count");
                connection.createStatement().execute("CREATE TABLE voter_count(" +
                        "id INT NOT NULL AUTO_INCREMENT, " +
                        "name TINYTEXT NOT NULL, " +
                        "birthDate DATE NOT NULL, " +
                        "`count` INT NOT NULL, " +
                        "PRIMARY KEY(id))");

                connection.createStatement().execute("DROP TABLE IF EXISTS test_table");
                connection.createStatement().execute("CREATE TABLE test_table(" +
                        "name TINYTEXT NOT NULL, " +
                        "birthDate DATE NOT NULL)");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void executeMultiInsert() throws SQLException {
        System.out.println("\nMultiInsert");
        String sql = "";
        sql = "INSERT INTO test_table(name, birthDate) VALUES" + insertQuery.toString() + ";";
        DBConnection.getConnection().createStatement().execute(sql);
    }

    public static void InsertToFinishTable() throws SQLException {
        System.out.println("\nstart insert to finish table");
        String sql = "INSERT INTO voter_count(name, birthDate, `count`) SELECT name, birthDate, COUNT(name) FROM test_table GROUP BY name, birthDate;";
        DBConnection.getConnection().prepareStatement(sql).execute();
    }

    public static void countVoter(String name, String birthDay) throws SQLException, ParseException {
        birthDay = birthDay.replace('.', '-');
        if (insertQuery.length() > 2000000) {
            executeMultiInsert();
            insertQuery = new StringBuilder();
        }
        insertQuery.append(insertQuery.length() == 0 ? "" : ",").append("('").append(name).append("', '").append(birthDay).append("')");
    }

    public static void printVoterCounts() throws SQLException {
        String sql = "SELECT name, birthDate, `count` FROM voter_count WHERE `count` > 1";
        ResultSet rs = DBConnection.getConnection().createStatement().executeQuery(sql);
        while (rs.next()) {
            System.out.println("\t" + rs.getString("name") + " (" +
                    rs.getString("birthDate") + ") - " + rs.getInt("count"));
        }
        rs.close();
    }

    public static void dropTestTable() throws SQLException {
        connection.createStatement().execute("DROP TABLE IF EXISTS test_table");
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}