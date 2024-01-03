package com.starcraft.hansanhha.game.api.building;

import com.starcraft.hansanhha.game.api.unit.ability.Unit;
import com.starcraft.hansanhha.game.api.resource.Gas;
import com.starcraft.hansanhha.game.api.resource.Mineral;

@FunctionalInterface
public interface ProductionBuilding<Race> extends Building<Race> {

    <T extends Unit<Race>>  Unit<Race> produce(Mineral mineral, Gas gas);
}
