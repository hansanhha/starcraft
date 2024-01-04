package com.game.starcraft.impl.protoss.building;

import com.game.starcraft.core.Protoss;
import com.game.starcraft.core.building.Townhall;
import com.game.starcraft.core.building.specification.BuildingHp;
import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.Worker;
import com.game.starcraft.core.unit.specification.BuildTime;

public class Nexus implements Townhall<Protoss> {


    @Override
    public Worker<Protoss> produce() {
        return null;
    }

    @Override
    public void increaseMineral(Mineral mineral) {

    }

    @Override
    public void increaseGas(Gas gas) {

    }

    @Override
    public BuildingHp getBuildingHp() {
        return null;
    }

    @Override
    public Mineral getMineralCost() {
        return null;
    }

    @Override
    public Gas getGasCost() {
        return null;
    }

    @Override
    public BuildTime getBuildTime() {
        return null;
    }

}
