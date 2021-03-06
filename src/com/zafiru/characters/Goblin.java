package com.zafiru.characters;

import com.zafiru.observables.Health;
import com.zafiru.observers.HealthBar;

public class Goblin extends ICharacter {

    public Goblin(){
        setType("Goblin");
        setHealth(new Health(60));
        getHealth().addObserver(new HealthBar(getType()));
    }
}
