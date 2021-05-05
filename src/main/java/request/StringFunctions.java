package request;

public class StringFunctions {

    public static String cONCAT_1_9 = "select \n" +
                                        "  concat(last_name, ' ', first_name, ' ', middle_name, ';') \n" +
                                        "  as full_name\n" +
                                        "from learndb2.employee\n" +
                                        "order by full_name";

    //  04.05.2021 нет initcap mySql
    public static String convert_letter_case_2_9 = "select\n" +
                                "  lower(concat(last_name, ' ', first_name)) as lower ,\n" +
                                "  upper(concat(last_name, ' ', first_name)) as upper ,\n" +
//                                "  initcap(concat(last_name, ' ', first_name)) as initcap \n" +
                                "from learndb2.employee\n" +
                                "order by\n" +
                                "  last_name,\n" +
                                "  first_name";

    public static String lENGTH_3_9 = "select \n" +
                                        "  last_name ,\n" +
                                        "  length(last_name) as length  \n" +
                                        "from learndb2.employee\n" +
                                        "order by \n" +
                                        "  length desc,\n" +
                                        "  last_name ";

    public static String extracting_substring_4_9 = "select \n" +
                                "  employee_id ,\n" +
                                "  concat(last_name, ' ', left(first_name, 1), '.') as full_name \n" +
                                "from learndb2.employee\n" +
                                "order by \n" +
                                "  last_name,\n" +
                                "  first_name";

    public static String pOSITION_5_9 = "select \n" +
                                "  last_name, \n" +
                                "  left(last_name,position('а' in lower(last_name))) as substring \n" +
                                "from learndb2.employee \n" +
                                "order by last_name";

    public static String supplement_to_specific_length_6_9 = "select\n" +
                                " concat(last_name, ' ', rpad(left(first_name, 1), length(first_name),     \n" +
                                " '*')) as mask\n" +
                                "from learndb2.employee \n" +
                                "order by mask";
    // STOPSHIP: 04.05.2021 задание не совсем правильное, должен быть trim
    public static String tRIM_7_9 = "select\n" +
                                "   concat_ws(' ', last_name, first_name, middle_name) as full_name\n" +
                                "from learndb2.employee \n" +
                                "order by full_name";

    public static String rEPLACE_8_9 = "select\n" +
                                " replace(replace(address,'пр.', 'проспект'),'ул.','улица') \n" +
                                " as address_full \n" +
                                "from learndb2.store_address \n" +
                                "order by address_full ";
    // STOPSHIP: 04.05.2021 FUNCTION mysql.translate does not exist
    public static String tRANSLATE_9_9 = "select distinct\n" +
                                "  first_name ,\n" +
                                "  translate(first_name,     \n" +
                                "'АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЫЭЮЯабвгдеёжзийклмнопрстуфхцчшщыэюяЬЪьъ',\n" +
                                "'ABVGDEEJZIJKLMNOPRSTUFHCHSSYEYAabvgdeejzijklmnoprstufhchssyeya') \n" +
                                "  as first_name_translated \n" +
                                "from learndb2.employee \n" +
                                "order by first_name ";

}
