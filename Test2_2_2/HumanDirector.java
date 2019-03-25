package com.hc.Test2_2_2;

/**
 * 装配者
 */
public class HumanDirector {
    public Human SmartHumanDirector(HumanBuilder humanBuilder){
        humanBuilder.headbuilder();
        humanBuilder.bodybuilder();
        humanBuilder.handbuilder();
        humanBuilder.footbuilder();
        return humanBuilder.createHuman();
    }
}
