package com.game.starcraft.core.resource;

import com.game.starcraft.core.unit.specification.Unit;

@FunctionalInterface
public interface ResourceConsumeHandler {

    <Race> boolean check(Mineral mineral, Gas gas, Unit<Race> unit);
}
