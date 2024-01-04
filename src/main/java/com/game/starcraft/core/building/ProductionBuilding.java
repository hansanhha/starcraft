package com.game.starcraft.core.building;

import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.ability.Unit;

@FunctionalInterface
public interface ProductionBuilding<Race> extends Building<Race> {

    <T extends Unit<Race>>  Unit<Race> produce(Mineral mineral, Gas gas);
}
