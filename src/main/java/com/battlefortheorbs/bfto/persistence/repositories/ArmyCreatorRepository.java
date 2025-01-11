package com.battlefortheorbs.bfto.persistence.repositories;

import com.battlefortheorbs.bfto.persistence.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArmyCreatorRepository extends JpaRepository<TestEntity, UUID> {

}
