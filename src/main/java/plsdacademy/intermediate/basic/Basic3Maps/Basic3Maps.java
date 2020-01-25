package plsdacademy.intermediate.basic.Basic3Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basic3Maps {
    public static void main(String[] args) {


        String[] array = new String[]{"abc", "abc", "efghijk", "abc", "lmnopr",
                "st", "abc", "u", "vwxyz", "st", "lmnopr", "st", "u", "vwxyz"};

//        HashMap<String, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < array.length ; i++) {
//            if(hashMap.containsKey(array[i])){

//
//
//            }
//        }
//                System.out.println(hashMap);
//


        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("abc", 4);
        hashMap.put("efghijk", 1);
        hashMap.put("lmnopr", 2);
        hashMap.put("st", 3);
        hashMap.put("u", 2);
        hashMap.put("vwxyz", 2);


        System.out.println(hashMap.toString());
        System.out.println(hashMap.toString());
        System.out.println(hashMap.toString());

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("abc", 4);
        linkedHashMap.put("efghijk", 1);
        linkedHashMap.put("lmnopr", 2);
        linkedHashMap.put("st", 3);
        linkedHashMap.put("u", 2);
        linkedHashMap.put("vwxyz", 2);

        System.out.println(linkedHashMap.toString());
        System.out.println(linkedHashMap.toString());
        System.out.println(linkedHashMap.toString());

        System.out.println("----------------------");

        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        for (int i = 0; i < hashMap.size(); i++) {

            System.out.println(hashMap.keySet() + "->" + hashMap.values());


        }


    }


}
