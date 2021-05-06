package request;

public class MathFunctions {

    public static String the_simplest_arithmetic_operations_1_13 = "select\n" +
                                            "  purchase_id,\n" +
                                            "  product_id,\n" +
                                            "  price,\n" +
                                            "  count,\n" +
                                            "  price * count  as total_price\n" +
                                            "from learndb2.purchase_item \n" +
                                            "order by \n" +
                                            "  purchase_id,\n" +
                                            "  product_id ";

    public static String order_of_operations_2_13 = "select\n" +
                                    "  product_id,\n" +
                                    "  store_id,\n" +
                                    "  price,\n" +
                                    "  ((price - (select min(pp2.price)\n" +
                                    "            from learndb2.product_price pp2\n" +
                                    "            where pp2.product_id = pp1.product_id)) * 0.5) as discount \n" +
                                    "from learndb2.product_price pp1\n" +
                                    "order by\n" +
                                    "  product_id,\n" +
                                    "  price    ";

    public static String division_of_integers_3_13 = "select\n" +
                                    "  purchase_item_id,\n" +
                                    "  count,\n" +
                                    "  count / 2 as whole,\n" +
                                    "  1.0 * count / 2 as fractional \n" +
                                    "from learndb2.purchase_item \n" +
                                    "order by \n" +
                                    "  count desc ";

    public static String the_simplest_arithmetic_operations_4_13 = "select\n" +
                                "  purchase_item_id,\n" +
                                "  count,\n" +
                                "  count % 2 as is_odd \n" +
                                "from learndb2.purchase_item \n" +
                                "order by  \n" +
                                "  count desc ";

    public static String getting_number_from_string_5_13 = "select\n" +
                                "  timezone_id  \n" +
                                "from learndb2.timezone\n" +
                                "where cast(right(time_offset, -4) as SIGNED integer) = 4  ";

    public static String rOUND_6_13 = "select\n" +
                                "  store_id,\n" +
                                "  avg(price) as average_price,\n" +
                                "  round(avg(price), 2) as average_price_rounded   \n" +
                                "from learndb2.product_price \n" +
                                "group by store_id\n" +
                                "order by average_price ";
    //  05.05.2021 грит нет такой функции - trunc
    public static String tRUNC_7_13 = "select \n" +
                                "  store_id,\n" +
                                "  avg(price) as average_price,\n" +
                                "  round(avg(price), 2) as average_price_round,\n" +
//                                "  trunc(avg(price), 2) as ave rage_price_trunc \n" +
                                "from learndb2.product_price \n" +
                                "group by store_id\n" +
                                "order by average_price  ";

    public static String cEIL_8_13 = "select\n" +
                                "  product_id,\n" +
                                "  avg(price) as price_avg,\n" +
                                "  round(avg(price)) as price_avg_round,\n" +
                                "  ceil(avg(price)) as price_avg_ceil \n" +
                                "from learndb2.product_price\n" +
                                "group by product_id\n" +
                                "order by price_avg desc ";

    public static String fLOOR_9_13 = "select\n" +
                                "  product_id,\n" +
                                "  avg(price) as price_avg,\n" +
                                "  round(avg(price)) as price_avg_round,\n" +
                                "  ceil(avg(price)) as price_avg_ceil,\n" +
                                "  floor(avg(price)) as price_avg_floor\n" +
//                                "  trunc(avg(price)) as price_avg_trunc \n" +
                                "from learndb2.product_price\n" +
                                "group by product_id\n" +
                                "order by price_avg desc  ";

    public static String gREATEST_10_13 = "select\n" +
                                    "  product_id,\n" +
                                    "  store_id,\n" +
                                    "  price,\n" +
                                    "  greatest(round(price/100*5), 1000) as prepayment \n" +
                                    "from learndb2.product_price \n" +
                                    "order by price, product_id, store_id ";

    public static String lEAST_11_13 = "select\n" +
                                    "  product_id,\n" +
                                    "  store_id,\n" +
                                    "  price,\n" +
                                    "  least(round(price/100*5), 1000) as prepayment_least,\n" +
                                    "  greatest(round(price/100*5), 1000) as prepayment_greatest \n" +
                                    "from learndb2.product_price \n" +
                                    "order by price, product_id, store_id ";

    public static String abs_12_13 = "select\n" +
                                "  pp1.product_id,\n" +
                                "  pp1.store_id,\n" +
                                "  pp1.price,\n" +
                                "  round((select avg(pp2.price)\n" +
                                "            from learndb2.product_price pp2  \n" +
                                "            where pp1.product_id = pp2.product_id\n" +
                                "            limit 1), 2) \n" +
                                "            as price_avg,\n" +
                                "  abs(pp1.price - round((select avg(pp2.price)\n" +
                                "                            from learndb2.product_price pp2  \n" +
                                "                            where pp1.product_id = pp2.product_id\n" +
                                "                            limit 1), 2)) \n" +
                                "                            as price_difference \n" +
                                "from learndb2.product_price pp1\n" +
                                "order by product_id, price ";
    // STOPSHIP: 05.05.2021 FUNCTION mysql.to_char does not exist. Huy mandal
    public static String to_char_13_13 = "select \n" +
                                "  product_id,\n" +
                                "  store_id,\n" +
                                "  price,\n" +
                                "  to_char(price, '999,999,999,990.00') as price_formatted \n" +
                                "from learndb2.product_price\n" +
                                "order by price desc ";



}
