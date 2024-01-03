package com.starcraft.hansanhha.game.api.resource;

import java.util.Optional;

public class Gas implements Resource<Gas> {

    private static final int mineGas = 8;
    private int totalGas;

    public Gas(int totalGas) {
        this.totalGas = totalGas;
    }

    @Override
    public Optional<Gas> mine() {
        if (mineGas - totalGas < 0) {
            return Optional.empty();
        }

        totalGas -= mineGas;
        return Optional.of(this);
    }
}
