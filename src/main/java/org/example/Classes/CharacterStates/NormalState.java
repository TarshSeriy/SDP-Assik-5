package org.example.Classes.CharacterStates;

import org.example.Classes.GameCharacter;
import org.example.Interfaces.CharacterState;

public class NormalState implements CharacterState {
    @Override
    public void attack(GameCharacter character) {
        System.out.println("Character is in normal state.");
        // Логика атаки
    }
}
