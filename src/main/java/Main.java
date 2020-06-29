import data.CreateTables;
import data.FillingTables;
import other.ChangeDBFile;
import other.ListClassesName;
import request.Introduction;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {

        DBWorker dbWorker = new DBWorker();
        Statement statement = dbWorker.getConnection().createStatement();

//        String execute = CreateDropDB.createDB("learndb2");
//        statement.execute(execute);

//        ListClassesName classesName = new ListClassesName(".\\\\src\\\\main\\\\java\\\\data");
//
//        ArrayList<String> listClassName =  listClassName = classesName.classesName();
//
//
//        ChangeDBFile dbFile = new ChangeDBFile(listClassName);
//
//            dbFile.changeNewDB("learndb", "learndb2");

//        ArrayList<String> list = FillingTables.FillingTables();
//        for (String exe: list) {
//            statement.execute(exe);
//        }

        Introduction introduction = new Introduction();
        String selectCity = introduction.getSelectCity();
        System.out.println(selectCity);

        statement.close();
        dbWorker.getConnection().close();

//        System.out.println(CreateDropDB.dropDB("ddd"));
    }


}
