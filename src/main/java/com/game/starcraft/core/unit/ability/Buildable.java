package com.game.starcraft.core.unit.ability;

import com.game.starcraft.core.building.Building;
import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;

import java.util.function.BiFunction;

@FunctionalInterface
public interface Buildable<Race> {

    Building<Race> build(BiFunction<Mineral, Gas, Building<Race>> building);
}
