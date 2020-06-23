import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        DBWorker dbWorker = new DBWorker();
        Statement statement = dbWorker.getConnection().createStatement();

//        String execute = CreateDropDB.createDB("learndb2");
//        statement.execute(execute);



//        ArrayList<String> list = CreateTables.createTables();
//        for (String exe: list) {
//            statement.execute(exe);
//        }


        statement.close();
        dbWorker.getConnection().close();

//        System.out.println(CreateDropDB.dropDB("ddd"));
    }


}
