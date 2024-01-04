package com.game.starcraft.impl.protoss.unit;

import com.game.starcraft.core.Protoss;
import com.game.starcraft.core.building.Building;
import com.game.starcraft.core.building.Townhall;
import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.Worker;
import com.game.starcraft.core.unit.ability.ShieldUnit;
import com.game.starcraft.core.unit.specification.*;
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
