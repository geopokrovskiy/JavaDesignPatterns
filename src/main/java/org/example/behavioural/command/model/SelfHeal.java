package org.example.behavioural.command.model;

public class SelfHeal implements Spell{
    private SpellBook spellBook;
    public SelfHeal(SpellBook spellBook) {
        this.spellBook = spellBook;
    }
    @Override
    public void castSpell() {
        spellBook.selfHeal();
    }
}
