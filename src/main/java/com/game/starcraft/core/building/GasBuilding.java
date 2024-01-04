package com.game.starcraft.core.building;

import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.unit.Worker;

public interface GasBuilding extends Building {

    Gas produce(Worker worker);
}
