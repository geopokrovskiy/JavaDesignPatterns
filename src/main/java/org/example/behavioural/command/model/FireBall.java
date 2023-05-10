package org.example.behavioural.command.model;

public class FireBall implements Spell{
    private SpellBook spellBook;
    public FireBall(SpellBook spellBook) {
        this.spellBook = spellBook;
    }
    @Override
    public void castSpell() {
        spellBook.fireBall();
    }
}
