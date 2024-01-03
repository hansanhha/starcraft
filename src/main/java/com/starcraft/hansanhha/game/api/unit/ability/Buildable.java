package com.starcraft.hansanhha.game.api.unit.ability;

import com.starcraft.hansanhha.game.api.building.Building;
import com.starcraft.hansanhha.game.api.resource.Gas;
import com.starcraft.hansanhha.game.api.resource.Mineral;

import java.util.function.BiFunction;

@FunctionalInterface
public interface Buildable<Race> {

    Building<Race> build(BiFunction<Mineral, Gas, Building<Race>> building);
}
