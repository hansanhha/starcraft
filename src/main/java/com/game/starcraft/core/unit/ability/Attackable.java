package com.game.starcraft.core.unit.ability;

import com.game.starcraft.core.unit.specification.Unit;

@FunctionalInterface
public interface Attackable {

    /*
        지상 공격 유닛 -> 공중 유닛 공격 시 예외 발생 필요
     */
    <T> void attack(T target);
}
