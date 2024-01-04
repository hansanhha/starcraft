package com.game.starcraft.core.unit.ability;


import com.game.starcraft.core.unit.specification.Mp;

public interface Abilitable {

    Mp getMp();

    void action(Mp mp);
}
