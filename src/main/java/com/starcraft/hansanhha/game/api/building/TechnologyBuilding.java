package com.starcraft.hansanhha.game.api.building;

@FunctionalInterface
public interface TechnologyBuilding<Race> extends Building<Race> {

    void upgrade();
}
