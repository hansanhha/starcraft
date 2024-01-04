package com.game.starcraft.core.resource;

import java.util.Optional;

public interface Resource<T extends Resource<T>> {

    Optional<T> mine();

}
