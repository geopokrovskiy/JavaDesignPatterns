package org.example.behavioural.command.model;

public class Wizard {
    Spell fireBall;
    Spell frostBolt;
    Spell selfHeal;
    Spell summonServitor;

    public Wizard(Spell fireBall, Spell frostBall, Spell selfHeal, Spell summonServitor) {
        this.fireBall = fireBall;
        this.frostBolt = frostBall;
        this.selfHeal = selfHeal;
        this.summonServitor = summonServitor;
    }

    public void castFireBall() {
        fireBall.castSpell();
    }

    public void castFrostBolt() {
        frostBolt.castSpell();
    }

    public void castSelfHeal() {
        selfHeal.castSpell();
    }

    public void castSummonServitor() {
        summonServitor.castSpell();
    }
}
