package com.mock.apimock;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping(value = "/user")
    public JSONObject jsonHi() {
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("code", 0);
        jsonObject.put("msg", "");
        jsonObject.put("status", 0);
        return jsonObject;

    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.OK)
//    public JSONObject heyYou(@Validated @RequestBody String user) {
//        JSONObject jsonObject = new JSONObject();
//        //Inserting key-value pairs into the json object
//        jsonObject.put("code", 0);
//        jsonObject.put("msg", "");
//        jsonObject.put("status", 0);
//        return jsonObject;
//    }
}
