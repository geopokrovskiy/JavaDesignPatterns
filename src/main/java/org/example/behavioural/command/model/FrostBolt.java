package org.example.behavioural.command.model;

public class FrostBolt implements Spell{
    private SpellBook spellBook;
    public FrostBolt(SpellBook spellBook) {
        this.spellBook = spellBook;
    }
    @Override
    public void castSpell() {
        spellBook.frostBolt();
    }
}
