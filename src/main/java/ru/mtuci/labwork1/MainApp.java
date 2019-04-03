package ru.mtuci.labwork1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainApp {
    public static void main(String[] args) {
        try {
            // создаем подключение
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl",
                    "MAKHROV", "sys");
            // создаем и выполняем запрс
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM MAKHROV.STUDENTS WHERE id = 1");
            // выводим результат запроса
            while (rs.next()) {
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("firstname"));
            }

            connection.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
