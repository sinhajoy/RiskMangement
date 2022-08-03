package com.RiskMangement.Task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditScoreController {

    @GetMapping("/reg/{id}")
    public boolean getDocument(@PathVariable int id) {
        if(id>820){
            return true;
        }
        else{
            return false;
        }
    }
}
