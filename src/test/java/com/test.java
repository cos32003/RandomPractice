package PracticeCoding;

import io.restassured.path.json.JsonPath;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//find the baseprice is more than 60


public class test {
    public static void main(String[] args) {
        String json = "{\n" +
                "  \"products\": [{\n" +
                "      \"code\": \"11111\",\n" +
                "      \"name\": \"game1\",\n" +
                "      \"baseproduct\": \"product1\",\n" +
                "      \"price\": {\n" +
                "          \"basePrice\": \"59\",\n" +
                "          \"currencyIso\": \"USD\"\n" +
                "          }\n" +
                "    },\n" +
                "    {\n" +
                "      \"code\": \"22222\",\n" +
                "      \"name\": \"game2\",\n" +
                "      \"baseproduct\": \"product2\",\n" +
                "      \"price\": {\n" +
                "          \"basePrice\": \"65\",\n" +
                "          \"currencyIso\": \"USD\"\n" +
                "          }\n" +
                "    },\n" +
                "    {\n" +
                "      \"code\": \"33333\",\n" +
                "      \"name\": \"game3\",\n" +
                "      \"baseproduct\": \"product1\",\n" +
                "      \"price\": {\n" +
                "          \"basePrice\": \"60\",\n" +
                "          \"currencyIso\": \"USD\"\n" +
                "          }\n" +
                "    },\n" +
                "    {\n" +
                "      \"code\": \"44444\",\n" +
                "      \"name\": \"game4\",\n" +
                "      \"baseproduct\": \"product1\",\n" +
                "      \"price\": {\n" +
                "          \"basePrice\": \"61\",\n" +
                "          \"currencyIso\": \"USD\"\n" +
                "          }\n" +
                "    },\n" +
                "    {\n" +
                "      \"code\": \"55555\",\n" +
                "      \"name\": \"game5\",\n" +
                "      \"baseproduct\": \"product2\",\n" +
                "      \"price\": {\n" +
                "          \"basePrice\": \"59\",\n" +
                "          \"currencyIso\": \"USD\"\n" +
                "          }\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        JsonPath jsonPath = new JsonPath(json);
        Map<String, Object> result1 = new HashMap<>();
        Map<String, String> result2 = new HashMap<>();
        List<Map<String, String>> groups = jsonPath.getList("products.findAll{ it.price.basePrice >= '60' }");
        for (Map<String, String> group : groups) {
            System.out.println(group);
            //String basePrice = ((Map<String, String>) group.get("price")).get("basePrice");

        }
        //System.out.print(groups);
//        for(Map<String, String> group : groups) {
//            if (group.get("baseproduct").equals("product1") ) {
//
//                    //System.out.print(group.get("baseproduct").size());
//
//                result1.put(group.get("code"),group.get("price.basePrice"));
//
//
//            }
//            else if(group.get("baseproduct").equals("product2")){
//                result2.put(group.get("code"),group.get("price.basePrice"));
//
//            }
//            else{
//                System.out.print("No product is more or equal 60");
//            }
//
//
//
//
//        }
//        System.out.println("BaseProduct product1 price is more or equal 60: " + result1.size());
//        System.out.println("BaseProduct product2 price is more or equal 60: " + result2.size());
//    }








    }



}
