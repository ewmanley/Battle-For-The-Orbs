package com.battlefortheorbs.bfto.persistence.dao;

import com.battlefortheorbs.bfto.persistence.entity.TestEntity;
import com.battlefortheorbs.bfto.persistence.repositories.ArmyCreatorRepository;
import com.battlefortheorbs.bfto.service.model.TestRequest;
import org.springframework.stereotype.Component;

@Component
public class ArmyCreater implements IArmyCreater{

    private final ArmyCreatorRepository armyCreatorRepository;

    public ArmyCreater(ArmyCreatorRepository armyCreatorRepository){
        this.armyCreatorRepository = armyCreatorRepository;
    }

    @Override
    public void addArmy(TestRequest test) {
        TestEntity testEntity = new TestEntity();
        testEntity.setTest(test.getTest());
        armyCreatorRepository.save(testEntity);
    }

}
