package com.game.starcraft.core.building;

@FunctionalInterface
public interface DefenseBuilding<Race> extends Building<Race> {

    <T> int attack(T target);
}
