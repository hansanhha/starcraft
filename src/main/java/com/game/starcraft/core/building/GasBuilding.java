package com.game.starcraft.core.building;

import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.unit.Worker;

@FunctionalInterface
public interface GasBuilding<Race> extends Building<Race> {

    Gas produce(Worker<Race> worker);
}
