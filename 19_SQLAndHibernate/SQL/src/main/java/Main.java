import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String pass = "testtest";

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "SELECT course_name, COUNT(course_name) / TIMESTAMPDIFF(MONTH, min(subscription_date), " +
                            "max(subscription_date)) AS Month " +
                            "FROM purchaselist GROUP BY course_name;");

            while (resultSet.next()) {

//                String courseName = resultSet.getString("name");
                System.out.println(resultSet.getString(1) + " - " + resultSet.getString(2));
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
