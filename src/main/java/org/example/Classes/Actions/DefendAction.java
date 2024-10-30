package org.example.Classes.Actions;
import org.example.Classes.GameCharacter;

public class DefendAction extends GameAction {
    @Override
    public void executeAction(GameCharacter character) {
        System.out.println("Character is defending.");
        // Логика защиты
    }
}

