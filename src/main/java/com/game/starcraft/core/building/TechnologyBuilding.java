package com.game.starcraft.core.building;

@FunctionalInterface
public interface TechnologyBuilding<Race> extends Building<Race> {

    void upgrade();
}
