package com.starcraft.hansanhha.game.api.unit.ability;

import com.starcraft.hansanhha.game.api.resource.Gas;
import com.starcraft.hansanhha.game.api.resource.Mineral;
import com.starcraft.hansanhha.game.api.unit.specification.*;

public interface Unit<Race> {

    Hp getHp();

    Damage getDamage();

    Armor getArmor();

    Mineral getMineralCost();

    Gas getGasCost();

    BuildTime getBuildTime();

    SupplyCost getSupplyCost();

    AttackSpeed getAttackSpeed();
}
