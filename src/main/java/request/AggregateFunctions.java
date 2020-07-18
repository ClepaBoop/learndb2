package request;

public class AggregateFunctions {

    public static String aggregateFunctions_1of13 = "select \n" +
                                                    "        min(pp.price) as  price_min, \n" +
                                                    "        avg(pp.price) as price_avg, \n" +
                                                    "        max(pp.price) as price_max \n" +
                                                    "from\n" +
                                                    "        learndb2.product_price pp";

    public static String nullValue_2of13 =  "select\n" +
                                            "       count(*) as count_total,  \n" +
                                            "       count(employee_id) as count_employee \n" +
                                            "from\n" +
                                            "       learndb2.purchase ";

    public static String numberUniqueValues_3of13 =   "select \n" +
                                                "        count(*) as count_total, \n" +
                                                "        count(employee_id) as count_employee, \n" +
                                                "        count(distinct employee_id) as count_distinct_employee \n" +
                                                "from\n" +
                                                "        learndb2.purchase";


    public static String absenceStrings_4of13 = "select \n" +
                                                "        min(price) as min_price, \n" +
                                                "        max(price) as max_price, \n" +
                                                "        count(*) as count_rows \n" +
                                                "from \n" +
                                                "        learndb2.product_price\n" +
                                                "where\n" +
                                                "        price < 0\n";

    public static String groupBy_5of13 =    "select \n" +
                                            "        product_id, \n" +
                                            "        min(price) as price_min, \n" +
                                            "        max(price) as price_max \n" +
                                            "from\n" +
                                            "        learndb2.product_price \n" +
                                            "group by \n" +
                                            "        product_id\n" +
                                            "order by\n" +
                                            "        product_id";

    public static String groupByJoinTables_6of13 = "select\n" +
                                                    "        p.name,\n" +
                                                    "        min(pp.price) as price_min, \n" +
                                                    "        max(pp.price) as price_max \n" +
                                                    "from\n" +
                                                    "        learndb2.product_price pp\n" +
                                                    "join\n" +
                                                    "        learndb2.product p\n" +
                                                    "on\n" +
                                                    "        pp.product_id = p.product_id\n" +
                                                    "group by\n" +
                                                    "        pp.product_id,\n" +
                                                    "        p.name\n" +
                                                    "order by\n" +
                                                    "        p.name";
//не понимаю как работает
    public static String groupByAndWhere_7of13 = "select\n" +
                                                    "        p.category_id, \n" +
                                                    "        p.name, \n" +
                                                    "        min(pp.price) as price_min, \n" +
                                                    "        max(pp.price) as price_max \n" +
                                                    "from\n" +
                                                    "        learndb2.product p\n" +
                                                    "join\n" +
                                                    "        learndb2.product_price pp\n" +
                                                    "on  \n" +
                                                    "        pp.product_id = p.product_id\n" +
                                                    "where\n" +
                                                    "        p.category_id = 6\n" +
                                                    "or\n" +
                                                    "        p.category_id = 7\n" +
                                                    "group by\n" +
                                                    "        p.category_id,\n" +
                                                    "        p.name\n" +
                                                    "order by\n" +
                                                    "        p.category_id,\n" +
                                                    "        p.name";

    public static String groupBYFewExpressions_8of13 =  "select\n" +
                                                        "        store_id, \n" +
                                                        "        category_id, \n" +
                                                        "        min(price) as price_min, \n" +
                                                        "        max(price) as price_max\n" +
                                                        "from\n" +
                                                        "        learndb2.product_price pp\n" +
                                                        "join    \n" +
                                                        "        learndb2.product p\n" +
                                                        "on\n" +
                                                        "        p.product_id = pp.product_id\n" +
                                                        "group by\n" +
                                                        "        category_id,\n" +
                                                        "        store_id\n" +
                                                        "order by\n" +
                                                        "        store_id\n";
//    не работает
    public static String nullInGroupBy_9of13 = "select \n" +
                                                    "        s.name as store_name,  \n" +
                                                    "        e.first_name || ' ' || e.last_name as manager_full_name,  \n" +
                                                    "        count(e.manager_id) as amount_employees,\n" +
                                                    "        count(*)  \n" +
                                                    "from     \n" +
                                                    "        learndb2.store s\n" +
                                                    "left join \n" +
                                                    "        learndb2.employee e\n" +
                                                    "on \n" +
                                                    "        s.store_id = e.store_id\n" +
                                                    "group by \n" +
                                                    "        s.name,\n" +
                                                    "        manager_full_name,\n" +
                                                    "        e.manager_id\n" +
                                                    "order by\n" +
                                                    "        store_name,\n" +
                                                    "        manager_full_name";

    public static String having_10of13 =    "select\n" +
                                            "        product_id,\n" +
                                            "        min(price) as price_min, \n" +
                                            "        max(price) as price_max \n" +
                                            "from\n" +
                                            "        learndb2.product_price\n" +
                                            "group by\n" +
                                            "        product_id\n" +
                                            "having\n" +
                                            "        min(price) != max(price)\n" +
                                            "order by\n" +
                                            "        product_id";
//не работает
    public static String rollup_11of13 =    "select\n" +
                                            "       store_id, \n" +
                                            "       rank_id, \n" +
                                            "       count(employee_id) as count_employees  \n" +
                                            "from\n" +
                                            "        learndb2.employee\n" +
                                            "group by rollup\n" +
                                            "        (store_id, rank_id, employee_id)\n" +
                                            "order by\n" +
                                            "        store_id nulls last,\n" +
                                            "        rank_id nulls last";
//не работает
    public static String numberUniqueValues_12of13 =    "select\n" +
                                                        "        store_id, \n" +
                                                        "        rank_id, \n" +
                                                        "        count(employee_id)count_employees \n" +
                                                        "from\n" +
                                                        "        employee\n" +
                                                        "group by cube\n" +
                                                        "        (store_id, rank_id, employee_id)\n" +
                                                        "order by\n" +
                                                        "        store_id nulls last,\n" +
                                                        "        rank_id nulls last";
    public static String numberUniqueValues_13of13 = "";








}
