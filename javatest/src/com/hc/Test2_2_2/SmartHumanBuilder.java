package com.hc.Test2_2_2;

public class SmartHumanBuilder implements HumanBuilder{
    Human human;
    public SmartHumanBuilder(){
        human = new Human();
    }

    @Override
    public void headbuilder() {
        human.setHead("高智商");
    }

    @Override
    public void bodybuilder() {
        human.setBody("新的身体");
    }

    @Override
    public void handbuilder() {
        human.setHand("新的双手");
    }

    @Override
    public void footbuilder() {
       human.setFoot("新的双脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
