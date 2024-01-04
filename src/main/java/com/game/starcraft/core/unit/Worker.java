package com.game.starcraft.core.unit;

import com.game.starcraft.core.building.Townhall;
import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.GatherStatus;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.resource.Resource;
import com.game.starcraft.core.unit.ability.Buildable;
import com.game.starcraft.core.unit.ability.Gatherable;
import com.game.starcraft.core.unit.specification.Unit;
import com.game.starcraft.core.unit.specification.*;
import lombok.Setter;

import java.util.Optional;

public abstract class Worker implements Buildable, Gatherable {

    protected GatherStatus gatherStatus = GatherStatus.STOPPED;
    @Setter
    protected Townhall townhall;

    public Worker(Townhall townhall) {
        this.townhall = townhall;
    }

    @Override
    public void gatherMinerals(Resource<Mineral> mineral) {
        Optional<Mineral> mineMineral = mineral.mine();

        if (mineMineral.isPresent()) {
            townhall.increaseMineral(mineMineral.get());
        } else {
            setGatherStatus(GatherStatus.STOPPED);
        }

    }

    @Override
    public void gatherGas(Resource<Gas> gas) {
        Optional<Gas> mineGas = gas.mine();

        if (mineGas.isPresent()) {
            townhall.increaseGas(mineGas.get());
        } else {
            setGatherStatus(GatherStatus.STOPPED);
        }
    }

    @Override
    public GatherStatus getGatherStatus() {
        return this.gatherStatus;
    }

    @Override
    public void setGatherStatus(GatherStatus status) {
        this.gatherStatus = status;
    }

}
