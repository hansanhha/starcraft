package com.game.starcraft.core.unit;

import com.game.starcraft.core.building.Townhall;
import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.GatherStatus;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.resource.Resource;
import com.game.starcraft.core.unit.ability.Buildable;
import com.game.starcraft.core.unit.ability.Gatherable;
import com.game.starcraft.core.unit.ability.Unit;
import com.game.starcraft.core.unit.specification.*;
import lombok.Setter;

import java.util.Optional;

public abstract class Worker<Race> implements Buildable<Race>, Gatherable, Unit<Race> {

    protected final Hp hp;
    protected final Armor armor;
    protected final Damage damage;
    protected final Mineral mineralCost;
    protected final Gas gasCost;
    protected final BuildTime buildTime;
    protected final SupplyCost supplyCost;
    protected final AttackSpeed attackSpeed;

    protected GatherStatus gatherStatus = GatherStatus.STOPPED;
    @Setter
    protected Townhall<Race> townhall;

    public Worker(Hp hp, Armor armor, Damage damage, Mineral mineralCost, Gas gasCost, BuildTime buildTime, SupplyCost supplyCost, AttackSpeed attackSpeed, Townhall<Race> townhall) {
        this.hp = hp;
        this.armor = armor;
        this.damage = damage;
        this.mineralCost = mineralCost;
        this.gasCost = gasCost;
        this.buildTime = buildTime;
        this.supplyCost = supplyCost;
        this.attackSpeed = attackSpeed;
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
    public Hp getHp() {
        return this.hp;
    }

    @Override
    public Damage getDamage() {
        return this.damage;
    }

    @Override
    public Armor getArmor() {
        return this.armor;
    }


    @Override
    public Mineral getMineralCost() {
        return this.mineralCost;
    }

    @Override
    public Gas getGasCost() {
        return this.gasCost;
    }

    @Override
    public BuildTime getBuildTime() {
        return this.buildTime;
    }

    @Override
    public SupplyCost getSupplyCost() {
        return this.supplyCost;
    }

    @Override
    public AttackSpeed getAttackSpeed() {
        return this.attackSpeed;
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
