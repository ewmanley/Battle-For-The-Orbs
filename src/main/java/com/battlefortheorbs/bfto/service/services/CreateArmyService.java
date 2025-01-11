package com.battlefortheorbs.bfto.service.services;

import com.battlefortheorbs.bfto.persistence.dao.IArmyCreater;
import com.battlefortheorbs.bfto.service.model.TestRequest;
import org.springframework.stereotype.Service;

@Service
public class CreateArmyService implements ICreateArmyService{

    private final IArmyCreater iArmyCreater;

    public CreateArmyService(IArmyCreater iArmyCreater1){
        this.iArmyCreater = iArmyCreater1;
    }

    @Override
    public void createArmy(TestRequest test) {
        iArmyCreater.addArmy(test);
    }
}
