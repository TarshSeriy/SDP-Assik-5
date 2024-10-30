package org.example.Classes;

import org.example.Interfaces.CharacterState;
import org.example.Interfaces.FightingStrategy;
import org.example.Interfaces.EffectVisitor;

public class GameCharacter {
    private CharacterState currentState;
    private FightingStrategy fightingStrategy;
    private int attackPower;

    public GameCharacter(CharacterState initialState, FightingStrategy initialStrategy) {
        this.currentState = initialState;
        this.fightingStrategy = initialStrategy;
        this.attackPower = 10; // Начальная мощность атаки
    }

    public void performAttack() {
        currentState.attack(this); // Используйте this для передачи текущего объекта
        fightingStrategy.fight(this); // Вызов стратегии боя
    }

    public void accept(EffectVisitor visitor) {
        visitor.applyBoost(this); // Используйте this для передачи текущего объекта
    }

    public void increaseAttackPower(int amount) {
        this.attackPower += amount;
        System.out.println("Attack power increased to: " + this.attackPower);
    }

    public void setCurrentState(CharacterState newState) {
        this.currentState = newState;
        System.out.println("Character state changed.");
    }

    public int getAttackPower() {
        return attackPower;
    }

    // Другие методы и геттеры/сеттеры
}
