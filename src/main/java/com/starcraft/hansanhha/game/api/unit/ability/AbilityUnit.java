package com.starcraft.hansanhha.game.api.unit.ability;

import com.starcraft.hansanhha.game.api.unit.specification.Mp;

public interface AbilityUnit extends Unit {

    Mp getMp();

    void action(Mp mp);
}
