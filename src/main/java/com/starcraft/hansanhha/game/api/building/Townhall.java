package com.starcraft.hansanhha.game.api.building;

import com.starcraft.hansanhha.game.api.resource.Gas;
import com.starcraft.hansanhha.game.api.resource.Mineral;
import com.starcraft.hansanhha.game.api.unit.Worker;

public interface Townhall<Race> extends Building<Race> {

    Worker<Race> produce();

    void increaseMaxSupply();

    void increaseMineral(Mineral mineral);

    void increaseGas(Gas gas);

}
