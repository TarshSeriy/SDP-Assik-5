package org.example.Classes.Effects;

import org.example.Classes.GameCharacter;
import org.example.Interfaces.EffectVisitor;

public class BoostVisitor implements EffectVisitor {
    @Override
    public void applyBoost(GameCharacter character) {
        character.increaseAttackPower(5);
        System.out.println("Boost applied!");
    }

    @Override
    public void applyDamage(GameCharacter character) {
        // Реализация применения урона, если необходимо
    }
}

