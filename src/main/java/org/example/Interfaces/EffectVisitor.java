package org.example.Interfaces;

import org.example.Classes.GameCharacter;

public interface EffectVisitor {
    void applyBoost(GameCharacter character);
    void applyDamage(GameCharacter character);
}
