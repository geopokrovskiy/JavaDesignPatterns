package org.example.behavioural.command.model;

public class SummonServitor implements Spell{
    private SpellBook spellBook;

    public SummonServitor(SpellBook spellBook) {
        this.spellBook = spellBook;
    }
    @Override
    public void castSpell() {
        spellBook.summonServitor();
    }
}
