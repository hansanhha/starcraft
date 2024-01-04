package com.game.starcraft.core.unit.ability;


import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.GatherStatus;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.resource.Resource;

public interface Gatherable {

    void gatherMinerals(Resource<Mineral> mineral);

    void gatherGas(Resource<Gas> gas);

    void setGatherStatus(GatherStatus status);

    GatherStatus getGatherStatus();

}
