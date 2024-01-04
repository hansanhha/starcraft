package com.game.starcraft.core.building;

import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.Worker;
import com.game.starcraft.core.unit.specification.Unit;

public interface Townhall extends Building {

    Worker produce();

    void increaseMineral(Mineral mineral);

    void increaseGas(Gas gas);

}
