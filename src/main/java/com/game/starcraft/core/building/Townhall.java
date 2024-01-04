package com.game.starcraft.core.building;

import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.Worker;

public interface Townhall<Race> extends Building<Race> {

    Worker<Race> produce();

    void increaseMaxSupply();

    void increaseMineral(Mineral mineral);

    void increaseGas(Gas gas);

}
