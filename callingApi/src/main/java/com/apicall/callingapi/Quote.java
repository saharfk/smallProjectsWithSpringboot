package com.apicall.callingapi;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@RestController
public class Quote {
    @GetMapping(value = "/countries")
    public List<Object> getcountries() {
        String url = "https://restcountries.eu/rest/v2/all";
        RestTemplate restTemplate = new RestTemplate();
        Object[] countries = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(countries);
    }

//    you should call "http://localhost:8082/basicCall" in postman
    @GetMapping(value = "/basicCall")
    private List<Object> basicCall() {
        String url = "http://localhost:8081/api/user";
        RestTemplate restTemplate = new RestTemplate();
        JSONObject result = restTemplate.getForObject(url, JSONObject.class);
        return Arrays.asList(result);
    }

}

