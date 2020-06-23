package data;

public class CreateDropDB {

    public static String createDB(String nameDB){
        return "create database " + nameDB;
    }

    public static String dropDB(String nameDB){
        return "drop database " + nameDB;
    }


}
