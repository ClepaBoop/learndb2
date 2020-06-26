package data;

import java.util.ArrayList;

public class FillingTables {



    public static ArrayList<String> FillingTables(){
        ArrayList <String> list = new ArrayList<>();

        list.add("insert learndb2.timezone (time_offset) values (\"UTS+2\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+3\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+4\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+5\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+6\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+7\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+8\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+10\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+1\")");
        list.add("insert learndb2.timezone (time_offset) values (\"UTS+9\")");

        list.add("insert learndb2.city (name, timezone_id) values (\"Moscow\", 2)");
        list.add("insert learndb2.city (name, timezone_id) values (\"St. Petersburg\t\", 2)");
        list.add("insert learndb2.city (name, timezone_id) values (\"Novosibirsk\", 5)");
        list.add("insert learndb2.city (name, timezone_id) values (\"Vladivostok\", 8)");
        list.add("insert learndb2.city (name, timezone_id) values (\"Ufa\", 4)");
        list.add("insert learndb2.city (name, timezone_id) values (\"Kaliningrad\", 1)");
        list.add("insert learndb2.city (name, timezone_id) values (\"Kemerovo\", 6)");
        list.add("insert learndb2.city (name, timezone_id) values (\"Samara\", 3)");
        list.add("insert learndb2.city (name, timezone_id) values (\"Barnaul\", 5)");
        list.add("insert learndb2.city (name, timezone_id) values (\"Irkutsk\", 7)");

        list.add("insert learndb2.store (store_id, name, site_url) values (100, \"Pioner\", \"pioner.ru\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (200, \"Mars\", \"mars.ru\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (300, \"Adalin\", \"adalin.ru\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (400, \"Europe\", \"evropa.ru\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (500, \"March\", \"mart.ru\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (600, \"Umi\", \"\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (800, \"Uneversam\", \"\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (900, \"Big\", \"big.ru\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (201, \"Saturn\", \"saturn\" )");
        list.add("insert learndb2.store (store_id, name, site_url) values (301, \"Adalin-family\", \"adalin-ultra.ru\" )");
        list.add("insert learndb2.store  (store_id, name, site_url) values (302, \"Adalin-ultra.ru\", \"\" )");

        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (10, 100, 1, \"st. Arbat, 20\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(495)312-03-08\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (11, 100, 1, \"st. Builders, 124\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(495)312-03-08\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (12, 100, 5, \"Lenin Ave., 42\", \"Mon-Fri.: From 08: 00-18: 00\", \"7(495)312-03-08\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (20, 200, 2, \"st. Kazan, 43\", \"Mon-Fri.: From 08: 00-16: 00\", \"7(812)700-03-03\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (30, 300, 3, \"st. Lenin, 18\", \"Mon-Fri.: From 07: 00-19: 00\", \"7(383)568-03-03\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (40, 400, 4, \"st. Mira, 12\", \"\", \"\t7(423)568-53-88\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (50, 500, 5, \"st. Liberty 50\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(347)668-56-66\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (60, 600, 6, \"st. Suvorova, 11\", \"Mon-Fri.: From 10: 00-22: 00\", \"\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (61, 600, 6, \"st. Chkalova, 42\", \"Mon-Fri.: From 08: 00-20: 00\", \"\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (80, 800, 8, \"st. Michurina, 60\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(846)000-54-44\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (90, 900, 9, \"st. Lazurnaya, 79\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(385)777-77-07\" )");
        list.add("insert learndb2.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (21, 201, 2, \"st. Sedova, 33\", \"Mon-Fri.: From 09: 00-17: 00\", \"\" )");

        list.add("insert learndb2.category (parent_category_id, name) values (null, \"Household products\")");
        list.add("insert learndb2.category (parent_category_id, name) values (null, \"Digital technology\")");
        list.add("insert learndb2.category (parent_category_id, name) values (1, \"Appliances\")");
        list.add("insert learndb2.category (parent_category_id, name) values (2, \"Laptops & Accessories\")");
        list.add("insert learndb2.category (parent_category_id, name) values (2, \"Cameras\")");
        list.add("insert learndb2.category (parent_category_id, name) values (2, \"Game consoles\")");
        list.add("insert learndb2.category (parent_category_id, name) values (2, \"Audio equipment\")");
        list.add("insert learndb2.category (parent_category_id, name) values (2, \"Cell Phones\")");
        list.add("insert learndb2.category (parent_category_id, name) values (4, \"Laptops\")");
        list.add("insert learndb2.category (parent_category_id, name) values (4, \"Rucksacks\")");

        list.add("insert learndb2.product (category_id, name, description) values (3, \"\tA vacuum cleaner S6\", \"1400 wt\")");
        list.add("insert learndb2.product (category_id, name, description) values (3, \"Refrigerator A2\t\", \"No frost\")");
        list.add("insert learndb2.product (category_id, name, description) values (6, \"Nintendo\t\", \"500 GB\")");
        list.add("insert learndb2.product (category_id, name, description) values (6, \"PlayStation\", \"\t800 GB\")");
        list.add("insert learndb2.product (category_id, name, description) values (6, \"Xbox\", \"\")");
        list.add("insert learndb2.product (category_id, name, description) values (7, \"Headphones S3\", \"\tWireless\")");
        list.add("insert learndb2.product (category_id, name, description) values (10, \"\tDeepbox\", \"Nylon\")");
        list.add("insert learndb2.product (category_id, name, description) values (8, \"Slider B3\", \"\t1 sim\")");
        list.add("insert learndb2.product (category_id, name, description) values (8, \"Monoblock C4\", \"\t2 sim\")");
        list.add("insert learndb2.product (category_id, name, description) values (9, \"Ultrabook X5\", \"15 inches\")");
        list.add("insert learndb2.product (category_id, name, description) values (5, \"\tLord Nikon 95\", \"\t100 megapixe\")");
        list.add("insert learndb2.product (category_id, name, description) values (5, \"\tNikon D750\", \"\t24.93Mpix\")");

        list.add("insert learndb2.product_price (product_id, store_id, price) values (1, 300, 10500.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (10, 400, 75600.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (8, 400, 37000.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (4, 400, 20000.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (2, 500, 26100.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (3, 500, 22000.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (4, 500, 22000.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (5, 500, 23500.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (6, 500, 17800.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (8, 600, 38200.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (9, 600, 43800.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (10, 600, 76800.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (2, 600, 27500.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (1, 800, 12000.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (3, 800, 22100.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (4, 800, 21000.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (5, 800, 24600.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (11, 900, 1321800000.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (3, 201, 22900.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (4, 201, 21500.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (5, 201, 23500.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (6, 201, 17800.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (6, 301, 17900.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (1, 301, 12500.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (7, 301, 4900.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (8, 302, 38300.00)");
        list.add("insert learndb2.product_price (product_id, store_id, price) values (9, 302, 44500.00)");

        list.add("insert learndb2.rank (store_id, rank_id, name) values (100, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (100, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (100, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (200, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (200, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (200, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (300, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (300, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (400, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (400, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (500, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (500, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (500, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (600, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (600, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (600, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (800, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (800, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (900, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (900, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (900, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (201, \"CEO\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (201, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (201, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (301, \"DIRECTOR\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (301, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (301, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (302, \"GENERALMANAGER\", \"Direktor\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (302, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb2.rank (store_id, rank_id, name) values (302, \"SELLER\", \"Prodavec\")");

        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (100, \"CHIEF\", \"Alekse\", \"Ivanov\", \"Petrovich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"CHIEF\", \"Kenni\", \"Makkormik\", \"\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (400, \"CHIEF\", \"Anna\", \"Matveeva\", \"Igorevna\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (500, \"CHIEF\", \"Roman\", \"Shmidt\", \"Sergeevich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"CHIEF\", \"Viktor\", \"Suhorukov\", \"Vitalevich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (800, \"CHIEF\", \"Svetlana\", \"Nemcova\", \"Leonidovna\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"CHIEF\", \"Olga\", \"Vershinina\", \"Olegovna\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"CEO\", \"Petr\", \"Korsakov\", \"Konstantinovich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (301, \"DIRECTOR\", \"Serge\", \"Antonov\", \"Kirillovich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"GENERALMANAGER\", \"Vlad\", \"Kontur\", \"Semenovich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (100, \"MANAGER\", \"Gleb\", \"Tarasov\", \"Avdeevich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"MANAGER\", \"Vladislav\", \"Kalashnikov\", \"kovovich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (300, \"MANAGER\", \"Vladislav\", \"Birkov\", \"kovovich\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (400, \"MANAGER\", \"Valeri\", \"Medvedev\", \"Antoninovich\", 3)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (500, \"MANAGER\", \"rik\", \"Kartman\", \"\", 4)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"MANAGER\", \"Nikola\", \"Vorobv\", \"Artmovich\", 5)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"MANAGER\", \"Miron\", \"Kalinin\", \"Ivanovich\", 5)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"MANAGER\", \"Vilen\", \"Kulakov\", \"Fedotovich\", 5)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (800, \"MANAGER\", \"Zinovi\", \"Belozrov\", \"Semnovich\", 6)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"MANAGER\", \"Pavel\", \"Avdeev\", \"kovovich\", 7)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"MANAGER\", \"Nikki\", \"Zaceva\", \"Aristarhovna\", 8)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (301, \"MANAGER\", \"Kristina\", \"Emelnova\", \"Alekseevna\", 9)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"MANAGER\", \"Dominika\", \"Timofeeva\", \"Fedotovna\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"MANAGER\", \"Marina\", \"Kondrateva\", \"Ivanovna\", 10)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (100, \"SELLER\", \"Lbov\", \"Blinova\", \"Lvovna\", 11)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"SELLER\", \"Natali\", \"Potapova\", \"Evseevna\", 12)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"SELLER\", \"Lili\", \"Rbova\", \"Leonidovna\", null)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (300, \"SELLER\", \"lza\", \"Odincova\", \"Alekseevna\", 13)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (500, \"SELLER\", \"Zarina\", \"Mironova\", \"Artemovna\", 15)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"SELLER\", \"Nina\", \"Dchkova\", \"Luknovna\", 16)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"SELLER\", \"Gleb\", \"Petrov\", \"Avdeevich\", 16)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"SELLER\", \"Miron\", \"Agafev\", \"Ivanovich\", 18)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"SELLER\", \"Lili\", \"Leonteva\", \"Leonidovna\", 20)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"SELLER\", \"lian\", \"Gromov\", \"Fedorovich\", 20)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"SELLER\", \"Terenti\", \"Burov\", \"Fedorovich\", 20)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Nina\", \"Kondrateva\", \"Leonidovna\", 21)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Lbomir\", \"Efremov\", \"Svtoslavovich\", 21)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Luka\", \"Dementev\", \"Olegovich\", 21)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (301, \"SELLER\", \"Vlas\", \"Suhanov\", \"Olegovich\", 22)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"duard\", \"Rogov\", \"Maksovich\", 23)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Terenti\", \"Moiseev\", \"Olegovich\", 23)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Arnold\", \"Nikiforov\", \"Olegovich\", 23)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"SELLER\", \"Martin\", \"Subbotin\", \"Stanislavovich\", 24)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"SELLER\", \"Piter\", \"Parker\", \"\", 24)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"SELLER\", \"Viktor\", \"Medvedev\", \"Anatolevich\", 24)");
        list.add("insert learndb2.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"SELLER\", \"Lev\", \"Odincova\", \"Sergeevich\", 24)");

        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-11T10:15:02.206\", 500, 29)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-10T10:12:34.206\", 900, 34)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-05T09:12:33.206\", 302, null)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-06T13:12:33.206\", 500, 15)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-07T14:22:43.206\", 301, 43)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-09T12:25:43.206\", 600, 32)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-13T15:10:43.206\", 302, null)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-07T12:23:43.206\", 100, 25)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-06T10:55:43.206\", 100, 25)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-01T12:15:43.206\", 600, 19)");
        list.add("insert learndb2.purchase (purchase_date, store_id, employee_id) values (\"2019-03-10T16:35:43.206\", 201, 8)");

        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (1, 6, 17800.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (1, 2, 26100.00, 30)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (2, 11, 1321800000.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (3, 8, 38300.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (3, 9, 44500.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (4, 5, 23500.00, 2)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (5, 7, 4900.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (6, 10, 76800.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (6, 9, 43800.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (6, 8, 38200.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (7, 8, 38300.00, 3)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (8, 3, 26100.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (9, 3, 26100.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (10, 2, 27500.00, 5)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (10, 10, 76800.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (10, 8, 38200.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (11, 4, 21500.00, 1)");
        list.add("insert learndb2.purchase_item (purchase_id, product_id, price, count) values (11, 12, 100000.00, 1)");

        
        return list;
    }

}
