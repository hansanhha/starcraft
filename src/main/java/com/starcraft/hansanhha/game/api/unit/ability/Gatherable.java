package com.starcraft.hansanhha.game.api.unit.ability;

import com.starcraft.hansanhha.game.api.resource.Gas;
import com.starcraft.hansanhha.game.api.resource.GatherStatus;
import com.starcraft.hansanhha.game.api.resource.Mineral;
import com.starcraft.hansanhha.game.api.resource.Resource;

public interface Gatherable {

    void gatherMinerals(Resource<Mineral> mineral);

    void gatherGas(Resource<Gas> gas);

    void setGatherStatus(GatherStatus status);

    GatherStatus getGatherStatus();

}
