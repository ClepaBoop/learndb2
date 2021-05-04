package request;

public class Subqueries {

public static String singleRowSubquery_1_9 =        "select \n" +
                                                "        p.name as product_name, \n" +
                                                "        pi.count, \n" +
                                                "        pi.price \n" +
                                                "from\n" +
                                                "        learndb2.product p\n" +
                                                "join\n" +
                                                "        learndb2.purchase_item pi\n" +
                                                "on\n" +
                                                "        p.product_id = pi.product_id\n" +
                                                "where\n" +
                                                "        pi.price = (\n" +
                                                "            select\n" +
                                                "                    max(pipi.price)\n" +
                                                "            from\n" +
                                                "                    learndb2.purchase_item pipi\n" +
                                                "        )\n";


//не правильно
    public static String correlatedSubquery_2_9 = "select\n" +
                                "        c.name as category_name,\n" +
                                "        p.name as product_name,\n" +
                                "        pp.price \n" +
                                "from\n" +
                                "        category c\n" +
                                "join\n" +
                                "        product p\n" +
                                "on \n" +
                                "        c.category_id = p.category_id\n" +
                                "join\n" +
                                "        product_price pp\n" +
                                "on\n" +
                                "        pp.product_id = p.product_id\n" +
                                "where pp.price = (\n" +
                                "                    select\n" +
                                "                            max(pppp.price)\n" +
                                "                    from\n" +
                                "                            product_price pppp\n" +
                                "                    join\n" +
                                "                            product prd\n" +
                                "                    on\n" +
                                "                            prd.product_id = pppp.product_id\n" +
                                "                    where\n" +
                                "                            pppp.product_id = pp.product_id\n" +
                                "                  )\n" +
                                "order by\n" +
                                "        c.name,\n" +
                                "        p.name";


    public static String returnMoreThanOne_3_9 = "select\n" +
                                "        c.name,\n" +
                                "        (\n" +
                                "        select\n" +
                                "                p.name\n" +
                                "        from\n" +
                                "                learndb2.product p\n" +
                                "        where\n" +
                                "                p.category_id = c.category_id\n" +
                                "        order by\n" +
                                "                p.name\n" +
                                "        limit 1\n" +
                                "        ) as product_example\n" +
                                "from\n" +
                                "        learndb2.category c\n" +
                                "order by\n" +
                                "        c.name";

    // TODO: 04.05.2021 посмотреть на их решение, но вроде все правильно сделал.
//    нормальное решение без хуйни
//    public static String subqueryReturnedNoRows_4_9 = "select \n" +
//            "  c.category_id ,\n" +
//            "  c.name\n" +
//            "from category c\n" +
//            "left join product p\n" +
//            "on c.category_id = p.category_id\n" +
//            "where p.category_id is null\n" +
//            "order by name";

    public static String subqueryReturnedNoRows_4_9 = "select \n" +
                                "  c.category_id,\n" +
                                "  c.name \n" +
                                "from learndb2.category c\n" +
                                "where (select p.name\n" +
                                "   from learndb2.product p\n" +
                                "   where c.category_id = p.category_id\n" +
                                "   limit 1\n" +
                                "   ) is null\n" +
                                " order by name";


    public static String gettingIntoAListOfValues_5_9 = "select \n" +
                                                        "  employee_id ,\n" +
                                                        "  last_name ,\n" +
                                                        "  first_name ,\n" +
                                                        "  rank_id \n" +
                                                        "from learndb2.employee\n" +
                                                        "where employee_id in (select manager_id\n" +
                                                        "                     from learndb2.employee)\n" +
                                                        " order by \n" +
                                                        "   last_name ,\n" +
                                                        "   employee_id";


    public static String missingInTheListOfValues_6_9 = "select \n" +
                                "  product_id ,\n" +
                                "  name\n" +
                                "from learndb2.product\n" +
                                "where product_id not in(select product_id\n" +
                                "                        from learndb2.purchase_item)\n" +
                                "order by name";


    public static String NULL_values_in_NOTIN_7_9 = "select  \n" +
                                "  employee_id ,\n" +
                                "  last_name ,\n" +
                                "  first_name ,\n" +
                                "  rank_id \n" +
                                "from learndb2.employee\n" +
                                "where employee_id not in(select manager_id\n" +
                                "                      from learndb2.employee\n" +
                                "                      where manager_id is not null)\n" +
                                "order by \n" +
                                "  last_name ,\n" +
                                "  employee_id \n" +
                                "                ";

    public static String checking_for_the_existence_of_string_8_9 = "select  \n" +
            "  employee_id ,\n" +
            "  last_name ,\n" +
            "  first_name ,\n" +
            "  rank_id \n" +
            "from learndb2.employee e1\n" +
            "where exists(select 1\n" +
            "             from learndb2.employee e2\n" +
            "             where e1.employee_id = e2.manager_id)\n" +
            " order by \n" +
            "   last_name ,\n" +
            "   employee_id ";

    public static String checking_if_a_line_is_missing_9_9 = "select  \n" +
                                "  employee_id ,\n" +
                                "  last_name ,\n" +
                                "  first_name ,\n" +
                                "  rank_id \n" +
                                "from learndb2.employee e1\n" +
                                "where not exists(select 1\n" +
                                "             from learndb2.employee e2\n" +
                                "             where e1.employee_id = e2.manager_id)\n" +
                                " order by \n" +
                                "   last_name ,\n" +
                                "   employee_id ";

}
