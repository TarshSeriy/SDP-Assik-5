package org.example.Classes.CharacterStates;

import org.example.Classes.GameCharacter;
import org.example.Interfaces.CharacterState;

public class DefeatedState implements CharacterState {
    @Override
    public void attack(GameCharacter character) {
        System.out.println("Character is defeated and cannot attack.");
        // Возможно, добавьте дополнительную логику
    }
}

