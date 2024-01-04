package com.game.starcraft.core.unit.ability;

import com.game.starcraft.core.unit.specification.Coordinate;

@FunctionalInterface
public interface Movable {

    void move(Coordinate coordinate);
}
