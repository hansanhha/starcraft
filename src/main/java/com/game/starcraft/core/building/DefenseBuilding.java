package com.game.starcraft.core.building;

public interface DefenseBuilding extends Building {

    /*
        * 공격할 수 없는 건물은 0을 반환하거나 메서드 호출 전 가능 여부 판단 필요
     */
    <T> void attack(T target);
}
