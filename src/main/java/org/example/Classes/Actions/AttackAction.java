package org.example.Classes.Actions;
import org.example.Classes.GameCharacter;

public class AttackAction extends GameAction {
    @Override
    public void executeAction(GameCharacter character) {
        character.performAttack();
    }
}

