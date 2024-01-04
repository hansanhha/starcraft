package com.game.starcraft.core;

import com.game.starcraft.core.building.Building;
import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.specification.Unit;

import java.util.List;

public interface TheStarcraft {

    void increaseMineral();

    void increaseGas();

    void increaseMaxSupply();

    Mineral getContainMineral();

    Gas getContainGas();

    Supply getMaxSupply();

    /*
        * 중복 유닛 추가 시 예외 발생 필요
        * 인구수 초과 시 예외 발생 필요
     */
    void addUnit(Unit unit);

    /*
        * 해당 지역에 존재하는 유닛 전체 반환
     */
    List<Unit> getAllUnit();

    /*
        * 부대 지정 유닛 반환
        * 0 ~ 9까지만 가능
     */
    List<Unit> getGroupUnit(int controlGroupNumber);

    /*
        * 유닛 선택 시 해당 유닛 반환
        * 각 유닛마다 고유한 번호를 할당해서 식별
     */
    List<Unit> getUnit(int unitNumber);

    /*
        * 중복 건물 추가 시 예외 발생 필요
     */
    void addBuilding(Building building);

}
