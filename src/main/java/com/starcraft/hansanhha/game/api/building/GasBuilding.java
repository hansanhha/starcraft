package com.starcraft.hansanhha.game.api.building;

import com.starcraft.hansanhha.game.api.resource.Gas;
import com.starcraft.hansanhha.game.api.unit.Worker;

@FunctionalInterface
public interface GasBuilding<Race> extends Building<Race> {

    Gas produce(Worker<Race> worker);
}
