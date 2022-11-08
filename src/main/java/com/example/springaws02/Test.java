//package com.example.springaws02;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.commons.lang3.StringUtils;
//
//import java.util.Objects;
//
//public class Test {
//
//    public static void main(String[] args) {
//        System.out.println(StringUtils.leftPad("073", 3, "0"));
//        String a = null;
//        var json = new ObjectMapper().createObjectNode();
//        json.put("a", a);
//        var jsonNode = new ObjectMapper().convertValue(null, JsonNode.class);
//        System.out.println(jsonNode);
//        System.out.println(Objects.isNull(jsonNode.get("a")));
//    }
//}
