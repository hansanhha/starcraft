package com.game.starcraft.core.building;

public interface TechnologyBuilding extends Building {

    /*
        * 업그레이드 시 게임 전체 적용
     */
    void upgrade();
}
