package request;

public class ClippingAndSorting {

        public static String where = "select * from learndb2.category where parent_category_id = 2";
        public static String and = "select * from learndb2.store_address where city_id = 6 and address = 'st. Chkalova, 42'";
        public static String or = "select * from learndb2.employee where first_name ='Viktor' or middle_name = 'Ivanovich'";
        public static String not = "select * from learndb2.employee where not(first_name = 'Viktor' or middle_name = 'Ivanovich')";
        public static String orderOfConditions = "select * from learndb2.employee where first_name = 'Serge' and (rank_id = 'CEO' or rank_id = 'DIRECTOR' or rank_id = 'GENERAL_MANAGER' )";
        public static String compare = "select * from learndb2.store_address where store_id = 100 and city_id > 1";
        public static String between = "select * from learndb2.product_price where (price between 5000 and 15000) or (price between 30000 and 40000)";
        public static String in = "select * from learndb2.employee where rank_id not in ('SELLER', 'MANAGER')";
//        why did not work?
        public static String like = "select * from learndb2.employee where last_name like 'М%в' ";
        public static String nullValue = "select * from learndb2.store_address where opening_hours is not null and phone is not null";
        public static String orderBy = "select * from learndb2.city order by name";
        public static String orderByFew = "select employee_id, store_id, rank_id, last_name from learndb2.employee order by store_id, rank_id, last_name desc";
        public static String limit = "select * from learndb2.product_price order by price desc limit 5";
        public static String limitOffset = "select * from learndb2.product_price order by price desc limit 5 offset 2";


}
