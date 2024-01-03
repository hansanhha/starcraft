package com.starcraft.hansanhha.game.protoss.unit;

import com.starcraft.hansanhha.game.api.Protoss;
import com.starcraft.hansanhha.game.api.building.Building;
import com.starcraft.hansanhha.game.api.building.Townhall;
import com.starcraft.hansanhha.game.api.resource.Gas;
import com.starcraft.hansanhha.game.api.resource.Mineral;
import com.starcraft.hansanhha.game.api.unit.Worker;
import com.starcraft.hansanhha.game.api.unit.ability.ShieldUnit;
import com.starcraft.hansanhha.game.api.unit.specification.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.context.annotation.Profile;

import java.util.function.BiFunction;

@Profile("protoss")
@ConfigurationProperties(prefix = "protoss.probe")
public class Probe extends Worker<Protoss> implements ShieldUnit {

    private final Shield shield;

    @ConstructorBinding
    public Probe(Hp hp, Armor armor, Damage damage, Shield shield, Mineral mineralCost, Gas gasCost, BuildTime buildTime, SupplyCost supplyCost, AttackSpeed attackSpeed, Townhall<Protoss> townhall) {
        super(hp, armor, damage, mineralCost, gasCost, buildTime, supplyCost, attackSpeed, townhall);
        this.shield = shield;
    }

    @Override
    public Building<Protoss> build(BiFunction<Mineral, Gas, Building<Protoss>> building) {

        return building.apply(mineralCost, gasCost);
    }

    @Override
    public Shield getShield() {
        return shield;
    }
}
