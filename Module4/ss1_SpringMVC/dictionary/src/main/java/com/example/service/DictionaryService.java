package com.example.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService{
    private static Map<String,String> engMap = new HashMap<>();

    static {
        engMap.put("mouse", "chuột");
        engMap.put("cat", "mèo");
        engMap.put("dog", "chó");
        engMap.put("tiger", "hổ");
        engMap.put("lion", "sư tử");
    }
    @Override
    public String searchString(String eng) {
        if (engMap.containsKey(eng)){
            return engMap.get(eng);
        }
        return "không Tìm Được từ Khóa phù hợp";
    }
}
