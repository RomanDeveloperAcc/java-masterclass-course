package rbd.project;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/home/rdany/Workspace/java-masterclass-course/TestDB/" + DB_NAME;

    public static final String TABLE_NAME = "contacts";

    public static final String NAME_COLUMN = "name";
    public static final String PHONE_COLUMN = "phone";
    public static final String EMAIL_COLUMN = "email";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();
            statement.execute("drop table if exists " + TABLE_NAME);
            statement.execute("create table if not exists " + TABLE_NAME + " (" + NAME_COLUMN + " text, " + PHONE_COLUMN + " integer, " + EMAIL_COLUMN + " text)");
//            statement.execute("insert into contacts values ('John', 6545678, 'john@email.com')");
//            statement.execute("insert into contacts values ('Bob', 1234567, 'bob@email.com')");
//            statement.execute("insert into contacts values ('Richard', 7654321, 'richard@email.com')");

//            statement.execute("delete from contacts where name = 'John'");

//            statement.execute("select * from contacts");
//            ResultSet resultSet = statement.getResultSet();

            ResultSet resultSet = statement.executeQuery("select * from contacts");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " + resultSet.getInt("phone"));
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong. " + e.getMessage());
        }
    }
}
