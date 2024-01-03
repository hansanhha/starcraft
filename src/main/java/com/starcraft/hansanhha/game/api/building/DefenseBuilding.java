package com.starcraft.hansanhha.game.api.building;

@FunctionalInterface
public interface DefenseBuilding<Race> extends Building<Race> {

    <T> int attack(T target);
}
