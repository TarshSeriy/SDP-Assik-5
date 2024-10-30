package org.example.Classes.CharacterStates;

import org.example.Classes.GameCharacter;
import org.example.Interfaces.CharacterState;

public class PoweredUpState implements CharacterState {
    @Override
    public void attack(GameCharacter character) {
        System.out.println("Character is powered up!");
        character.increaseAttackPower(5); // Увеличиваем мощность атаки
        // Добавьте сюда логику атаки
    }
}

