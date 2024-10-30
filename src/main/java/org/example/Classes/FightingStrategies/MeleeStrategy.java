package org.example.Classes.FightingStrategies;

import org.example.Interfaces.FightingStrategy;
import org.example.Classes.GameCharacter;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public void fight(GameCharacter character) {
        System.out.println("Melee attack with power: " + character.getAttackPower());
        // Ваша логика боя
    }
}
