package com.starcraft.hansanhha.game.api.resource;

import java.util.Optional;

public interface Resource<T extends Resource<T>> {

    Optional<T> mine();

    private void destroy() {

    }
}
