package com.battlefortheorbs.bfto.web.controllers;

import com.battlefortheorbs.bfto.service.model.TestRequest;
import com.battlefortheorbs.bfto.web.dto.CreateArmyRQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Replace with your frontend origin
public class ArmyInstallerController {

    @Autowired
    CreateArmyRQ createArmyRQ;

    @PostMapping("/")
    public String testInput(@RequestBody TestRequest test){
        System.out.println(test.getTest());
        createArmyRQ.createArmy(test);
        return test.getTest();
    }
}
