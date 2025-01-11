package com.battlefortheorbs.bfto.web.dto;

import com.battlefortheorbs.bfto.service.model.TestRequest;
import com.battlefortheorbs.bfto.service.services.ICreateArmyService;
import org.springframework.stereotype.Component;

@Component
public class CreateArmyRQ {

    private final ICreateArmyService iCreateArmyService;

    public CreateArmyRQ(ICreateArmyService iCreateArmyService, ICreateArmyService iCreateArmyService1) {
        this.iCreateArmyService = iCreateArmyService1;
    }

    public void createArmy(TestRequest test){
        iCreateArmyService.createArmy(test);
    }
}
