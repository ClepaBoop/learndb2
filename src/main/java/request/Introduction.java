package request;

public class Introduction {

    public static String selectCity = "select * from learndb2.city";
    public static String selectEmployee = "select first_name, middle_name, last_name  from learndb2.employee";
    public static String selectNow = "select now()";
    public static String selectUpper = "select now() as server_date, name, upper(name) as name_upper from learndb2.city";
    public static String selectConcat = "select first_name || ' ' || last_name as full_name from learndb2.employee";
    public static String selectDivision = "select product_id,  price , price/2 as price_sale from learndb2.product_price";
    public static String selectDistinct = "select distinct product_id from learndb2.purchase_item ";



}
