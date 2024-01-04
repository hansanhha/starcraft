package com.game.starcraft.core.building;

import com.game.starcraft.core.building.specification.BuildingHp;
import com.game.starcraft.core.resource.Gas;
import com.game.starcraft.core.resource.Mineral;
import com.game.starcraft.core.unit.specification.BuildTime;

public interface Building {

    BuildingHp getBuildingHp();

    Mineral getMineralCost();

    Gas getGasCost();

    BuildTime getBuildTime();

}
