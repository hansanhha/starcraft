package com.game.starcraft.core.resource;

import java.util.Optional;

public class Mineral implements Resource<Mineral> {

    private static final int mineMineral = 8;
    private int totalMineral;

    public Mineral(int totalMineral) {
        this.totalMineral = totalMineral;
    }

    @Override
    public Optional<Mineral> mine() {
        if (mineMineral - totalMineral < 0) {
            return Optional.empty();
        }

        totalMineral -= mineMineral;
        return Optional.of(this);
    }

}
