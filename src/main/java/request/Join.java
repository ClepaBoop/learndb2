package request;

public class Join {

    public static String joinTwoTables = "select * from learndb2.product p " +
                                         "join learndb2.category c " +
                                         "on p.category_id = c.category_id ";
    public static String pseudonym = "select p.purchase_id, purchase_date, store_id, product_id, (count * price) as total_price from learndb2.purchase p join learndb2.purchase_item p_i on p.purchase_id = p_i.purchase_id  order by store_id, purchase_date desc ";
    public static String pseudonymWhere = "select p_i.purchase_id, " +
                                                 "purchase_date, " +
                                                 "product_id, " +
                                                 "count, price " +
                                              "from learndb2.purchase_item p_i " +
                                              "join learndb2.purchase p " +
                                            "on p_i.purchase_id = p.purchase_id " +
                                            "where count >= 5 " +
                                            "order by count desc, purchase_date desc    ";

    public static String multipleJoinConditions =   "select  e.last_name,  \n" +
                                                    "        e.first_name,  \n" +
                                                    "        e.store_id as store_id_employee,   \n" +
                                                    "        r.store_id as store_id_rank,  \n" +
                                                    "        r.rank_id, \n" +
                                                    "        r.name as rank_name  \n" +
                                                    "    from learndb2.rank r \n" +
                                                    "    join learndb2.employee e \n" +
                                                    "    on e.rank_id = r.rank_id  \n" +
                                                    "    or r.store_id = e.store_id \n" +
                                                    "order by e.last_name, \n" +
                                                    "         e.first_name, \n" +
                                                    "         r.store_id, \n" +
                                                    "         r.rank_id";
    public static String repeatedlyTables = "select \n" +
                                            "        r.store_id, \n" +
                                            "        r.rank_id, \n" +
                                            "        r2.rank_id as rank_id_other \n" +
                                            "from \n" +
                                            "        learndb2.rank r\n" +
                                            "join\n" +
                                            "        learndb2.rank r2\n" +
                                            "on\n" +
                                            "        r.store_id = r2.store_id\n" +
                                            "and\n" +
                                            "        r.rank_id != r2.rank_id\n" +
                                            "order by \n" +
                                            "        r.store_id,\n" +
                                            "        r.rank_id, \n" +
                                            "        r2.rank_id";
    public static String connectionTypes =  "SELECT c.name as category_name ,\n" +
                                            "       p.name as product_name        \n" +
                                            "  FROM learndb2.category c\n" +
                                            "  LEFT JOIN learndb2.product p\n" +
                                            "    ON c.category_id = p.category_id\n" +
                                            " ORDER BY c.name,\n" +
                                            "          p.name";

    public static  String rightJoin =   "select \n" +
                                        "        t.time_offset, \n" +
                                        "        c.name as city_name     \n" +
                                        "from \n" +
                                        "        learndb2.city c\n" +
                                        "right join\n" +
                                        "        learndb2.timezone t\n" +
                                        "on \n" +
                                        "        t.timezone_id = c.timezone_id\n" +
                                        "order by \n" +
                                        "        t.time_offset,\n" +
                                        "        c.name";

//    можно select distinct без offset, но вообще можно как то по другому
//    должно работать как то по другому
    public static String fullJoin = "select \n" +
                                    "        pp.product_id as product_id_price, \n" +
                                    "        pi.product_id as product_id_purchase \n" +
                                    "from \n" +
                                    "        product_price pp \n" +
                                    "full join\n" +
                                    "        purchase_item pi\n" +
                                    "on\n" +
                                    "        pp.product_id = pi.product_id\n" +
                                    "where\n" +
                                    "        pp.product_id is null\n" +
                                    "or\n" +
                                    "        pi.product_id is null\n" +
                                    "offset 2";

    public static String crossJoin =    "select \n" +
                                        "        c.name as city_name, \n" +
                                        "        c.timezone_id as timezone_id_city, \n" +
                                        "        t.timezone_id as timezone_id_timezone, \n" +
                                        "        t.time_offset \n" +
                                        "from \n" +
                                        "        learndb2.timezone t\n" +
                                        "cross join\n" +
                                        "        learndb2.city c\n" +
                                        "order by \n" +
                                        "        c.name,\n" +
                                        "        t.timezone_id";

    public static String joinWhere =    "select \n" +
                                        "        c.name as category_name, \n" +
                                        "        p.name as product_name, \n" +
                                        "        p.description \n" +
                                        "from\n" +
                                        "        learndb2.product p,\n" +
                                        "        learndb2.category c\n" +
                                        "where\n" +
                                        "        c.category_id = p.category_id\n" +
                                        "and \n" +
                                        "        c.category_id = 6\n" +
                                        "order by\n" +
                                        "        p.name";















}
