import data.CreateTables;
import other.ChangeDBFile;
import other.ListClassesName;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws SQLException {

        DBWorker dbWorker = new DBWorker();
        Statement statement = dbWorker.getConnection().createStatement();

//        String execute = CreateDropDB.createDB("learndb2");
//        statement.execute(execute);

        ListClassesName classesName = new ListClassesName(".\\\\src\\\\main\\\\java\\\\data");

        ArrayList<String> listClassName = null;
        try {
            listClassName = classesName.classesName();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(listClassName.toArray()));

        ChangeDBFile dbFile = new ChangeDBFile(listClassName);
        try {
            dbFile.changeNewDB("learndb", "learndb2");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        ArrayList<String> list = CreateTables.createTables();
//        for (String exe: list) {
//            statement.execute(exe);
//        }


        statement.close();
        dbWorker.getConnection().close();

//        System.out.println(CreateDropDB.dropDB("ddd"));
    }


}
