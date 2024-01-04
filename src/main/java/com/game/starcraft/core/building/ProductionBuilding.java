package com.game.starcraft.core.building;

import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.specification.Unit;

public interface ProductionBuilding extends Building {

    Unit produce(Mineral mineral, Gas gas);
}
