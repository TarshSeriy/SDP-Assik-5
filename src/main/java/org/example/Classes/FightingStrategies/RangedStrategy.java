package org.example.Classes.FightingStrategies;

import org.example.Interfaces.FightingStrategy;
import org.example.Classes.GameCharacter;

public class RangedStrategy implements FightingStrategy {
    @Override
    public void fight(GameCharacter character) {
        System.out.println("Ranged attack with power: " + character.getAttackPower());
        // Ваша логика боя
    }
}

