import org.example.Classes.Actions.AttackAction;
import org.example.Classes.Actions.DefendAction;
import org.example.Classes.Actions.HealAction;
import org.example.Classes.CharacterStates.NormalState;
import org.example.Classes.CharacterStates.PoweredUpState;
import org.example.Classes.Effects.BoostVisitor;
import org.example.Classes.Effects.DamageVisitor;
import org.example.Classes.FightingStrategies.MeleeStrategy;
import org.example.Classes.GameCharacter;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter(new NormalState(), new MeleeStrategy());

        System.out.println("Initial action:");
        AttackAction attackAction = new AttackAction();
        attackAction.executeAction(character);

        System.out.println("\nApplying boost effect:");
        BoostVisitor boostVisitor = new BoostVisitor();
        character.accept(boostVisitor);

        System.out.println("\nSwitching to powered-up state:");
        character.setCurrentState(new PoweredUpState());
        attackAction.executeAction(character);

        System.out.println("\nPerforming heal action:");
        HealAction healAction = new HealAction();
        healAction.executeAction(character);

        System.out.println("\nDefending action:");
        DefendAction defendAction = new DefendAction();
        defendAction.executeAction(character);

        System.out.println("\nApplying damage effect:");
        DamageVisitor damageVisitor = new DamageVisitor();
        character.accept(damageVisitor);
    }
}


