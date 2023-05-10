package org.example.behavioural.command;

import org.example.behavioural.command.model.*;

public class Battlefield {


    public static void main(String[] args) {
        SpellBook spellBook = new SpellBook();

        FrostBolt frostBolt = new FrostBolt(spellBook);
        FireBall fireBall = new FireBall(spellBook);
        SelfHeal selfHeal = new SelfHeal(spellBook);
        SummonServitor summonServitor = new SummonServitor(spellBook);

        Wizard wizard = new Wizard(fireBall, frostBolt, selfHeal, summonServitor);

        wizard.castSummonServitor();
        wizard.castFireBall();
        wizard.castFireBall();
        wizard.castFrostBolt();
        wizard.castFrostBolt();
        wizard.castSelfHeal();
        wizard.castFireBall();
        wizard.castFireBall();
    }
}
