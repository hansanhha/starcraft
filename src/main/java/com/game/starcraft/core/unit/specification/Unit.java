package com.game.starcraft.core.unit.specification;


import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.specification.*;

public interface Unit {

    Hp getHp();

    Damage getDamage();

    Armor getArmor();

    Mineral getMineralCost();

    Gas getGasCost();

    BuildTime getBuildTime();

    SupplyCost getSupplyCost();

    AttackSpeed getAttackSpeed();

    Coordinate getCoordinate();
}
