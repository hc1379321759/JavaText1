package com.hc.Test2_2_2;

public class Test {
    public static void main(String[] args) {
        HumanDirector humanDirector = new HumanDirector();
        Human human = humanDirector.SmartHumanDirector(new SmartHumanBuilder());
        System.out.println(human);
        System.out.println(human.getHead());
        System.out.println(human.getBody());
        System.out.println(human.getHand());
        System.out.println(human.getFoot());

    }
}
