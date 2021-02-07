package com.company;

public class Boss extends CameEntity{
    Weapon knife=new Weapon();

    public Weapon getKnife() {
        return knife;
    }

    public void setKnife(Weapon knife) {
        this.knife = knife;
    }
}
