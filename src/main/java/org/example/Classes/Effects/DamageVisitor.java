package org.example.Classes.Effects;

import org.example.Classes.GameCharacter;
import org.example.Interfaces.EffectVisitor;

public class DamageVisitor implements EffectVisitor {
    @Override
    public void applyDamage(GameCharacter character) {
        System.out.println("Applying damage to the character.");
        // Здесь можно уменьшить мощность атаки или добавить другую логику
    }

    @Override
    public void applyBoost(GameCharacter character) {
        // Реализация применения усиления, если необходимо
    }
}

