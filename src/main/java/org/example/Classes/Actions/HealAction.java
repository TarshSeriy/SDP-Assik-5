package org.example.Classes.Actions;
import org.example.Classes.GameCharacter;

public class HealAction extends GameAction {
    @Override
    public void executeAction(GameCharacter character) {
        System.out.println("Character is healing.");
        // Логика лечения
    }
}

