package request;

public class SetOperations {

    public static String combiningResults_1_8 = "select \n" +
                                            "        name\n" +
                                            "from    \n" +
                                            "        learndb2.product\n" +
                                            "where\n" +
                                            "        name ilike '%no%'\n" +
                                            "union\n" +
                                            "select\n" +
                                            "        name\n" +
                                            "from\n" +
                                            "        learndb2.category\n" +
                                            "where\n" +
                                            "        name ilike '%no%'";

    public static String whyRequest_2_8 =   "select\n" +
                                            "        name,\n" +
                                            "        'category' as type \n" +
                                            "from\n" +
                                            "        learndb2.category\n" +
                                            "where\n" +
                                            "        name ilike '%no%'\n" +
                                            "union\n" +
                                            "select\n" +
                                            "        name,\n" +
                                            "        'product' as type\n" +
                                            "from\n" +
                                            "        learndb2.product\n" +
                                            "where\n" +
                                            "        name ilike '%no%'";
    public static String intersectingLines_3_8 =    "select\n" +
                                                    "        product_id,\n" +
                                                    "        store_id,\n" +
                                                    "        price\n" +
                                                    "from\n" +
                                                    "        learndb2.product_price\n" +
                                                    "intersect\n" +
                                                    "select\n" +
                                                    "        product_id,\n" +
                                                    "        store_id,\n" +
                                                    "        price  \n" +
                                                    "from\n" +
                                                    "        learndb2.purchase p\n" +
                                                    "join\n" +
                                                    "        learndb2.purchase_item pi\n" +
                                                    "on \n" +
                                                    "        p.purchase_id = pi.purchase_id";
    public static String exceptLine_4_8 =   "select\n" +
                                            "        product_id,\n" +
                                            "        store_id,\n" +
                                            "        price  \n" +
                                            "from\n" +
                                            "        purchase p\n" +
                                            "join\n" +
                                            "        purchase_item pi\n" +
                                            "on \n" +
                                            "        p.purchase_id = pi.purchase_id\n" +
                                            "except\n" +
                                            "select\n" +
                                            "        product_id,\n" +
                                            "        store_id,\n" +
                                            "        price\n" +
                                            "from\n" +
                                            "        product_price\n" +
                                            "\n";
    public static String duplicateLines_5_8 =   "select\n" +
                                                "        name,\n" +
                                                "        'category' as type \n" +
                                                "from\n" +
                                                "        learndb2.category\n" +
                                                "where\n" +
                                                "        name ilike '%no%'\n" +
                                                "union all\n" +
                                                "select\n" +
                                                "        name,\n" +
                                                "        'product' as type\n" +
                                                "from\n" +
                                                "        learndb2.product\n" +
                                                "where\n" +
                                                "        name ilike '%no%'";
    public static String coincidence_6_8 =  "select\n" +
                                            "        product_id,\n" +
                                            "        price,\n" +
                                            "        count(*):: text\n" +
                                            "from\n" +
                                            "        product_price \n" +
                                            "group by\n" +
                                            "        product_id,\n" +
                                            "        price\n" +
                                            "\n" +
                                            "union\n" +
                                            "select\n" +
                                            "        product_id,\n" +
                                            "        price,\n" +
                                            "        count(*):: text\n" +
                                            "from\n" +
                                            "        purchase_item \n" +
                                            "group by\n" +
                                            "        product_id,\n" +
                                            "        price";
    public static String sorted_7_8 = "select\n" +
                                "        name,\n" +
                                "        'Категория' as type \n" +
                                "from\n" +
                                "        category\n" +
                                "where\n" +
                                "        name ilike '%но%'\n" +
                                "union\n" +
                                "select\n" +
                                "        name,\n" +
                                "        'Товар' as type\n" +
                                "from\n" +
                                "        product\n" +
                                "where\n" +
                                "        name ilike '%но%'\n" +
                                "order by\n" +
                                "        name\n";
    public static String multipleOperations_8_8 = "select\n" +
                                "        product_id\n" +
                                "from\n" +
                                "        product_price\n" +
                                "except\n" +
                                "select\n" +
                                "        product_id\n" +
                                "from\n" +
                                "        purchase_item\n" +
                                "union\n" +
                                "(select\n" +
                                "        product_id\n" +
                                "from\n" +
                                "        purchase_item\n" +
                                "except\n" +
                                "select\n" +
                                "        product_id\n" +
                                "from\n" +
                                "        product_price\n" +
                                "        )";


}
