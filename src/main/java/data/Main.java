package data;

import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        DBWorker dbWorker = new DBWorker();

        Statement statement = dbWorker.getConnection().createStatement();



    }


}
