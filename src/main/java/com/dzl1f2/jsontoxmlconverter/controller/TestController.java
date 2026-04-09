package com.dzl1f2.jsontoxmlconverter.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "API is working";
    }

    @PostMapping("/convert")
    public String convertJsonToXml(@RequestBody String json) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper.readTree(json);

        XmlMapper xmlMapper = new XmlMapper();

        return xmlMapper.writeValueAsString(jsonNode);
    }
}